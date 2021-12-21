package mx.edu.utrng.saiceapi.web.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utrng.saiceapi.domain.PlanEstudio;
import mx.edu.utrng.saiceapi.service.PlanEstudioService;
import mx.edu.utrng.saiceapi.service.dto.PlanEstudioBusquedaDTO;

@RestController
@RequestMapping("/api")
public class PlanEstudioController {
	@Autowired
	PlanEstudioService planEstudioService;

	@PostMapping
	@RequestMapping("/pe")
	public PlanEstudio getPlanEstudio(@Valid @RequestBody PlanEstudioBusquedaDTO planEstudioBusqueda) {
		return planEstudioService.findPlanEstudioBy(planEstudioBusqueda);
	}

}
