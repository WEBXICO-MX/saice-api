package mx.edu.utrng.saiceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utrng.saiceapi.domain.GrupoMateria;
import mx.edu.utrng.saiceapi.repository.GrupoMateriaRepository;
import mx.edu.utrng.saiceapi.service.dto.GrupoMateriaDTO;

@Service
public class GrupoMateriaServiceImpl implements GrupoMateriaService {

	@Autowired
	GrupoMateriaRepository grupoMateriaRepository;

	@Override
	public List<GrupoMateria> findByCveMateriaAndCveGrupo(GrupoMateriaDTO grupoMateria) {
		// TODO Auto-generated method stub
		return grupoMateriaRepository.findByCveMateriaAndCveGrupo(grupoMateria.getCveMateria(),
				grupoMateria.getCveGrupo());
	}

}
