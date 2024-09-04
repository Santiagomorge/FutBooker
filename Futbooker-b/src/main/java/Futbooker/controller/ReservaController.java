package Futbooker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Futbooker.domain.model.Reserva;
import Futbooker.service.Interfaces.ReservaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/reservar")
public class ReservaController {

    @Autowired
    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public void reservarCancha(@RequestBody Reserva reserva) {
        reservaService.reservarCancha(reserva);
    }
}
