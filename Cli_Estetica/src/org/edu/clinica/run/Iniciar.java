package org.edu.clinica.run;

import org.edu.clinica.model.Pessoa;
import org.edu.clinica.util.HibernateUtil;
import org.hibernate.Session;


public class Iniciar {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		p.setUsuario("Emerson");
		p.setSenhar("1234");
		
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	session.save(p);
	session.getTransaction().commit();
	HibernateUtil.shutdown();

	}

}
