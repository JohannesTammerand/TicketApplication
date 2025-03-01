package dev.johannest.TicketApplication.plane;

import java.util.HashMap;

public record Seat (
        int row,
        char column,
        HashMap<String, String> modifiers // The use of a HashMap for modifiers allows for greater variety in modifiers
){
    
}
