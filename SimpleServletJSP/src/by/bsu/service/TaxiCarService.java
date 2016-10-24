package by.bsu.service;

import by.bsu.utils.TaxiCarAgeComparator;
import by.bsu.utils.TaxiCarModelComparator;
import by.bsu.entity.TaxiCarBean;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Igor on 20.10.2016.
 */
public class TaxiCarService {
    private ArrayList<TaxiCarBean> taxiCars = new ArrayList<>();

    public TaxiCarService() {
        taxiCars.add(new TaxiCarBean("BMW", 2006));
        taxiCars.add(new TaxiCarBean("Hyundai", 2010));
        taxiCars.add(new TaxiCarBean("Audi", 2013));
        taxiCars.add(new TaxiCarBean("Mercedes", 1999));
        taxiCars.add(new TaxiCarBean("Kia", 2005));
    }

    public ArrayList<TaxiCarBean> getModels() {
        return taxiCars;
    }

    public ArrayList<TaxiCarBean> getSortedModels() {
        Collections.sort(taxiCars, getModelComparator());
        return taxiCars;
    }

    public ArrayList<TaxiCarBean> getSortedCarAge() {
        Collections.sort(taxiCars, getAgeComparator());
        return taxiCars;
    }

    private TaxiCarAgeComparator getAgeComparator() {
        return new TaxiCarAgeComparator();
    }

    private TaxiCarModelComparator getModelComparator() {
        return new TaxiCarModelComparator();
    }
}
