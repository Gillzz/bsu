package by.bsu.hibernate.entity;

import javax.persistence.*;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "pickup_points", schema = "taxipark")
public class PickupPointsEntity {
    private int pickupId;
    private String pickupAdress;
    private String pickupDiscription;
    private FrequentAdressesEntity frequentAdressesByFrequentAdressId;

    @Id
    @Column(name = "pickup_id", nullable = false, insertable = false, updatable = false)
    public int getPickupId() {
        return pickupId;
    }

    public void setPickupId(int pickupId) {
        this.pickupId = pickupId;
    }

    @Basic
    @Column(name = "pickup_adress", nullable = false, insertable = true, updatable = true, length = 40)
    public String getPickupAdress() {
        return pickupAdress;
    }

    public void setPickupAdress(String pickupAdress) {
        this.pickupAdress = pickupAdress;
    }

    @Basic
    @Column(name = "pickup_discription", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPickupDiscription() {
        return pickupDiscription;
    }

    public void setPickupDiscription(String pickupDiscription) {
        this.pickupDiscription = pickupDiscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PickupPointsEntity that = (PickupPointsEntity) o;

        if (pickupId != that.pickupId) return false;
        if (pickupAdress != null ? !pickupAdress.equals(that.pickupAdress) : that.pickupAdress != null) return false;
        if (pickupDiscription != null ? !pickupDiscription.equals(that.pickupDiscription) : that.pickupDiscription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pickupId;
        result = 31 * result + (pickupAdress != null ? pickupAdress.hashCode() : 0);
        result = 31 * result + (pickupDiscription != null ? pickupDiscription.hashCode() : 0);
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
