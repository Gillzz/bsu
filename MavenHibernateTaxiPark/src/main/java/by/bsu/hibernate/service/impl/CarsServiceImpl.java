package by.bsu.hibernate.service.impl;

import by.bsu.hibernate.dao.CarsEntity;
import by.bsu.hibernate.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Asus on 06.11.2016.
 */
@Service("carService")
public class CarsServiceImpl implements CarsService {
    @Autowired
    CarsEntityDao = carsEntityDao;

    @Override
    @Transactional
    public void persistCar(CarsEntity car) {
        carsEntityDao.persistCar(car);
    }

    @Override
    @Transactional
    public void updateCar(CarsEntity car) {
        carsEntity.updateCar(car);
    }

    @Override
    @Transactional
    public CarsEntity findCar(String ID) {
        
    }
}
