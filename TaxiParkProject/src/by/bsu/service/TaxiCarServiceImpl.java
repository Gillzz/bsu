package by.bsu.service;

import by.bsu.entity.TaxiCar;
import by.bsu.entity.TaxiCarService;
import by.bsu.entity.TaxiPark;
import by.bsu.entity.TaxiParkService;

/**
 * Created by Igor on 11.10.2016.
 */
public class TaxiCarServiceImpl implements TaxiCarService {
    public long registerCar(TaxiCar car, long TaxiParkID) {
        if (car == null) {
            throw new IllegalArgumentException("");
        }

        TaxiPark park = getParkService().findPark(TaxiParkID);
        if (park == null) {
            throw new IllegalArgumentException("");
        }

        park.getCars().add(car);
        car.setPark(park);
    }

    public TaxiCar findCar(long id) {
        TaxiCar car = null;

    }

    public boolean unregisterCar(long TaxiCarID) {

    }

    public long rentCar(TaxiCar car) {
        if (car == null) {
            throw new IllegalArgumentException("");
        }
    }

    private TaxiParkService getParkService() {
        return null;
    }
}
