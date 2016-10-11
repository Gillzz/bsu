package by.bsu.service;

import by.bsu.entity.*;

import java.util.List;
import java.util.Set;

/**
 * Created by Igor on 11.10.2016.
 */
public class TaxiParkServiceImpl implements TaxiParkService {
    public long organize(TaxiPark park) {

    }

    public List<TaxiCar> getCars(long TaxiParkID) {

    }

    public Set<TaxiDriver> getDrivers(long TaxiParkID) {

    }

    public TaxiPark findPark(long TaxiParkID) {
    }

    public int getCarsPrice(List<TaxiCar> cars) {
        int price = 0;
        for (TaxiCar car : cars) {
            price += car.getPrice();
        }
        return price;
    }
}
