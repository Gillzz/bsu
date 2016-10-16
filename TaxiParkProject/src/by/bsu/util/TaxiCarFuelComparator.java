package by.bsu.util;

import by.bsu.entity.TaxiCar;

import java.util.Comparator;

/**
 * Created by Igor on 16.10.2016.
 */
public class TaxiCarFuelComparator {
    public class TaxiCarAgeComparator implements Comparator<TaxiCar> {
        public int compare(TaxiCar car1, TaxiCar car2) {
            return Math.abs(car1.getFuelCapacity() - car2.getFuelCapacity());
        }
    }
}
