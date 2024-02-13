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
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author David Sanchez Avila
 */
public class UsuariosController {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    /**
     * Metodo que se encarga de el login
     * @param correo
     * @return usuario
     */
    public Usuarios login(String correo) {
        Session sesion = sessionFactory.openSession();

        Query q = sesion.createQuery("FROM Usuarios WHERE email = :correo");
        q.setParameter("correo", correo);

        Usuarios usuario = (Usuarios) q.uniqueResult();
        
        return usuario;
    }
    
    /**
     * Metodo que registra el usuario en la base de datos
     * @param nombre
     * @param apellidos
     * @param correo
     * @param password 
     */
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

    /**
     * Metodo que obtiene la lista de usuarios de la base de datos
     * @return lista usuarios
     */
    public List<Usuarios> obtenerUsuarios() {
        Session sesion = sessionFactory.openSession();

        Query q = sesion.createQuery("FROM Usuarios", Usuarios.class);
        List<Usuarios> listaUsuarios = q.getResultList();

        return listaUsuarios;
    }
    
    /**
     * Metodo que actualiza la contraseña en la base de datos
     * @param correo
     * @param nuevaPassword 
     */
    public void actualizarPassword(String correo, String nuevaPassword) {
        Session sesion = sessionFactory.openSession();

        Transaction tx = sesion.beginTransaction();

        Query q = sesion.createQuery("FROM Usuarios WHERE email = :correo");
        q.setParameter("correo", correo);

        Usuarios usuario = (Usuarios) q.uniqueResult();

        if (usuario != null) {
            // Actualizar la contraseña del usuario
            usuario.setPassword(BCrypt.hashpw(nuevaPassword, BCrypt.gensalt()));

            sesion.save(usuario);
            tx.commit();
        }
    }
}
