package mx.edu.utrng.saiceapi.web.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utrng.saiceapi.domain.Periodo;
import mx.edu.utrng.saiceapi.service.PeriodoService;
import mx.edu.utrng.saiceapi.service.dto.PeriodoBusquedaDTO;

@RestController
@RequestMapping("/api")
public class PeriodoController {
	@Autowired
	PeriodoService periodoService;

	@PostMapping()
	@RequestMapping("/periodo")
	public Periodo getPeriodo(@Valid @RequestBody PeriodoBusquedaDTO periodoBusqueda) {
		return periodoService.findPeriodoBy(periodoBusqueda);
	}

}
