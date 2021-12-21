package mx.edu.utrng.saiceapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utrng.saiceapi.domain.PlanEstudio;
import mx.edu.utrng.saiceapi.repository.PlanEstudioRepository;
import mx.edu.utrng.saiceapi.service.dto.PlanEstudioBusquedaDTO;

@Service
public class PlanEstudioServiceImpl implements PlanEstudioService {
	@Autowired
	PlanEstudioRepository planEstudioRepository;

	@Override
	public PlanEstudio findPlanEstudioBy(PlanEstudioBusquedaDTO planEstudio) {
		// TODO Auto-generated method stub
		return planEstudioRepository.findByCvePlanAndCveUniversidad(planEstudio.getCvePlan(),
				planEstudio.getCveUniversidad());
	}

}
