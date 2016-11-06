package by.bsu.hibernate.dao;

import by.bsu.hibernate.entity.CarsEntity;

/**
 * Created by Asus on 07.11.2016.
 */
public interface CarsEntityDao {
    void persistCar(CarsEntity car);
    CarsEntity findCarByID(String ID);
    void updateCar(CarsEntity car);
    void deleteCar(CarsEntity car);
}
