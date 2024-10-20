package com.plan.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plan.model.Mesa;
import com.plan.repository.MesaRepository;
@Service
public class MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    public Mesa updateMesa(Long id, Mesa mesa) {
        Mesa existingMesa = mesaRepository.findById(id).orElseThrow(() -> new RuntimeException("Mesa not found"));
        existingMesa.setCapacidad(mesa.getCapacidad());
        existingMesa.setDisponibilidad(mesa.isDisponibilidad());
        return mesaRepository.save(existingMesa);
    }
}