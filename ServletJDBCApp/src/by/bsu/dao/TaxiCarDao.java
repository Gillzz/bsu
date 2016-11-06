package by.bsu.dao;

import by.bsu.dao.GenericDao;
import by.bsu.entity.TaxiCar;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 30.10.2016.
 */
public interface TaxiCarDao extends GenericDao<TaxiCar, Integer> {
    TaxiCar findCar(String make, String model) throws ClassNotFoundException, SQLException;
    ArrayList<TaxiCar> getTaxiCars() throws ClassNotFoundException, SQLException;
}
