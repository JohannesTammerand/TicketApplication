package dev.johannest.TicketApplication.flights;

import dev.johannest.TicketApplication.plane.Plane;

import java.time.LocalDateTime;

public class Flight {
    String start;
    String end;
    float price;
    Plane plane;
    LocalDateTime departureTime;
    LocalDateTime landingTime;
}
