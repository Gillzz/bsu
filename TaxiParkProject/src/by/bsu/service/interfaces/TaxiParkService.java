package by.bsu.service.interfaces;

import by.bsu.entity.TaxiCar;
import by.bsu.entity.TaxiDriver;
import by.bsu.entity.TaxiPark;

import java.util.List;
import java.util.Set;

/**
 * Created by Igor on 10.10.2016.
 */
public interface TaxiParkService {
    List<TaxiCar> getCars(TaxiPark park);
    Set<TaxiDriver> getDrivers(TaxiPark park);
    int getCarsPrice(List<TaxiCar> cars);
}
