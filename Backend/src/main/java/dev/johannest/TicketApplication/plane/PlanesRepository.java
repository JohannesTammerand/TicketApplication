package dev.johannest.TicketApplication.plane;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PlanesRepository {
    ArrayList<Plane> planes = new ArrayList<>();

    ArrayList<Plane> findAll(){
        return planes;
    }

    @PostConstruct
    private void init(){
        planes.add(new Plane(1, 33, 4));
        planes.add(new Plane(2, 33, 4));
        planes.add(new Plane(3, 33, 4));
    }

}
