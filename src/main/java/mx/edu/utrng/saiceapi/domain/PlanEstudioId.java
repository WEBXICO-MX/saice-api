package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class PlanEstudioId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cvePlan;
	private Integer cveCarrera;
	private Integer cveDivision;
	private Integer cveUnidadAcademica;
	private Integer cveUniversidad;

	public PlanEstudioId() {
		super();
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

	@Override
	public int hashCode() {
		return Objects.hash(cveCarrera, cveDivision, cvePlan, cveUnidadAcademica, cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanEstudioId other = (PlanEstudioId) obj;
		return Objects.equals(cveCarrera, other.cveCarrera) && Objects.equals(cveDivision, other.cveDivision)
				&& Objects.equals(cvePlan, other.cvePlan)
				&& Objects.equals(cveUnidadAcademica, other.cveUnidadAcademica)
				&& Objects.equals(cveUniversidad, other.cveUniversidad);
	}

}
