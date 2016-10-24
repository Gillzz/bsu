package by.bsu.runner;

import by.bsu.entity.TaxiCar;
import by.bsu.util.FileHandler;
import by.bsu.util.TaxiCarModelComparator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Asus on 25.10.2016.
 */
public class Runner {
    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        File file;
        ArrayList<TaxiCar> cars = new ArrayList<>();
        try {
            file = handler.createFile();
            handler.appendString(file, "BMW");
            handler.appendString(file, "Hyundai");
            handler.appendString(file, "Kia");
            handler.appendString(file, "Mercedes");
            handler.appendString(file, "Ford");
            for (int i = 0; i < cars.size(); i++) {
                cars.get(i).setModel(handler.readFile(file).get(i));
            }
            Collections.sort(cars, new TaxiCarModelComparator());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
