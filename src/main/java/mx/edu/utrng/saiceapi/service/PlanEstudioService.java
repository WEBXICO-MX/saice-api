package mx.edu.utrng.saiceapi.service;

import mx.edu.utrng.saiceapi.domain.PlanEstudio;
import mx.edu.utrng.saiceapi.service.dto.PlanEstudioBusquedaDTO;

public interface PlanEstudioService {
	public PlanEstudio findPlanEstudioBy(PlanEstudioBusquedaDTO planEstudio);
}
