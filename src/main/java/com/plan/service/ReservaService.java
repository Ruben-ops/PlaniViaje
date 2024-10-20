package com.plan.service;

import com.plan.model.Reserva;
import com.plan.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva createReserva(Reserva reserva) {
        // Lógica de validación para verificar la disponibilidad de mesas
        return reservaRepository.save(reserva);
    }

    public List<Reserva> getReservasByUser(String username) {
        return reservaRepository.findByUsername(username);
    }
}