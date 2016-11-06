package by.bsu.utils;

import by.bsu.model.TaxiCar;

import java.util.Comparator;

/**
 * Created by Asus on 03.11.2016.
 */
public class TaxiCarAgeComparator implements Comparator<TaxiCar> {
    public int compare(TaxiCar car1, TaxiCar car2) {
        return car1.getAge() - car2.getAge();
    }
}
