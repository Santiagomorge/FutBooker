package Futbooker.controller;


import Futbooker.domain.model.Reserva;
import Futbooker.service.Interfaces.BuscarReservaIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/reservas")
@CrossOrigin(origins = "http://localhost:4200")
public class BuscarReservaIdController {

    @Autowired
    private final BuscarReservaIdService buscarReservaIdService;


    public BuscarReservaIdController(BuscarReservaIdService buscarReservaIdService) {
        this.buscarReservaIdService = buscarReservaIdService;
    }

    @GetMapping("/{id}")
    public Optional<Reserva> BuscarReservaId(@PathVariable Long id){
        return buscarReservaIdService.BuscarReservaId(id);
    }
}
