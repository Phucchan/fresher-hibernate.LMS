package com.quangphuc.utils;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
            return context.getBean("sessionFactory", SessionFactory.class);
        } catch (Exception ex) {
            throw new ExceptionInInitializerError("Không thể khởi tạo SessionFactory từ XML: " + ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
