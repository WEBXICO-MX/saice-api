package mx.edu.utrng.saiceapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.edu.utrng.saiceapi.domain.CalificacionAlumno;

public interface CalificacionAlumnoRepository extends CrudRepository<CalificacionAlumno, Integer> {
	public final static String consulta_calificaciones ="SELECT cal.cveMateria, m.nombre, g.cveGrupo, g.cveTurno, g.cvePeriodo ,g.grado,g.cveCarrera , g.idGrupo, m.horasPractica,m.horasTeoria, cal.uri1, cal.uri2, cal.uri3 FROM CalificacionAlumno cal, Materia m, Grupo g  WHERE cal.cveGrupo.cveUniversidad=:cveUniversidad AND cal.valida = 1 AND cal.cveAlumno.cveAlumno=:cveAlumno AND m.cveMateria = cal.cveMateria.cveMateria AND g.cveUniversidad = cal.cveGrupo.cveUniversidad AND g.cveGrupo = cal.cveGrupo.cveGrupo  ORDER BY g.cvePeriodo ASC,cal.cveMateria,m.nombre";

	@Query(consulta_calificaciones)
	public List<CalificacionAlumno> findBycveUniversidadAndcveAlumno(@Param("cveUniversidad") int cveUniversidad,@Param("cveAlumno") int cveAlumno);
}
