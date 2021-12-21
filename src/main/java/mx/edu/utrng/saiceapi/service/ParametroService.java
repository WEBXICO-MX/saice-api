package mx.edu.utrng.saiceapi.service;

import java.util.List;

import mx.edu.utrng.saiceapi.domain.Parametro;
import mx.edu.utrng.saiceapi.service.dto.ParametroBusquedaDTO;

public interface ParametroService {
	public List<Parametro> findCveParametroBy(ParametroBusquedaDTO parametro);
}
