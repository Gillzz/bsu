package by.bsu.entity;

import java.util.List;

/**
 * Created by Igor on 10.10.2016.
 */
public class TaxiDriver {
    private long driverID;
    private String name;
    private String surname;
    private int age;
    private TaxiPark park;
    private List<TaxiCar> cars;

    public TaxiDriver(long driverID, String name, String surname, int age, TaxiPark park, List<TaxiCar> cars) {
        this.driverID = driverID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.park = park;
        this.cars = cars;
    }

    public long getDriverID() {
        return driverID;
    }

    public void setDriverID(long driverID) {
        this.driverID = driverID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TaxiPark getPark() {
        return park;
    }

    public void setPark(TaxiPark park) {
        this.park = park;
    }

    public List<TaxiCar> getCars() {
        return cars;
    }

    public void setCars(List<TaxiCar> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "TaxiDriver{" +
                "driverID=" + driverID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", park=" + park +
                ", cars=" + cars +
                '}';
    }
}
