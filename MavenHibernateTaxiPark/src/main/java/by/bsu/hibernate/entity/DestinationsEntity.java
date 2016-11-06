package by.bsu.hibernate.entity;

import javax.persistence.*;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "destinations", schema = "taxipark")
public class DestinationsEntity {
    private int destinationId;
    private String destinationAdress;

    @Id
    @Column(name = "destination_id", nullable = false, insertable = false, updatable = false)
    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    @Basic
    @Column(name = "destination_adress", nullable = false, insertable = true, updatable = true, length = 40)
    public String getDestinationAdress() {
        return destinationAdress;
    }

    public void setDestinationAdress(String destinationAdress) {
        this.destinationAdress = destinationAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DestinationsEntity that = (DestinationsEntity) o;

        if (destinationId != that.destinationId) return false;
        if (destinationAdress != null ? !destinationAdress.equals(that.destinationAdress) : that.destinationAdress != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = destinationId;
        result = 31 * result + (destinationAdress != null ? destinationAdress.hashCode() : 0);
        return result;
    }
}
