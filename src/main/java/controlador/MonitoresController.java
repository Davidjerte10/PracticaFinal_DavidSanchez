/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Monitores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    
    /**
     * Metodo que registra un monitor en la base de datos
     * @param nombre
     * @param apellidos
     * @param actividad 
     */
    public void registrarMonitor(String nombre, String apellidos, String actividad) {           
        Session sesion = sessionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        Monitores nuevoMonitor = new Monitores();
        
        nuevoMonitor.setNombre(nombre);
        nuevoMonitor.setApellidos(apellidos);
        nuevoMonitor.setActividad(actividad);

        sesion.save(nuevoMonitor);
        tx.commit();
    }
    
    /**
     * Metodo que actualiza un monitor en la base de datos
     * @param nombre
     * @param apellidos
     * @param actividad
     * @param id
     * @return 
     */
    public int actualizarMonitor(String nombre, String apellidos, String actividad, int id) {
        Session sesion = sessionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        Query q = sesion.createQuery("update Monitores set nombre = :nombre, apellidos = :apellidos, actividad = :actividad where id = :id");
        q.setParameter("nombre", nombre);
        q.setParameter("apellidos", apellidos);
        q.setParameter("actividad", actividad);
        q.setParameter("id", id);

        int filasAfectadas = q.executeUpdate();
        tx.commit();
        
        return filasAfectadas;
        
    }
    
    /**
     * Metodo que elimina un monitor en la base de datos
     * @param id
     * @return 
     */
    public int eliminarMonitor(int id) {
        Session sesion = sessionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        Query q = sesion.createQuery("delete Monitores where id = :id");
        q.setParameter("id", id);

        int filasAfectadas = q.executeUpdate();
        tx.commit();
        
        return filasAfectadas;
        
    }
}
