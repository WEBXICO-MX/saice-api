package mx.edu.utrng.saiceapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utrng.saiceapi.domain.Turno;
import mx.edu.utrng.saiceapi.repository.TurnoRepository;
import mx.edu.utrng.saiceapi.service.dto.TurnoBusquedaDTO;

@Service
public class TurnoServiceImpl implements TurnoService {

	@Autowired
	TurnoRepository turnoRepository;

	@Override
	public Turno findTurnoBy(TurnoBusquedaDTO turno) {
		// TODO Auto-generated method stub
		return turnoRepository.findByCveTurnoAndCveUniversidad(turno.getCveTurno(), turno.getCveUniversidad());
	}

}
