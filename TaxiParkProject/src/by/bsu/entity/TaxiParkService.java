package by.bsu.entity;

import java.util.List;
import java.util.Set;

/**
 * Created by Igor on 10.10.2016.
 */
public interface TaxiParkService {
    public long organize(TaxiPark park);
    public List<TaxiCar> getCars(long taxiParkID);
    public Set<TaxiDriver> getDrivers(long taxiParkID);
    public int getCarsPrice(List<TaxiCar> cars);
}
