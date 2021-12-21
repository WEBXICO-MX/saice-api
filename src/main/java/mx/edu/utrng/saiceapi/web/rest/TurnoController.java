package mx.edu.utrng.saiceapi.web.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utrng.saiceapi.domain.Turno;
import mx.edu.utrng.saiceapi.service.TurnoService;
import mx.edu.utrng.saiceapi.service.dto.TurnoBusquedaDTO;

@RestController
@RequestMapping("/api")
public class TurnoController {
	@Autowired
	TurnoService turnoService;

	@PostMapping
	@RequestMapping("/turno")
	public Turno getTurno(@Valid @RequestBody TurnoBusquedaDTO turnoBusqueda) {
		return turnoService.findTurnoBy(turnoBusqueda);
	}

}
