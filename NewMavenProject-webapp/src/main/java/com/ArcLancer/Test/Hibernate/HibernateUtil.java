package com.ArcLancer.Test.Hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private static SessionFactory buildSessionFactory() throws HibernateException {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addResource("TestEntity.hbm.xml");

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		// Create the SessionFactory from hibernate.cfg.xml
		return configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() throws HibernateException {
		return SESSION_FACTORY;
	}
}
