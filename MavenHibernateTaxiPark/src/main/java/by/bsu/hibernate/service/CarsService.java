package by.bsu.hibernate.service;

import by.bsu.hibernate.entity.CarsEntity;

import java.util.List;

/**
 * Created by Asus on 06.11.2016.
 */
public interface CarsService {
    void persistCar(CarsEntity car);
    CarsEntity findCarByID(String ID);
    void updateCar(CarsEntity car);
    void deleteCar(CarsEntity car);
}
