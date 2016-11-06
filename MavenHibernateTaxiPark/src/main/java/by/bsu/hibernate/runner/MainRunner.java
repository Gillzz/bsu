package by.bsu.hibernate.runner;

import by.bsu.hibernate.entity.CarsEntity;
import by.bsu.hibernate.service.CarsService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Asus on 05.11.2016.
 */
public class MainRunner {
    public static void main(String[] args) {
/*        Session session = null;
        Transaction txn = null;
        try {
            SessionFactory sessionFactory =
                    new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            txn = session.beginTransaction();
            CarsEntity carsEntity = new CarsEntity();
            carsEntity.setMake("Mercedes");
            carsEntity.setModel("Gelendwagen");
            carsEntity.setAge(5);
            carsEntity.setMileage(10000);
            session.save(carsEntity);
            txn.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.flush();
            session.close();
        } */
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarsEntity carsEntity = new CarsEntity();
        carsEntity.setCarId(15);
        carsEntity.setMake("Ferrari");
        carsEntity.setModel("Laferrari");
        carsEntity.setAge(2013);
        CarsService carsService = (CarsService) context.getBean("carsService");
        carsService.persistCar(carsEntity);
        carsService.updateCar(carsEntity);
        context.close();
    }
}

