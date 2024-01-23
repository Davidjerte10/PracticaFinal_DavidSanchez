/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author Alumno
 */
public class UsuariosController {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public Usuarios login(String correo) {
        // Establecer conexión con la base de datos
        Session sesion = sessionFactory.openSession();

        Query q = sesion.createQuery("FROM Usuarios WHERE email = :correo");
        q.setParameter("correo", correo);

        Usuarios usuario = (Usuarios) q.uniqueResult();
        
        return usuario;
    }
}
