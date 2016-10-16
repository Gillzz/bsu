package by.bsu.entity;

/**
 * Created by Igor on 10.10.2016.
 */
public interface TaxiCarService {
    public TaxiCar findCar(long TaxiCarID, TaxiPark park);
    public TaxiCar findCar(TaxiPark park, String model);
}
