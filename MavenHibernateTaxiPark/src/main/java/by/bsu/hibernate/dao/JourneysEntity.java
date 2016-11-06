package by.bsu.hibernate.dao;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Asus on 05.11.2016.
 */
@Entity
@Table(name = "journeys", schema = "taxipark")
public class JourneysEntity {
    private int journeyId;
    private int journeyCost;
    private Timestamp journeyDateTime;
    private DriversEntity driversByDriverId;
    private DestinationsEntity destinationsByDestinationId;

    @Id
    @Column(name = "journey_id", nullable = false, insertable = false, updatable = false)
    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    @Basic
    @Column(name = "journey_cost", nullable = false, insertable = true, updatable = true)
    public int getJourneyCost() {
        return journeyCost;
    }

    public void setJourneyCost(int journeyCost) {
        this.journeyCost = journeyCost;
    }

    @Basic
    @Column(name = "journey_date_time", nullable = false, insertable = true, updatable = true)
    public Timestamp getJourneyDateTime() {
        return journeyDateTime;
    }

    public void setJourneyDateTime(Timestamp journeyDateTime) {
        this.journeyDateTime = journeyDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JourneysEntity that = (JourneysEntity) o;

        if (journeyId != that.journeyId) return false;
        if (journeyCost != that.journeyCost) return false;
        if (journeyDateTime != null ? !journeyDateTime.equals(that.journeyDateTime) : that.journeyDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = journeyId;
        result = 31 * result + journeyCost;
        result = 31 * result + (journeyDateTime != null ? journeyDateTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "driver_id", nullable = false)
    public DriversEntity getDriversByDriverId() {
        return driversByDriverId;
    }

    public void setDriversByDriverId(DriversEntity driversByDriverId) {
        this.driversByDriverId = driversByDriverId;
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
