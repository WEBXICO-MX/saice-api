package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class GrupoMateriaId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cveGrupo;
	private Integer cveTurno;
	private Integer cvePeriodo;
	private Integer cvePlan;
	private Integer cveCarrera;
	private Integer cveDivision;
	private Integer cveUnidadAcademica;
	private Integer cveUniversidad;
	private String cveMateria;

	public GrupoMateriaId() {
		super();
	}

	public Integer getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(Integer cveGrupo) {
		this.cveGrupo = cveGrupo;
	}

	public Integer getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(Integer cveTurno) {
		this.cveTurno = cveTurno;
	}

	public Integer getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(Integer cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public Integer getCvePlan() {
		return cvePlan;
	}

	public void setCvePlan(Integer cvePlan) {
		this.cvePlan = cvePlan;
	}

	public Integer getCveCarrera() {
		return cveCarrera;
	}

	public void setCveCarrera(Integer cveCarrera) {
		this.cveCarrera = cveCarrera;
	}

	public Integer getCveDivision() {
		return cveDivision;
	}

	public void setCveDivision(Integer cveDivision) {
		this.cveDivision = cveDivision;
	}

	public Integer getCveUnidadAcademica() {
		return cveUnidadAcademica;
	}

	public void setCveUnidadAcademica(Integer cveUnidadAcademica) {
		this.cveUnidadAcademica = cveUnidadAcademica;
	}

	public Integer getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(Integer cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveCarrera, cveDivision, cveGrupo, cveMateria, cvePeriodo, cvePlan, cveTurno,
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
		GrupoMateriaId other = (GrupoMateriaId) obj;
		return Objects.equals(cveCarrera, other.cveCarrera) && Objects.equals(cveDivision, other.cveDivision)
				&& Objects.equals(cveGrupo, other.cveGrupo) && Objects.equals(cveMateria, other.cveMateria)
				&& Objects.equals(cvePeriodo, other.cvePeriodo) && Objects.equals(cvePlan, other.cvePlan)
				&& Objects.equals(cveTurno, other.cveTurno)
				&& Objects.equals(cveUnidadAcademica, other.cveUnidadAcademica)
				&& Objects.equals(cveUniversidad, other.cveUniversidad);
	}

}
