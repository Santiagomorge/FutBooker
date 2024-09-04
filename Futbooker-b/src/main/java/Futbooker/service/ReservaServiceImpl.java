package Futbooker.service;

import Futbooker.repository.ReservaRepository;
import Futbooker.domain.model.Reserva;
import Futbooker.service.Interfaces.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {


    private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }



    @Override
    public void reservarCancha(Reserva reserva) {
        System.out.println("Reserva cancha numero: "+reserva.getCancha()+ "realizada: " + reserva);
        reservaRepository.save(reserva);
    }

}
