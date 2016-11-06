package by.bsu.hibernate.entity;

import javax.persistence.*;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "frequent_adresses", schema = "taxipark")
public class FrequentAdressesEntity {
    private int frequentAdressId;
    private String adress;
    private String adressDiscription;

    @Id
    @Column(name = "frequent_adress_id", nullable = false, insertable = false, updatable = false)
    public int getFrequentAdressId() {
        return frequentAdressId;
    }

    public void setFrequentAdressId(int frequentAdressId) {
        this.frequentAdressId = frequentAdressId;
    }

    @Basic
    @Column(name = "adress", nullable = false, insertable = true, updatable = true, length = 40)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "adress_discription", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAdressDiscription() {
        return adressDiscription;
    }

    public void setAdressDiscription(String adressDiscription) {
        this.adressDiscription = adressDiscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FrequentAdressesEntity that = (FrequentAdressesEntity) o;

        if (frequentAdressId != that.frequentAdressId) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;
        if (adressDiscription != null ? !adressDiscription.equals(that.adressDiscription) : that.adressDiscription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = frequentAdressId;
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (adressDiscription != null ? adressDiscription.hashCode() : 0);
        return result;
    }
}
