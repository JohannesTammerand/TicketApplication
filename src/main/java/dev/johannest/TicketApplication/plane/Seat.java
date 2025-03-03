package dev.johannest.TicketApplication.plane;

import java.util.ArrayList;
import java.util.HashMap;

public class Seat{
    int row;
    char column;
    SeatClass seatClass;
    ReservationState reservationState;
    SeatType type;
    ArrayList<String> modifiers;


    enum ReservationState{
        FREE,
        SELECTED,
        TAKEN
    }

    enum SeatClass{
        ECONOMY,
        BUSINESS,
        FIRST
    }

    enum SeatType{
        WINDOW,
        MIDDLE,
        AISLE
    }
}
