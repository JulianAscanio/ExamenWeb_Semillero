package com.semillero.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entidades.Proyecto;
import com.semillero.repositorio.ProyectoRepositorio;

@Service
public class ProyectoServicio {

	@Autowired
    private ProyectoRepositorio proyectoRepository;

    public List<Proyecto> listarProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto obtenerProyecto(int id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    public Proyecto crearProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public Proyecto actualizarProyecto(int id, Proyecto proyectoDetails) {
        Proyecto proyecto = proyectoRepository.findById(id).orElse(null) ;
        if (proyecto != null) {
            proyecto.setNombre(proyectoDetails.getNombre());
            proyecto.setObjetivoGeneral(proyectoDetails.getObjetivoGeneral());
            proyecto.setLinea(proyectoDetails.getLinea());
            proyecto.setResponsable(proyectoDetails.getResponsable());
            proyecto.setFechaInicio(proyectoDetails.getFechaInicio());
            proyecto.setFechaFin(proyectoDetails.getFechaFin());
            return proyectoRepository.save(proyecto);
        }
        return null;
    }

    public void eliminarProyecto(int id) {
        proyectoRepository.deleteById(id);
    }

}
