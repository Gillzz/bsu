package by.bsu.entity;

import java.io.Serializable;

/**
 * Created by Igor on 20.10.2016.
 */
public class TaxiCarBean implements Serializable {
    private String carID;
    private int age;
    private int mileage;
    private String model;

    public TaxiCarBean() {}

    public TaxiCarBean(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
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

    @Override
    public String toString() {
        return "TaxiCarBean{" +
                "carID=" + carID +
                ", age=" + age +
                ", mileage=" + mileage +
                ", model='" + model + '\'' +
                '}';
    }
}
