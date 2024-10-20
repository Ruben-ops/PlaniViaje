package com.plan.controller;

import com.plan.model.Mesa;
import com.plan.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @PutMapping("/mesas/{id}")
    public Mesa updateMesa(@PathVariable Long id, @RequestBody Mesa mesa) {
        return mesaService.updateMesa(id, mesa);
    }
}