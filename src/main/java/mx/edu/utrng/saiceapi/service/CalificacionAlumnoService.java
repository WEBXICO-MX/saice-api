package mx.edu.utrng.saiceapi.service;

import java.util.List;

import mx.edu.utrng.saiceapi.domain.CalificacionAlumno;
import mx.edu.utrng.saiceapi.service.dto.CalificacionAlumnoBusquedaDTO;

public interface CalificacionAlumnoService {
	public List<CalificacionAlumno> findBycveUniversidadAndcveAlumno(CalificacionAlumnoBusquedaDTO calificacionAlumno);
}
