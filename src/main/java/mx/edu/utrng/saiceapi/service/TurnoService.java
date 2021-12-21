package mx.edu.utrng.saiceapi.service;

import mx.edu.utrng.saiceapi.domain.Turno;
import mx.edu.utrng.saiceapi.service.dto.TurnoBusquedaDTO;

public interface TurnoService {
	public Turno findTurnoBy(TurnoBusquedaDTO turno);

}
