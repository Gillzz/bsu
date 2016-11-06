package by.bsu.service;

import by.bsu.dao.TaxiCarDao;
import by.bsu.dao.impl.TaxiCarDaoImpl;
import by.bsu.entity.TaxiCar;
import by.bsu.util.TaxiCarAgeComparator;
import by.bsu.util.TaxiCarModelComparator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Asus on 31.10.2016.
 */
public class TaxiCarService {
    private TaxiCarDaoImpl taxiDao;

    public TaxiCarDao getTaxiDao() { return taxiDao; }

    public void setTaxiCarDao(TaxiCarDaoImpl taxiDao) { this.taxiDao = taxiDao; }

    public void createTaxiCar(TaxiCar car) throws ClassNotFoundException, SQLException {
        taxiDao.create(car);
    }

    public ArrayList<TaxiCar> getTaxiCars() throws ClassNotFoundException, SQLException {
        return taxiDao.getTaxiCars();
    }

    public ArrayList<TaxiCar> getSortedModels() throws ClassNotFoundException, SQLException {
        ArrayList<TaxiCar> taxiCars = this.getTaxiCars();
        Collections.sort(taxiCars, getModelComparator());
        return taxiCars;
    }

    public ArrayList<TaxiCar> getSortedCarAge() throws ClassNotFoundException, SQLException {
        ArrayList<TaxiCar> taxiCars = this.getTaxiCars();
        Collections.sort(taxiCars, getAgeComparator());
        return taxiCars;
    }

    private TaxiCarAgeComparator getAgeComparator() {
        return new TaxiCarAgeComparator();
    }

    private TaxiCarModelComparator getModelComparator() {
        return new TaxiCarModelComparator();
    }
}
