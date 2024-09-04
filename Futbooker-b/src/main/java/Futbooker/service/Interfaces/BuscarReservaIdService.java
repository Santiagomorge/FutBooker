package Futbooker.service.Interfaces;

import Futbooker.domain.model.Reserva;

import java.util.Optional;

public interface BuscarReservaIdService {
    Optional<Reserva> BuscarReservaId(Long id);
}
