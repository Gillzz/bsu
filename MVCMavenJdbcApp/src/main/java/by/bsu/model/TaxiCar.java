package by.bsu.model;

/**
 * Created by Asus on 03.11.2016.
 */
public class TaxiCar {
    private int carID;
    private String make;
    private String model;
    private int age;
    private int mileage;

    public TaxiCar() {}

    public TaxiCar(int carID, String make, String model, int age, int mileage) {
        this.carID = carID;
        this.make = make;
        this.model = model;
        this.age = age;
        this.mileage = mileage;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
