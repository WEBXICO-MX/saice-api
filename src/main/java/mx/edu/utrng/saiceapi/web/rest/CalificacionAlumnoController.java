package mx.edu.utrng.saiceapi.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utrng.saiceapi.domain.CalificacionAlumno;
import mx.edu.utrng.saiceapi.service.CalificacionAlumnoService;
import mx.edu.utrng.saiceapi.service.dto.CalificacionAlumnoBusquedaDTO;

@RestController
@RequestMapping("/api")
public class CalificacionAlumnoController {
	@Autowired
	CalificacionAlumnoService calificacionAlumnoService;
	
	@PostMapping
	@RequestMapping("/ca")
	public List<CalificacionAlumno> getCalificaciones(@Valid @RequestBody CalificacionAlumnoBusquedaDTO calificacionAlumnoBusqueda) {
		// TODO Auto-generated method stub
		return calificacionAlumnoService.findBycveUniversidadAndcveAlumno(calificacionAlumnoBusqueda);
	}

}
