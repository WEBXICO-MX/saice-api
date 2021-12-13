package mx.edu.utrng.saiceapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.edu.utrng.saiceapi.domain.CalificacionAlumno;

public interface CalificacionAlumnoRepository extends CrudRepository<CalificacionAlumno, Integer> {
	public final static String consulta_calificaciones ="SELECT cal FROM CalificacionAlumno cal WHERE  cal.valida = true AND cal.cveAlumno.cveAlumno=:cveAlumno AND cal.cveAlumno.cveUniversidad = :cveUniversidad";

	@Query(consulta_calificaciones)
	public List<CalificacionAlumno> findBycveUniversidadAndcveAlumno(@Param("cveUniversidad") int cveUniversidad,@Param("cveAlumno") int cveAlumno);
}
