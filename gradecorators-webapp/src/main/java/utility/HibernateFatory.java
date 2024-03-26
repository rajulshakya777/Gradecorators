package utility;

import java.io.IOException;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateFatory {

	private static SessionFactory sessionFactory = null;
	//
	public static SessionFactory getSessionFactory() throws IOException {
       if (sessionFactory != null) {
           return sessionFactory;
         }
         Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
         sessionFactory = configuration.buildSessionFactory();
         return sessionFactory;
	}

}
