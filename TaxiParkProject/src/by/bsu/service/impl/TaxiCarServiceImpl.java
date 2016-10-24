package by.bsu.service.impl;

import by.bsu.entity.TaxiCar;
import by.bsu.service.interfaces.TaxiCarService;
import by.bsu.entity.TaxiPark;

/**
 * Created by Igor on 11.10.2016.
 */
public class TaxiCarServiceImpl implements TaxiCarService {
    public TaxiCar findCar(long TaxiCarID, TaxiPark park) {
        TaxiParkServiceImpl service = getParkService();
        for (TaxiCar car : service.getCars(park)) {
            if (car.getCarID() == TaxiCarID) {
                return car;
            }
        }
        return null;
    }

    public TaxiCar findCar(TaxiPark park, String model) {
        TaxiParkServiceImpl service = getParkService();
        for (TaxiCar car : service.getCars(park)) {
            if (car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    private TaxiParkServiceImpl getParkService() {
        return new TaxiParkServiceImpl();
    }
}
