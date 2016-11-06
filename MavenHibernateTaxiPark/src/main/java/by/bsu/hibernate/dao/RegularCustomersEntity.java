package by.bsu.hibernate.dao;

import javax.persistence.*;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "regular_customers", schema = "taxipark")
public class RegularCustomersEntity {
    private int customerId;
    private String customerName;
    private String customerSurname;
    private int customerPhone;
    private FrequentAdressesEntity frequentAdressesByFrequentAdressId;

    @Id
    @Column(name = "customer_id", nullable = false, insertable = false, updatable = false)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name", nullable = false, insertable = true, updatable = true, length = 20)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "customer_surname", nullable = false, insertable = true, updatable = true, length = 20)
    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    @Basic
    @Column(name = "customer_phone", nullable = false, insertable = true, updatable = true)
    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegularCustomersEntity that = (RegularCustomersEntity) o;

        if (customerId != that.customerId) return false;
        if (customerPhone != that.customerPhone) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (customerSurname != null ? !customerSurname.equals(that.customerSurname) : that.customerSurname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerSurname != null ? customerSurname.hashCode() : 0);
        result = 31 * result + customerPhone;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "frequent_adress_id", referencedColumnName = "frequent_adress_id", nullable = false)
    public FrequentAdressesEntity getFrequentAdressesByFrequentAdressId() {
        return frequentAdressesByFrequentAdressId;
    }

    public void setFrequentAdressesByFrequentAdressId(FrequentAdressesEntity frequentAdressesByFrequentAdressId) {
        this.frequentAdressesByFrequentAdressId = frequentAdressesByFrequentAdressId;
    }
}
