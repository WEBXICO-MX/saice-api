package mx.edu.utrng.saiceapi.service;

import java.util.List;

import mx.edu.utrng.saiceapi.domain.GrupoMateria;
import mx.edu.utrng.saiceapi.service.dto.GrupoMateriaDTO;

public interface GrupoMateriaService {
	public List<GrupoMateria> findByCveMateriaAndCveGrupo(GrupoMateriaDTO grupoMateria);

}
