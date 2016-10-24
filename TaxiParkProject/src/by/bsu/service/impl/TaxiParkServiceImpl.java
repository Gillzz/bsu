package by.bsu.service.impl;

import by.bsu.entity.*;
import by.bsu.service.interfaces.TaxiParkService;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by Igor on 11.10.2016.
 */
public class TaxiParkServiceImpl implements TaxiParkService {
    public List<TaxiCar> getCars(TaxiPark park) {
        if (park != null) {
            if (!park.getCars().isEmpty()) {
                return park.getCars();
            }
            else {
                System.out.printf("There are no taxi cars in this park!");
                return Collections.emptyList();
            }
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public Set<TaxiDriver> getDrivers(TaxiPark park) {
        if (park != null) {
            if (!park.getDrivers().isEmpty()) {
                return park.getDrivers();
            }
            else {
                System.out.println("There are no taxi drivers in this park!");
                return Collections.emptySet();
            }
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getCarsPrice(List<TaxiCar> cars) {
        int price = 0;
        for (TaxiCar car : cars) {
            price += car.getPrice();
        }
        return price;
    }
}
