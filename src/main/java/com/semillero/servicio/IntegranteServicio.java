package com.semillero.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entidades.Integrante;
import com.semillero.repositorio.IntegranteRepositorio;

@Service
public class IntegranteServicio {
	@Autowired
    private IntegranteRepositorio integranteRepository;

    public Integrante actualizarIntegrante(Integrante integrante) {
        return integranteRepository.save(integrante);
    }
}
