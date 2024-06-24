package com.semillero.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.semillero.entidades.Capacitacion;

@Repository
public interface CapacitacionRepositorio extends JpaRepository<Capacitacion, Integer> {
    void deleteById(int id);
}