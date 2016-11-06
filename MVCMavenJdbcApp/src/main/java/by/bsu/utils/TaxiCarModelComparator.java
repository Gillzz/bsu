package by.bsu.utils;

import by.bsu.model.TaxiCar;

import java.util.Comparator;

/**
 * Created by Asus on 03.11.2016.
 */
public class TaxiCarModelComparator implements Comparator<TaxiCar> {
    public int compare(TaxiCar car1, TaxiCar car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
}
