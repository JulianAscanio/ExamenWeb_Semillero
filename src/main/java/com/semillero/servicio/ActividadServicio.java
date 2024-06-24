package com.semillero.servicio;

import org.springframework.stereotype.Service;
import com.semillero.entidades.Actividad;
import com.semillero.repositorio.ActividadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class ActividadServicio {

    @Autowired
    private ActividadRepositorio actividadRepositorio;

    public List<Actividad> obtenerTodasActividades() {
        return actividadRepositorio.findAll();
    }

    public Actividad obtenerActividadPorId(int id) {
        Optional<Actividad> actividadOptional = actividadRepositorio.findById(id);
        return actividadOptional.orElse(null);
    }

    public Actividad crearActividad(Actividad actividad) {
        return actividadRepositorio.save(actividad);
    }

    public void eliminarActividad(int id) {
        actividadRepositorio.deleteById(id);
    }

    public Actividad actualizarActividad(int id, Actividad actividad) {
        if (actividadRepositorio.existsById(id)) {
            actividad.setId(id);;
            return actividadRepositorio.save(actividad);
        } else {
            return null;
        }
    }
}

