/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Monitores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 * 
 * @author David Sanchez Avila
 */
public class MonitoresController {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    /**
     * Metodo que devuelve la lista de monitores de la base de datos
     * @return lista monitores
     */
    public List<Monitores> obtenerMonitores() {
        Session sesion = sessionFactory.openSession();

        Query q = sesion.createQuery("FROM Monitores", Monitores.class);
        List<Monitores> listaMonitores = q.getResultList();

        return listaMonitores;
    }
}
