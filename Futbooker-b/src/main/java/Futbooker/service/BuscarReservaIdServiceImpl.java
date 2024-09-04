package Futbooker.service;


import Futbooker.domain.model.Reserva;
import Futbooker.repository.ReservaRepository;
import Futbooker.service.Interfaces.BuscarReservaIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarReservaIdServiceImpl implements BuscarReservaIdService {

    private final ReservaRepository reservaRepository;

    @Autowired
    public BuscarReservaIdServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @Override
    public Optional<Reserva> BuscarReservaId(Long id){
        return reservaRepository.findById(id);
    }
}
