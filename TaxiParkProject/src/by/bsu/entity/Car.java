package by.bsu.entity;

/**
 * Created by Igor on 11.10.2016.
 */
public abstract class Car {
    private long registrationNumber;
    private byte numberOfDoors;
    private int price;
    private int fuelCapacity;
    private TaxiCarType type = null;

    public Car() {}

    public Car(long registrationNumber, byte numberOfDoors, int price, int fuelCapacity, TaxiCarType type) {
        this.registrationNumber = registrationNumber;
        this.numberOfDoors = numberOfDoors;
        this.price = price;
        this.fuelCapacity = fuelCapacity;
        this.type = type;
    }

    public TaxiCarType getType() {
        return type;
    }

    public void setTaxiCarType(TaxiCarType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public byte getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(byte numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
