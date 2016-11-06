package by.bsu.entity;

import java.io.Serializable;

/**
 * Created by Asus on 30.10.2016.
 */
public class TaxiDriver implements Serializable {
    private int driverID;
    private int carID;
    private String driverName;
    private String driverSurname;
    private String gender;
    private int driverAge;
    private int telephoneNumber;

    public TaxiDriver() {}

    public TaxiDriver(int driverID, int carID, String driverName, String driverSurname, String gender, int driverAge, int telephoneNumber) {
        this.driverID = driverID;
        this.carID = carID;
        this.driverName = driverName;
        this.driverSurname = driverSurname;
        this.gender = gender;
        this.driverAge = driverAge;
        this.telephoneNumber = telephoneNumber;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "TaxiDriver{" +
                "driverID=" + driverID +
                ", carID=" + carID +
                ", driverName='" + driverName + '\'' +
                ", driverSurname='" + driverSurname + '\'' +
                ", gender='" + gender + '\'' +
                ", driverAge=" + driverAge +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}
