package by.bsu.hibernate.service.impl;
import by.bsu.hibernate.dao.CarsEntityDao;
import by.bsu.hibernate.entity.CarsEntity;
import by.bsu.hibernate.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Asus on 06.11.2016.
 */
@Service("carsService")
public class CarsServiceImpl implements CarsService {
    @Autowired
    CarsEntityDao carsEntityDao;

    @Transactional
    public void persistCar(CarsEntity car) {
        carsEntityDao.persistCar(car);
    }

    @Transactional
    public void updateCar(CarsEntity car) {
        carsEntityDao.updateCar(car);
    }

    @Transactional
    public CarsEntity findCarByID(String ID) {
        return carsEntityDao.findCarByID(ID);
    }

    @Transactional
    public void deleteCar(CarsEntity car) {
        carsEntityDao.deleteCar(car);
    }
}
