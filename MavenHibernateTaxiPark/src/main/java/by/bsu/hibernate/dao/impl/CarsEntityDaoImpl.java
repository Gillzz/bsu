package by.bsu.hibernate.dao.impl;

/**
 * Created by Asus on 07.11.2016.
 */

import by.bsu.hibernate.dao.CarsEntityDao;
import by.bsu.hibernate.entity.CarsEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("carsEntityDao")
public class CarsEntityDaoImpl implements CarsEntityDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void persistCar(CarsEntity car) {
        sessionFactory.getCurrentSession().persist(car);
    }

    public CarsEntity findCarByID(String ID) {
        return (CarsEntity) sessionFactory.getCurrentSession().get(CarsEntity.class, ID);
    }

    public void updateCar(CarsEntity car) {
        sessionFactory.getCurrentSession().update(car);
    }

    public void deleteCar(CarsEntity car) {
        sessionFactory.getCurrentSession().delete(car);
    }
}
