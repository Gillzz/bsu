package by.bsu.entity;

/**
 * Created by Igor on 16.10.2016.
 */
public class TaxiCarFactory {
    public static Car buildTaxiCar(TaxiCarType type) {
        Car car = null;
        switch (type) {
            case PASSENGER:
                car = new TaxiCar();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return car;
    }
}
