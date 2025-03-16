package dev.johannest.TicketApplication.plane;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/planes")
public class PlanesController {
    private final PlanesRepository planesRepository;

    public PlanesController(PlanesRepository planesRepository){
        this.planesRepository = planesRepository;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("")
    ArrayList<Plane> findAll(){
        return planesRepository.findAll();
    }
}
