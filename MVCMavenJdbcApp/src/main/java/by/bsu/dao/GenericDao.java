package by.bsu.dao;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * Created by Asus on 03.11.2016.
 */
public interface GenericDao <T, PK extends Serializable> {
    void create(T car) throws ClassNotFoundException, SQLException;
    T read(PK ID) throws ClassNotFoundException, SQLException;
    void update(T car) throws ClassNotFoundException, SQLException;
    void delete(T car) throws ClassNotFoundException, SQLException;
}
