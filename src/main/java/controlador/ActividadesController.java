/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Actividades;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author David Sanchez Avila
 */
public class ActividadesController {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    /**
     * Metodo que obtiene la lista de actividades de la base de datos
     * @return lista actividades
     */
    public List<Actividades> obtenerActividades() {
        Session sesion = sessionFactory.openSession();

        Query q = sesion.createQuery("FROM Actividades", Actividades.class);
        List<Actividades> listaActividades = q.getResultList();

        return listaActividades;
    }
}
