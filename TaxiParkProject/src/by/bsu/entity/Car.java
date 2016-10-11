package by.bsu.entity;

/**
 * Created by Igor on 11.10.2016.
 */
public abstract class Car {
    private long registrationNumber;
    private byte numberOfDoors;
    private int price;

    public Car() {}

    public Car(long registrationNumber, byte numberOfDoors, int price) {
        this.registrationNumber = registrationNumber;
        this.numberOfDoors = numberOfDoors;
        this.price = price;
    }

    public abstract int getPrice();

    public abstract void setPrice(int price);

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
}
