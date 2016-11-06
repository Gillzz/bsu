package by.bsu.hibernate.service;

import by.bsu.hibernate.dao.CarsEntity;

import java.util.List;

/**
 * Created by Asus on 06.11.2016.
 */
public interface CarsService {
    CarsEntity findById(int ID);
    void saveCar(CarsEntity car);
    void updateCar(CarsEntity car);
    void deleteCar(String ssn);
    List<CarsEntity> getCars();
    CarsEntity findCarBySsn(String ssn);
}
