package mx.edu.utrng.saiceapi.service;

import mx.edu.utrng.saiceapi.domain.Periodo;
import mx.edu.utrng.saiceapi.service.dto.PeriodoBusquedaDTO;

public interface PeriodoService {
	public Periodo findPeriodoBy(PeriodoBusquedaDTO periodo);

}
