package Futbooker.controller;


import Futbooker.domain.model.Reserva;
import Futbooker.service.Interfaces.ListarReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/reservas")
@CrossOrigin(origins = "http://localhost:4200")
public class ListarReservasController {

    @Autowired
    private final ListarReservasService listarreservasservice;

    public ListarReservasController(ListarReservasService listarreservasservice){
        this.listarreservasservice = listarreservasservice;
    }

    @GetMapping("/mirar")
    public List<Reserva> listarReservas(){
        return listarreservasservice.listarReservas();
    }

}
