package by.bsu.entity;

import java.util.List;
import java.util.Set;

/**
 * Created by Igor on 10.10.2016.
 */
public class TaxiPark {
    private long TaxiParkID;
    private int size;
    private String name;
    private List<TaxiCar> cars;
    private Set<TaxiDriver> driver;

    public TaxiPark(long taxiParkID, int size, String name, List<TaxiCar> cars, Set<TaxiDriver> driver) {
        TaxiParkID = taxiParkID;
        this.size = size;
        this.name = name;
        this.cars = cars;
        this.driver = driver;
    }

    public long getTaxiParkID() {
        return TaxiParkID;
    }

    public void setTaxiParkID(long taxiParkID) {
        TaxiParkID = taxiParkID;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TaxiCar> getCars() {
        return cars;
    }

    public void setCars(List<TaxiCar> cars) {
        this.cars = cars;
    }

    public Set<TaxiDriver> getDriver() {
        return driver;
    }

    public void setDriver(Set<TaxiDriver> driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "TaxiParkID=" + TaxiParkID +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", cars=" + cars +
                ", driver=" + driver +
                '}';
    }
}
