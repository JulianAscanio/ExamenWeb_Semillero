package com.semillero.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.repositorio.CapacitacionRepositorio;

@Service
public class CapacitacionServicio {
	@Autowired
    private CapacitacionRepositorio capacitacionRepository;

    public void eliminarCapacitacion(int id) {
        capacitacionRepository.deleteById(id);
    }
}
