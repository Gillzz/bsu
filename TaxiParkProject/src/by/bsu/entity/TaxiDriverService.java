package by.bsu.entity;

/**
 * Created by Igor on 11.10.2016.
 */
public interface TaxiDriverService {
    public long hireDriver(TaxiDriver driver, long TaxiParkID);
    TaxiDriver findDriver(long DriverID);
    public boolean dismissDriver(long DriverID);
}
