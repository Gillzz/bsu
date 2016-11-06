package by.bsu.hibernate.dao;

import javax.persistence.*;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "charges", schema = "taxipark")
public class ChargesEntity {
    private int chargeId;
    private int chargeAmount;
    private DestinationsEntity destinationsByDestinationId;

    @Id
    @Column(name = "charge_id", nullable = false, insertable = false, updatable = false)
    public int getChargeId() {
        return chargeId;
    }

    public void setChargeId(int chargeId) {
        this.chargeId = chargeId;
    }

    @Basic
    @Column(name = "charge_amount", nullable = false, insertable = true, updatable = true)
    public int getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(int chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChargesEntity that = (ChargesEntity) o;

        if (chargeId != that.chargeId) return false;
        if (chargeAmount != that.chargeAmount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chargeId;
        result = 31 * result + chargeAmount;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "destination_id", referencedColumnName = "destination_id", nullable = false)
    public DestinationsEntity getDestinationsByDestinationId() {
        return destinationsByDestinationId;
    }

    public void setDestinationsByDestinationId(DestinationsEntity destinationsByDestinationId) {
        this.destinationsByDestinationId = destinationsByDestinationId;
    }
}
