package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class CalificacionAlumnoId implements Serializable {

	private static final long serialVersionUID = 1L;
	private int cveGrupo;
	private int cveTurno;
	private int cvePlan;
	private int cveCarrera;
	private int cveDivision;
	private int cveUnidadAcademica;
	private int cveUniversidad;
	private int cvePeriodo;
	private int cveAlumno;
	private String cveMateria;

	public CalificacionAlumnoId() {
		super();
	}

	public CalificacionAlumnoId(int cveGrupo, int cveTurno, int cvePlan, int cveCarrera, int cveDivision,
			int cveUnidadAcademica, int cveUniversidad, int cvePeriodo, int cveAlumno, String cveMateria) {
		super();
		this.cveGrupo = cveGrupo;
		this.cveTurno = cveTurno;
		this.cvePlan = cvePlan;
		this.cveCarrera = cveCarrera;
		this.cveDivision = cveDivision;
		this.cveUnidadAcademica = cveUnidadAcademica;
		this.cveUniversidad = cveUniversidad;
		this.cvePeriodo = cvePeriodo;
		this.cveAlumno = cveAlumno;
		this.cveMateria = cveMateria;
	}

	public int getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(int cveGrupo) {
		this.cveGrupo = cveGrupo;
	}

	public int getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(int cveTurno) {
		this.cveTurno = cveTurno;
	}

	public int getCvePlan() {
		return cvePlan;
	}

	public void setCvePlan(int cvePlan) {
		this.cvePlan = cvePlan;
	}

	public int getCveCarrera() {
		return cveCarrera;
	}

	public void setCveCarrera(int cveCarrera) {
		this.cveCarrera = cveCarrera;
	}

	public int getCveDivision() {
		return cveDivision;
	}

	public void setCveDivision(int cveDivision) {
		this.cveDivision = cveDivision;
	}

	public int getCveUnidadAcademica() {
		return cveUnidadAcademica;
	}

	public void setCveUnidadAcademica(int cveUnidadAcademica) {
		this.cveUnidadAcademica = cveUnidadAcademica;
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public int getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(int cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public int getCveAlumno() {
		return cveAlumno;
	}

	public void setCveAlumno(int cveAlumno) {
		this.cveAlumno = cveAlumno;
	}

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveAlumno, cveCarrera, cveDivision, cveGrupo, cveMateria, cvePeriodo, cvePlan, cveTurno,
				cveUnidadAcademica, cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalificacionAlumnoId other = (CalificacionAlumnoId) obj;
		return cveAlumno == other.cveAlumno && cveCarrera == other.cveCarrera && cveDivision == other.cveDivision
				&& cveGrupo == other.cveGrupo && Objects.equals(cveMateria, other.cveMateria)
				&& cvePeriodo == other.cvePeriodo && cvePlan == other.cvePlan && cveTurno == other.cveTurno
				&& cveUnidadAcademica == other.cveUnidadAcademica && cveUniversidad == other.cveUniversidad;
	}

}
