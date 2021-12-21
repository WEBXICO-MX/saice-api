package mx.edu.utrng.saiceapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.edu.utrng.saiceapi.domain.Parametro;

public interface ParametroRepository extends CrudRepository<Parametro, Integer> {
	public List<Parametro> findByCveParametroInAndCvePeriodo(List<String> cveParametroList, int i);

}
