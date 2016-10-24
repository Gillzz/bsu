package by.bsu.utils;

import by.bsu.entity.TaxiCarBean;

import java.util.Comparator;

/**
 * Created by Igor on 21.10.2016.
 */
public class TaxiCarModelComparator implements Comparator<TaxiCarBean> {
    @Override
    public int compare(TaxiCarBean car1, TaxiCarBean car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
}
