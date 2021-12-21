package mx.edu.utrng.saiceapi.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.utrng.saiceapi.domain.Turno;

public interface TurnoRepository extends CrudRepository<Turno, Integer> {
	Turno findByCveTurnoAndCveUniversidad(int cveTurno, int cveUniversidad);
}
