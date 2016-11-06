package by.bsu.dao;

import by.bsu.model.TaxiCar;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 03.11.2016.
 */
public interface TaxiCarDao extends GenericDao<TaxiCar, Integer> {
    TaxiCar findCar(String make, String model) throws ClassNotFoundException, SQLException;
    List<TaxiCar> getTaxiCars() throws ClassNotFoundException, SQLException;
}
