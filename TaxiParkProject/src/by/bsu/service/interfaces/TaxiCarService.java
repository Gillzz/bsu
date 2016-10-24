package by.bsu.service.interfaces;

import by.bsu.entity.TaxiCar;
import by.bsu.entity.TaxiPark;

/**
 * Created by Igor on 10.10.2016.
 */
public interface TaxiCarService {
    TaxiCar findCar(long TaxiCarID, TaxiPark park);
    TaxiCar findCar(TaxiPark park, String model);
}
