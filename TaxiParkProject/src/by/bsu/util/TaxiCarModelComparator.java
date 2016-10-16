package by.bsu.util;

import by.bsu.entity.TaxiCar;

import java.util.Comparator;

/**
 * Created by Igor on 11.10.2016.
 */
public class TaxiCarModelComparator implements Comparator<TaxiCar> {
    public int compare(TaxiCar car1, TaxiCar car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
}
