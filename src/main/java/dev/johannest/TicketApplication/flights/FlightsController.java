package dev.johannest.TicketApplication.flights;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FlightsController {
    ArrayList<Flight> flights;

    ArrayList<Flight> getFlights(){
        return flights;
    }

    ArrayList<Flight> getFlights(String start, String end){
        ArrayList<Flight> result = new ArrayList<>();

        for (Flight flight : flights){
            if (flight.start.equals(start) && flight.end.equals(end)){
                result.add(flight);
            }
        }

        return result;
    }

    ArrayList<Flight[]> getLayoverFlights(String start, String end){
        ArrayList<Flight[]> result = new ArrayList<>();

        for (Flight flight1 : flights){
            if (flight1.start.equals(start)){
                for (Flight flight2 : flights){
                    if (flight1.end.equals(flight2.start) && flight2.end.equals(end)){
                        result.add(new Flight[]{flight1, flight2}); // TODO: Increase efficiency, maybe Airport class
                    }
                }
            }
        }

        return result;
    }
}
