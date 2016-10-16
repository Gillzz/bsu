package by.bsu.entity;

import java.util.List;
import java.util.Set;

/**
 * Created by Igor on 10.10.2016.
 */
public interface TaxiParkService {
    public List<TaxiCar> getCars(TaxiPark park);
    public Set<TaxiDriver> getDrivers(TaxiPark park);
    public int getCarsPrice(List<TaxiCar> cars);
}
