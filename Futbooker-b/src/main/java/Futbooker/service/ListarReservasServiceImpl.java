package Futbooker.service;

import Futbooker.domain.model.Reserva;
import Futbooker.repository.ReservaRepository;
import Futbooker.service.Interfaces.ListarReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarReservasServiceImpl implements ListarReservasService {

    private final ReservaRepository reservaRepository;

    @Autowired
    public ListarReservasServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @Override
    public List<Reserva> listarReservas(){
        return reservaRepository.findAll();
    }

}
