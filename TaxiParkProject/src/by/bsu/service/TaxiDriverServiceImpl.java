package by.bsu.service;

import by.bsu.entity.TaxiCar;
import by.bsu.entity.TaxiDriver;
import by.bsu.entity.TaxiPark;

/**
 * Created by Igor on 11.10.2016.
 */
public class TaxiDriverServiceImpl {
    public TaxiDriver findDriver(long TaxiDriverID, TaxiPark park) {
        TaxiParkServiceImpl service = getParkService();
        for (TaxiDriver driver : service.getDrivers(park)) {
            if (driver.getDriverID() == TaxiDriverID) {
                return driver;
            }
        }
        return null;
    }

    private TaxiParkServiceImpl getParkService() {return new TaxiParkServiceImpl();}
}
