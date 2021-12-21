package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class PeriodoId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer cvePeriodo;
	private Integer cveUniversidad;

	public PeriodoId() {
		super();
	}

	public Integer getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(Integer cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public Integer getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(Integer cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cvePeriodo, cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeriodoId other = (PeriodoId) obj;
		return Objects.equals(cvePeriodo, other.cvePeriodo) && Objects.equals(cveUniversidad, other.cveUniversidad);
	}

}
