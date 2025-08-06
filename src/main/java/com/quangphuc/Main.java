package com.quangphuc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quangphuc.utils.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        // getSessionFactoryWithJavaConFig();
        
   
        getSessionFactoryWithXmlConfig();
        

        
    }

    private static void getSessionFactoryWithXmlConfig() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            System.out.println("✅ Kết nối Hibernate thành công!");
            System.out.println("📦 Hibernate sẽ tự động tạo bảng nếu chưa có.");
        } catch (Exception e) {
            System.err.println("❌ Lỗi kết nối Hibernate: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sessionFactory.close(); // đóng SessionFactory khi không dùng nữa
        }
    }

    private static void getSessionFactoryWithJavaConFig() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        if(sessionFactory != null) {
            ((ClassPathXmlApplicationContext) context).close(); // Đóng context sau khi lấy SessionFactory
            System.out.println("SessionFactory bean is successfully created.");
        } else {
            System.out.println("Failed to create SessionFactory bean.");
        }
    }
}