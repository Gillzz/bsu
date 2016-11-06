package by.bsu.hibernate.entity;

import javax.persistence.*;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "cars", schema = "taxipark")
public class CarsEntity {
    private int carId;
    private String make;
    private String model;
    private int mileage;
    private int age;

    @Id
    @Column(name = "car_id", nullable = false, insertable = false, updatable = false)
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "make", nullable = false, insertable = true, updatable = true, length = 15)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Basic
    @Column(name = "model", nullable = false, insertable = true, updatable = true, length = 30)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "mileage", nullable = false, insertable = true, updatable = true)
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Basic
    @Column(name = "age", nullable = false, insertable = true, updatable = true)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarsEntity that = (CarsEntity) o;

        if (carId != that.carId) return false;
        if (mileage != that.mileage) return false;
        if (age != that.age) return false;
        if (make != null ? !make.equals(that.make) : that.make != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carId;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + mileage;
        result = 31 * result + age;
        return result;
    }
}
