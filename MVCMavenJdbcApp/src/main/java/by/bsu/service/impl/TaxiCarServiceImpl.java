package by.bsu.service.impl;

import by.bsu.dao.TaxiCarDao;
import by.bsu.dao.impl.TaxiCarDaoImpl;
import by.bsu.model.TaxiCar;
import by.bsu.service.TaxiCarService;
import by.bsu.utils.TaxiCarAgeComparator;
import by.bsu.utils.TaxiCarModelComparator;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

/**
 * Created by Asus on 03.11.2016.
 */
public class TaxiCarServiceImpl implements TaxiCarService {
    @Autowired
    TaxiCarDao taxiCarDao;

    public void create(TaxiCar car)  throws ClassNotFoundException, SQLException {
        taxiCarDao.create(car);
    }

    public TaxiCar read(Integer ID) throws ClassNotFoundException, SQLException {
        return taxiCarDao.read(ID);
    }

    public List<TaxiCar> getTaxiCars() throws ClassNotFoundException, SQLException {
        return taxiCarDao.getTaxiCars();
    }

    public void delete(TaxiCar car)  throws ClassNotFoundException, SQLException {
        taxiCarDao.delete(car);

    }

    public void update(TaxiCar car)  throws ClassNotFoundException, SQLException {
        taxiCarDao.update(car);
    }

    public TaxiCar findCar(String make, String model) throws ClassNotFoundException, SQLException {
        return taxiCarDao.findCar(make, model);
    }

    public List<TaxiCar> getSortedModels() throws ClassNotFoundException, SQLException {
        List<TaxiCar> taxiCars = this.getTaxiCars();
        Collections.sort(taxiCars, getModelComparator());
        return taxiCars;
    }

    public List<TaxiCar> getSortedCarAge() throws ClassNotFoundException, SQLException {
        List<TaxiCar> taxiCars = this.getTaxiCars();
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
