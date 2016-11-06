package by.bsu.jdbc;

import by.bsu.model.TaxiCar;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by Asus on 03.11.2016.
 */
public class TaxiCarRowMapper implements RowMapper<TaxiCar> {
    public TaxiCar mapRow(ResultSet resultSet, int line) throws SQLException {
        TaxiCarExtractor carExtractor = new TaxiCarExtractor();
        return carExtractor.extractData(resultSet);
    }
}
