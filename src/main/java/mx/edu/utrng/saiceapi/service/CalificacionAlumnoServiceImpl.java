package mx.edu.utrng.saiceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utrng.saiceapi.domain.CalificacionAlumno;
import mx.edu.utrng.saiceapi.repository.CalificacionAlumnoRepository;
import mx.edu.utrng.saiceapi.service.dto.CalificacionAlumnoBusquedaDTO;

@Service
public class CalificacionAlumnoServiceImpl implements CalificacionAlumnoService {
	@Autowired
	CalificacionAlumnoRepository calificacionAlumnoRepository;

	@Override
	public List<CalificacionAlumno> findBycveUniversidadAndcveAlumno(CalificacionAlumnoBusquedaDTO calificacionAlumno) {
		// TODO Auto-generated method stub
		return calificacionAlumnoRepository.findByCveAlumnoAndCveUniversidad(calificacionAlumno.getCveAlumno(),calificacionAlumno.getCveUniversidad());
	}

}
