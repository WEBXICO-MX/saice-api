package mx.edu.utrng.saiceapi.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utrng.saiceapi.domain.GrupoMateria;
import mx.edu.utrng.saiceapi.service.GrupoMateriaService;
import mx.edu.utrng.saiceapi.service.dto.GrupoMateriaDTO;

@RestController
@RequestMapping("/api")
public class GrupoMateriaController {
	@Autowired
	GrupoMateriaService grupoMateriaService;

	@PostMapping
	@RequestMapping("/gm")
	public List<GrupoMateria> getGrupos(@Valid @RequestBody GrupoMateriaDTO GrupoMateriaBusqueda) {
		return grupoMateriaService.findByCveMateriaAndCveGrupo(GrupoMateriaBusqueda);
	}

}
