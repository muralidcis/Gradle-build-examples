package com.formsdirectinc.test.framework.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.io.File;
import java.net.URL;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
	try {
            Configuration configuration = null;
            URL configFileURL = null;

            File configFile = new File("src/test/resources/hibernate.cfg.xml");

            System.setProperty("java.naming.factory.initial", "com.sun.jndi.fscontext.RefFSContextFactory");
            System.setProperty("java.naming.provider.url", "file:///tmp");

            configuration = (new Configuration()).configure(configFile);
                        sessionFactory = configuration.buildSessionFactory();

            Context con = new InitialContext();
            con.rebind("java:comp/env/hibernate/sessionfactory", sessionFactory);

            return sessionFactory;
        } catch (Exception e) {
            System.out.println("Could not locate SessionFactory in JNDI" + e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
}
