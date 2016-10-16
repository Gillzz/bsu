package by.bsu.util;

import by.bsu.entity.TaxiCar;

import java.util.Comparator;

/**
 * Created by Igor on 11.10.2016.
 */
public class TaxiCarAgeComparator implements Comparator<TaxiCar> {
    public int compare(TaxiCar car1, TaxiCar car2) {
        return Math.abs(car1.getAge() - car2.getAge());
    }
}
