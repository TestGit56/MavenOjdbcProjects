package com.datageeks.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDAO {

	SessionFactory sessionFactory = HBUtil.getSessionFactory();
	
	public void FirstLevelCacheOrSessionLevelCache() {
		Session session = sessionFactory.openSession();
		System.out.println("/n/n  Request first Time");
		ProductBean product = session.get(ProductBean.class, 222);
		System.out.println(product);
		
		System.out.println("/n/n Request Second Time");
		ProductBean product2 = session.get(ProductBean.class, 222);
		System.out.println(product2);
		System.out.println("product hashcode()"+ product.hashCode());
		System.out.println("product2 hashcode()"+product.hashCode());
	}
	
	public void SecondLevelCacheOrSessionFactoryLevelCache() {
		Session session1 = sessionFactory.openSession();
		System.out.println("/n/n Request First Time sesion1");
		ProductBean product = session1.get(ProductBean.class, 222);
		System.out.println(product);
		
		System.out.println("/n/n Request Second Time seesion1");
		ProductBean product1 = session1.get(ProductBean.class, 222);
		System.out.println(product1);
		System.out.println("product hashcode()"+product.hashCode());
		System.out.println("product1 hashcode()"+product.hashCode());
		
		Session session2 = sessionFactory.openSession();
		System.out.println("/n/n Request First Time session2");
		ProductBean product2 = session2.get(ProductBean.class,222);
		System.out.println(product2);
		System.out.println("product2 hashcode()"+product2.hashCode());
	}
}
