package by.bsu.jdbc;

import by.bsu.model.TaxiCar;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Asus on 03.11.2016.
 */
public class TaxiCarExtractor implements ResultSetExtractor<TaxiCar>  {
    public TaxiCar extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        TaxiCar taxiCar = new TaxiCar();
        taxiCar.setCarID(resultSet.getInt(1));
        taxiCar.setMake(resultSet.getString(2));
        taxiCar.setModel(resultSet.getString(3));
        taxiCar.setMileage(resultSet.getInt(4));
        taxiCar.setAge(resultSet.getInt(5));
        return taxiCar;
    }
}
