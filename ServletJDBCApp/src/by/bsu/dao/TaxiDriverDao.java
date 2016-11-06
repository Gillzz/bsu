package by.bsu.dao;

import by.bsu.entity.TaxiCar;
import by.bsu.entity.TaxiDriver;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Asus on 30.10.2016.
 */
public interface TaxiDriverDao extends GenericDao<TaxiDriver, Integer> {
    TaxiDriver findDriver(String name, String surName) throws ClassNotFoundException, SQLException;
    ArrayList<TaxiDriver> getTaxiDrivers() throws ClassNotFoundException, SQLException;
}
