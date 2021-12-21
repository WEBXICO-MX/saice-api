package mx.edu.utrng.saiceapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utrng.saiceapi.domain.Parametro;
import mx.edu.utrng.saiceapi.repository.ParametroRepository;
import mx.edu.utrng.saiceapi.service.dto.ParametroBusquedaDTO;

@Service
public class ParametroServiceImpl implements ParametroService {
	@Autowired
	ParametroRepository parametroRepository;
	
	@Override
	public List<Parametro> findCveParametroBy(ParametroBusquedaDTO parametro) {
		// TODO Auto-generated method stub
		List<String> parametros = Arrays.asList(parametro.getCveParametros().split(",", -1));
		return parametroRepository.findByCveParametroInAndCvePeriodoAndCveUniversidad(parametros, parametro.getCvePeriodo(),parametro.getCveUniversidad());
	}

}
