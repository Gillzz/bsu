package by.bsu.hibernate.dao;

import javax.persistence.*;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "drivers", schema = "taxipark")
public class DriversEntity {
    private int driverId;
    private String driverName;
    private String driverSurname;
    private String driverGender;
    private int driverAge;
    private int driverTelephoneNumber;
    private CarsEntity carsByCarId;

    @Id
    @Column(name = "driver_id", nullable = false, insertable = false, updatable = false)
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "driver_name", nullable = false, insertable = true, updatable = true, length = 20)
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Basic
    @Column(name = "driver_surname", nullable = false, insertable = true, updatable = true, length = 20)
    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    @Basic
    @Column(name = "driver_gender", nullable = false, insertable = true, updatable = true, length = 7)
    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender;
    }

    @Basic
    @Column(name = "driver_age", nullable = false, insertable = true, updatable = true)
    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    @Basic
    @Column(name = "driver_telephone_number", nullable = false, insertable = true, updatable = true)
    public int getDriverTelephoneNumber() {
        return driverTelephoneNumber;
    }

    public void setDriverTelephoneNumber(int driverTelephoneNumber) {
        this.driverTelephoneNumber = driverTelephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriversEntity that = (DriversEntity) o;

        if (driverId != that.driverId) return false;
        if (driverAge != that.driverAge) return false;
        if (driverTelephoneNumber != that.driverTelephoneNumber) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (driverSurname != null ? !driverSurname.equals(that.driverSurname) : that.driverSurname != null)
            return false;
        if (driverGender != null ? !driverGender.equals(that.driverGender) : that.driverGender != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = driverId;
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (driverSurname != null ? driverSurname.hashCode() : 0);
        result = 31 * result + (driverGender != null ? driverGender.hashCode() : 0);
        result = 31 * result + driverAge;
        result = 31 * result + driverTelephoneNumber;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "car_id", nullable = false)
    public CarsEntity getCarsByCarId() {
        return carsByCarId;
    }

    public void setCarsByCarId(CarsEntity carsByCarId) {
        this.carsByCarId = carsByCarId;
    }
}
