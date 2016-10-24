package by.bsu.service.interfaces;

import by.bsu.entity.TaxiDriver;
import by.bsu.entity.TaxiPark;

/**
 * Created by Igor on 11.10.2016.
 */
public interface TaxiDriverService {
    TaxiDriver findDriver(long DriverID, TaxiPark park);
}
