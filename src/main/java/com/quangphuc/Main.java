package com.quangphuc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        if(sessionFactory != null) {
            System.out.println("SessionFactory bean is successfully created.");
        } else {
            System.out.println("Failed to create SessionFactory bean.");
        }
        
    }
}