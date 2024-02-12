/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author David Sanchez Avila
 */
public class UsuariosController {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public Usuarios login(String correo) {
        Session sesion = sessionFactory.openSession();

        Query q = sesion.createQuery("FROM Usuarios WHERE email = :correo");
        q.setParameter("correo", correo);

        Usuarios usuario = (Usuarios) q.uniqueResult();
        
        return usuario;
    }
    
    public void registrarUsuario(String nombre, String apellidos, String correo, String password) {           
        Session sesion = sessionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        Usuarios nuevoUsuario = new Usuarios();
        
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setApellidos(apellidos);
        nuevoUsuario.setEmail(correo);
        nuevoUsuario.setPassword(password); 

        sesion.save(nuevoUsuario);
        tx.commit();
    }

    public List<Usuarios> obtenerUsuarios() {
        Session sesion = sessionFactory.openSession();

        Query q = sesion.createQuery("FROM Usuarios", Usuarios.class);
        List<Usuarios> listaUsuarios = q.getResultList();

        return listaUsuarios;
    }
}
