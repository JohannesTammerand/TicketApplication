package dev.johannest.TicketApplication.plane;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Plane {
    // Array that stores seats
    ArrayList<Seat> seats;
    String designation;

    ArrayList<Seat> getSeats(){
        return seats;
    }

    ArrayList<Seat> getSeats(Seat.SeatType type){
        ArrayList<Seat> result = new ArrayList<>();
        for (Seat s : seats){
            if (s.type == type){
                result.add(s);
            }
        }
        return result;
    }

    ArrayList<Seat> getSeats(String modifier){
        ArrayList<Seat> result = new ArrayList<>();
        for (Seat s : seats){
            if (s.modifiers.contains(modifier)){
                result.add(s);
            }
        }
        return result;
    }
}
