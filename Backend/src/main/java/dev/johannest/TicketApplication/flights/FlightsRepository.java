package dev.johannest.TicketApplication.flights;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public class FlightsRepository {

    private ArrayList<Flight> flights = new ArrayList<>();

    ArrayList<Flight> findAll(){
        return flights;
    }

    @PostConstruct
    private void init(){
        flights.add(new Flight("a", "b", 200, null, LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
        flights.add(new Flight("a", "b", 200, null, LocalDateTime.now(), LocalDateTime.now().plusHours(2)));
    }
}
