package by.bsu.dao.impl;

import by.bsu.dao.TaxiCarDao;
import by.bsu.jdbc.TaxiCarRowMapper;
import by.bsu.model.TaxiCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Asus on 03.11.2016.
 */
public class TaxiCarDaoImpl implements TaxiCarDao {
    @Autowired
    DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public void create(TaxiCar taxiCar) throws ClassNotFoundException, SQLException {
        String carQuery = "INSERT into cars(make, model, age) values(?,?,?)";
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(carQuery, new Object[] { taxiCar.getMake(), taxiCar.getModel(), taxiCar.getAge()});
    }

    public TaxiCar read(Integer carID) throws ClassNotFoundException, SQLException{
        String carQuery = "SELECT * FROM cars WHERE car_id = ?";
        List<TaxiCar> carList;
        jdbcTemplate = new JdbcTemplate(dataSource);
        carList = jdbcTemplate.query(carQuery, new TaxiCarRowMapper());
        return carList.get(0);
    }

    public void update(TaxiCar taxiCar) throws ClassNotFoundException, SQLException {
        String carQuery = "UPDATE cars SET make = ?, model = ?, mileage = ?, age = ? WHERE car_id = ?";
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(carQuery, new Object[]{taxiCar.getMake(), taxiCar.getModel(), taxiCar.getMileage(),
                taxiCar.getAge()});
    }

    public void delete(TaxiCar taxiCar) throws ClassNotFoundException, SQLException {
        String carQuery = "DELETE FROM cars WHERE car_id = " + taxiCar.getCarID();
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(carQuery);
    }

    public TaxiCar findCar(String make, String model) throws ClassNotFoundException, SQLException {
        String carQuery = "SELECT * FROM cars WHERE make = ? and model = ?";
        List<TaxiCar> carList;
        jdbcTemplate = new JdbcTemplate(dataSource);
        carList = jdbcTemplate.query(carQuery, new TaxiCarRowMapper());
        return carList.get(0);
    }

    public List<TaxiCar> getTaxiCars() {
        String carQuery = "SELECT * FROM taxipark";
        List<TaxiCar> taxiCarList;
        jdbcTemplate = new JdbcTemplate(dataSource);
        taxiCarList = jdbcTemplate.query(carQuery, new TaxiCarRowMapper());
        return taxiCarList;
    }
}
