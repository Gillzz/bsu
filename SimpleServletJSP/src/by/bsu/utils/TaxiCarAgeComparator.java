package by.bsu.utils;

import by.bsu.entity.TaxiCarBean;

import java.util.Comparator;

/**
 * Created by Igor on 21.10.2016.
 */
public class TaxiCarAgeComparator implements Comparator<TaxiCarBean> {
    @Override
    public int compare(TaxiCarBean car1, TaxiCarBean car2) {
        return car1.getAge() - car2.getAge();
    }
}
