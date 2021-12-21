package mx.edu.utrng.saiceapi.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.utrng.saiceapi.domain.PlanEstudio;

public interface PlanEstudioRepository extends CrudRepository<PlanEstudio, Integer> {
	PlanEstudio findByCvePlanAndCveUniversidad(int cvePlan, int cveUniversidad);
}
