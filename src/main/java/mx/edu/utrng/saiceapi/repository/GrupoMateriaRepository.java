package mx.edu.utrng.saiceapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.edu.utrng.saiceapi.domain.GrupoMateria;

public interface GrupoMateriaRepository extends CrudRepository<GrupoMateria, Integer> {
	List<GrupoMateria> findByCveMateriaAndCveGrupo(String cveMateria, int cveGrupo);
}
