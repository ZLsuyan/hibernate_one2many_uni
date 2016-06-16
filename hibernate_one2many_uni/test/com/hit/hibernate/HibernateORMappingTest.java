package com.hit.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class HibernateORMappingTest {
	private static SessionFactory sf = null;
	
	//@BeforeClass
	public static void beforeClass() {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	@Test
	//自动建表
	public void testSchemaExport() {
		new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);	
	}
	
	//@AfterClass
	public static void afterClass() {
		sf.close();
	}
}

