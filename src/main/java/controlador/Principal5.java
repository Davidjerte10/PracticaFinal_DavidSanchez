import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import modelo.Usuarios;


public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session sesion = sessionFactory.openSession();
		
		Query q = sesion.createQuery("FROM Usuarios");
		
		List<Usuarios> usuarios = q.getResultList();
		
		for (Usuarios e: usuarios) 
			System.out.println(e.getNombre());
				
		sesion.close();
	}

}
