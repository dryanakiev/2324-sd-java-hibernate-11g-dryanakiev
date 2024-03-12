package transport.DAL.Models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Tickets", schema = "dbo", catalog = "TransportSystem")
public class Ticket {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Number", nullable = false)
    private short number;
    @Basic
    @Column(name = "TimeOfAdmission", nullable = false)
    private Date timeOfAdmission;
    @Basic
    @Column(name = "PassengerId", nullable = true)
    private Integer passengerId;
    @Basic
    @Column(name = "BusId", nullable = true)
    private Integer busId;
    @ManyToOne
    @JoinColumn(name = "BusId", referencedColumnName = "Id")
    private Bus busesByBusId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public Date getTimeOfAdmission() {
        return timeOfAdmission;
    }

    public void setTimeOfAdmission(Date timeOfAdmission) {
        this.timeOfAdmission = timeOfAdmission;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && number == ticket.number && Objects.equals(timeOfAdmission, ticket.timeOfAdmission) && Objects.equals(passengerId, ticket.passengerId) && Objects.equals(busId, ticket.busId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, timeOfAdmission, passengerId, busId);
    }

    public Bus getBusesByBusId() {
        return busesByBusId;
    }

    public void setBusesByBusId(Bus busesByBusId) {
        this.busesByBusId = busesByBusId;
    }
}
