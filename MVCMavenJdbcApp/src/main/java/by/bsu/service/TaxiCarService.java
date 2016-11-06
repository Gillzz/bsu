package by.bsu.service;

import by.bsu.dao.GenericDao;
import by.bsu.model.TaxiCar;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 03.11.2016.
 */
public interface TaxiCarService extends GenericDao<TaxiCar, Integer> {
    TaxiCar findCar(String make, String model) throws ClassNotFoundException, SQLException;
    List<TaxiCar> getTaxiCars() throws ClassNotFoundException, SQLException;
    List<TaxiCar> getSortedModels() throws ClassNotFoundException, SQLException;
    List<TaxiCar> getSortedCarAge() throws ClassNotFoundException, SQLException;
}
