package mx.edu.utrng.saiceapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utrng.saiceapi.domain.Periodo;
import mx.edu.utrng.saiceapi.repository.PeriodoRepository;
import mx.edu.utrng.saiceapi.service.dto.PeriodoBusquedaDTO;

@Service
public class PeriodoServiceImpl implements PeriodoService {

	@Autowired
	PeriodoRepository periodoRepository;
	
	
	@Override
	public Periodo findPeriodoBy(PeriodoBusquedaDTO periodo) {
		// TODO Auto-generated method stub
		return periodoRepository.findByCvePeriodoAndCveUniversidad(periodo.getCvePeriodo(), periodo.getCveUniversidad());
	}

}
