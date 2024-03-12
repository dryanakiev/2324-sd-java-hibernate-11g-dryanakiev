package transport.DAL.Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Buses", schema = "dbo", catalog = "TransportSystem")
public class Bus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Line", nullable = false)
    private int line;
    @Basic
    @Column(name = "Seats", nullable = false)
    private int seats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return id == bus.id && line == bus.line && seats == bus.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, line, seats);
    }
}
