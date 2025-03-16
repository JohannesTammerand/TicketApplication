package dev.johannest.TicketApplication.flights;

import dev.johannest.TicketApplication.plane.Plane;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


public class Flight {

    long id;
    String start;
    String end;
    float price;
    Plane plane;
    LocalDateTime departureTime;
    LocalDateTime landingTime;

    public Flight(String start, String end, float price, Plane plane, LocalDateTime departureTime, LocalDateTime landingTime) {
        id = 1;
        this.start = start;
        this.end = end;
        this.price = price;
        this.plane = plane;
        this.departureTime = departureTime;
        this.landingTime = landingTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(LocalDateTime landingTime) {
        this.landingTime = landingTime;
    }
}
