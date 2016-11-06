package by.bsu.dao.impl;

import by.bsu.dao.TaxiDriverDao;
import by.bsu.entity.TaxiCar;
import by.bsu.entity.TaxiDriver;
import by.bsu.util.ConnectionUtils;
import by.bsu.util.ResultSetUtils;
import by.bsu.util.StatementUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 30.10.2016.
 */
public class TaxiDriverDaoImpl implements TaxiDriverDao {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    public void create(TaxiDriver driver) throws ClassNotFoundException, SQLException {
        String driverQuery = "INSERT into drivers(driver_name, driver_surname, driver_gender, driver_age, " +
                "driver_telephone_number) values(?,?,?,?,?)";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(driverQuery);
            pstm.setString(1, driver.getDriverName());
            pstm.setString(2, driver.getDriverSurname());
            pstm.setString(3, driver.getGender());
            pstm.setInt(4, driver.getDriverAge());
            pstm.setInt(5, driver.getTelephoneNumber());
            pstm.executeUpdate();
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
        }
    }

    public TaxiDriver read(Integer driverID) throws ClassNotFoundException, SQLException{
        String carQuery = "SELECT * FROM drivers WHERE driver_id = ?";
        conn = null;
        pstm = null;
        rs = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(carQuery);
            pstm.setInt(1, driverID);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                TaxiDriver driver = new TaxiDriver();
                driver.setDriverID(driverID);
                return driver;
            }
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
            ResultSetUtils.close(rs);
        }
        return null;
    }

    public void update(TaxiDriver driver) throws ClassNotFoundException, SQLException {
        String driverQuery = "UPDATE drivers SET driver_telephone_number = ? WHERE driver_id = ?";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(driverQuery);
            pstm.setInt(1, driver.getDriverID());
            pstm.executeUpdate();
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
        }
    }

    public void delete(TaxiDriver driver) throws ClassNotFoundException, SQLException {
        String driverQuery = "DELETE FROM drivers WHERE driver_id = ?";
        conn = null;
        pstm = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(driverQuery);
            pstm.setInt(1, driver.getDriverID());
            pstm.executeUpdate();
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
        }
    }

    public TaxiDriver findDriver(String name, String surname) throws ClassNotFoundException, SQLException {
        String driverQuery = "SELECT * FROM drivers WHERE driver_name = ? and drover_surname = ?";
        conn = null;
        pstm = null;
        rs = null;
        try {
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(driverQuery);
            pstm.setString(1, name);
            pstm.setString(2, surname);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                TaxiDriver driver = new TaxiDriver();
                driver.setDriverName(name);
                driver.setDriverSurname(surname);
                return driver;
            }
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
            ResultSetUtils.close(rs);
        }
        return null;
    }

    public ArrayList<TaxiDriver> getTaxiDrivers() throws ClassNotFoundException, SQLException {
        String driverQuery = "SELECT * FROM drivers";
        ArrayList<TaxiDriver> drivers;
        conn = null;
        pstm = null;
        try {
            drivers = new ArrayList<>();
            conn = ConnectionUtils.getConnection();
            pstm = conn.prepareStatement(driverQuery);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                TaxiDriver driver = new TaxiDriver(rs.getInt("driver_id"), rs.getInt("car_id"), rs.getString("driver_name"),
                        rs.getString("driver_surname"), rs.getString("driver_gender"), rs.getInt("driver_age"),
                        rs.getInt("driver_telephone_number"));
                drivers.add(driver);
                return drivers;
            }
        } finally {
            ConnectionUtils.close(conn);
            StatementUtils.close(pstm);
            ResultSetUtils.close(rs);
        }
        return null;
    }
}
