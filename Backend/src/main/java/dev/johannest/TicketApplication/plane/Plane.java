package dev.johannest.TicketApplication.plane;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Plane {


    long id;

    int rows;
    int columns;

    public Plane(long id, int rows, int columns) {
        this.id = id;
        this.rows = rows;
        this.columns = columns;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    //    ArrayList<Seat> getSeats(){
//        return seats;
//    }
//
//    ArrayList<Seat> getSeats(Seat.SeatType type){
//        ArrayList<Seat> result = new ArrayList<>();
//        for (Seat s : seats){
//            if (s.type == type){
//                result.add(s);
//            }
//        }
//        return result;
//    }
//
//    ArrayList<Seat> getSeats(String modifier){
//        ArrayList<Seat> result = new ArrayList<>();
//        for (Seat s : seats){
//            if (s.modifiers.contains(modifier)){
//                result.add(s);
//            }
//        }
//        return result;
//    }
}
