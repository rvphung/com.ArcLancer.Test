package com.ArcLancer.Test.Hibernate;

import org.hibernate.Session;

public class TestEntityImplement {

	public TestEntityImplement() {
	}

	public void performTestEntity() {

		TestEntity testEntity = new TestEntity(2, "TEST2");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		// session.persist(testEntity);
		session.save(testEntity);
		session.getTransaction().commit();
		session.close();
	}
}
