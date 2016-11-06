package by.bsu.util;

import by.bsu.entity.TaxiCar;

import java.util.Comparator;

/**
 * Created by Asus on 31.10.2016.
 */
public class TaxiCarAgeComparator implements Comparator<TaxiCar> {
    @Override
    public int compare(TaxiCar car1, TaxiCar car2) {
        return car1.getAge() - car2.getAge();
    }
}
