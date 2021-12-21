package mx.edu.utrng.saiceapi.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.utrng.saiceapi.domain.Periodo;

public interface PeriodoRepository extends CrudRepository<Periodo, Integer> {
	Periodo findByCvePeriodoAndCveUniversidad(int cvePeriodo, int cveUniversidad);

}
