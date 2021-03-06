package by.bsu.entity;

import java.util.Set;

/**
 * Created by Igor on 10.10.2016.
 */
public class TaxiCar extends Car {
    private long carID;
    private int age;
    private int mileage;
    private String model;
    private TaxiPark park;
    private Set<TaxiDriver> drivers;

    public TaxiCar() {}

    public TaxiCar(long registrationNumber, byte numberOfDoors, int price, int fuelCapacity, TaxiCarType type,
                   long carID, int age, int mileage, String model, TaxiPark park, Set<TaxiDriver> drivers) {
        super(registrationNumber, numberOfDoors, price, fuelCapacity, type);
        this.carID = carID;
        this.age = age;
        this.mileage = mileage;
        this.model = model;
        this.park = park;
        this.drivers = drivers;
    }

    public long getCarID() {
        return carID;
    }

    public void setCarID(long carID) {
        this.carID = carID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TaxiPark getPark() {
        return park;
    }

    public void setPark(TaxiPark park) {
        this.park = park;
    }

    public Set<TaxiDriver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<TaxiDriver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "TaxiCar{" +
                "carID=" + carID +
                ", age=" + age +
                ", mileage=" + mileage +
                ", model='" + model + '\'' +
                ", park=" + park +
                ", drivers=" + drivers +
                '}';
    }
}
