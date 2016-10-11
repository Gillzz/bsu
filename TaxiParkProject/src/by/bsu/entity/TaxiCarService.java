package by.bsu.entity;

/**
 * Created by Igor on 10.10.2016.
 */
public interface TaxiCarService {
    public TaxiCar findCar(long carID);
    public long registerCar(TaxiCar car, long TaxiParkID);
    public boolean unregisterCar(long c);
    public long rentCar(TaxiCar car);
}
