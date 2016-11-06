package by.bsu.dao.impl;

import by.bsu.dao.TaxiCarDao;
import by.bsu.entity.TaxiCar;
import by.bsu.util.ConnectionUtils;
import by.bsu.util.ResultSetUtils;
import by.bsu.util.StatementUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 30.10.2016.
 */
public class TaxiCarDaoImpl implements TaxiCarDao {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    public void create(TaxiCar car) throws ClassNotFoundException, SQLException {
        String carQuery = "INSERT into cars(make, model, age) values(?,?,?)";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(carQuery);
            pstm.setString(1, car.getMake());
            pstm.setString(2, car.getModel());
            pstm.setFloat(3, car.getAge());
            pstm.executeUpdate();
        } finally {
            ConnectionUtils.close(conn);
        }
    }

    public TaxiCar read(Integer carID) throws ClassNotFoundException, SQLException{
        String carQuery = "SELECT * FROM cars WHERE car_id = ?";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(carQuery);
            pstm.setInt(1, carID);
            rs = pstm.executeQuery();
            while (rs.next()) {
                TaxiCar car = new TaxiCar();
                car.setCarID(carID);
                return car;
            }
        } finally {
            ConnectionUtils.close(conn);
        }
        return null;
    }

    public void update(TaxiCar car) throws ClassNotFoundException, SQLException {
        String carQuery = "UPDATE cars SET mileage = ?";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(carQuery);
            int mileage = car.getMileage();
            pstm.setInt(1, mileage);
            pstm.executeUpdate();
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
        }
    }

    public void delete(TaxiCar car) throws ClassNotFoundException, SQLException {
        String carQuery = "DELETE FROM cars WHERE car_id = ?";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(carQuery);
            int carID = car.getCarID();
            pstm.setInt(1, carID);
            pstm.executeUpdate();
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
        }
    }

    public TaxiCar findCar(String make, String model) throws ClassNotFoundException, SQLException {
        String carQuery = "SELECT * FROM cars WHERE make = ? and model = ?";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(carQuery);
            pstm.setString(1, make);
            pstm.setString(2, model);
            rs = pstm.executeQuery();
            if (rs.next()) {
                TaxiCar car = new TaxiCar();
                car.setMake(make);
                car.setModel(model);
                return car;
            }
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
            ResultSetUtils.close(rs);
        }
        return null;
    }

    public ArrayList<TaxiCar> getTaxiCars() throws ClassNotFoundException, SQLException {
        String carQuery = "SELECT * FROM cars";
        ArrayList<TaxiCar> cars;
        TaxiCar car;
        conn = null;
        pstm = null;
        try {
            cars = new ArrayList<>();
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(carQuery);
            rs = pstm.executeQuery();
            while (rs.next()) {
                car = new TaxiCar();
                car.setCarID(rs.getInt(1));
                car.setMake(rs.getString(2));
                car.setModel(rs.getString(3));
                car.setMileage(rs.getInt(4));
                car.setAge(rs.getInt(5));
                cars.add(car);
            }
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
            ResultSetUtils.close(rs);
        }
        return cars;
    }
}
