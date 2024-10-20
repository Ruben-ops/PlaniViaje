package com.plan.controller;

import com.plan.model.Reserva;
import com.plan.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping("/reservas")
    public Reserva createReserva(@RequestBody Reserva reserva) {
        return reservaService.createReserva(reserva);
    }

    @GetMapping("/reservas/{username}")
    public List<Reserva> getReservasByUser(@PathVariable String username) {
        return reservaService.getReservasByUser(username);
    }
}