package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class ParametroId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer cveUniversidad;
	private Integer cvePeriodo;

	public ParametroId() {
		super();
	}

	public Integer getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(Integer cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public Integer getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(Integer cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
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
		ParametroId other = (ParametroId) obj;
		return Objects.equals(cvePeriodo, other.cvePeriodo) && Objects.equals(cveUniversidad, other.cveUniversidad);
	}

}
