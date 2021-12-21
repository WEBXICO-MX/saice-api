package mx.edu.utrng.saiceapi.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utrng.saiceapi.domain.Parametro;
import mx.edu.utrng.saiceapi.service.ParametroService;
import mx.edu.utrng.saiceapi.service.dto.ParametroBusquedaDTO;

@RestController
@RequestMapping("/api")
public class ParametroController {

	@Autowired
	ParametroService parametroService;

	@PostMapping
	@RequestMapping("/parametros")
	public List<Parametro> getParametros(@Valid @RequestBody ParametroBusquedaDTO parametroBusqueda) {
		// TODO Auto-generated method stub
		return parametroService.findCveParametroBy(parametroBusqueda);
	}
}
