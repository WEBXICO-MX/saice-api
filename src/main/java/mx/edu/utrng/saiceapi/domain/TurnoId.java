package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class TurnoId implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cveTurno;
	private Integer cveUniversidad;

	public TurnoId() {
		super();
	}

	public Integer getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(Integer cveTurno) {
		this.cveTurno = cveTurno;
	}

	public Integer getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(Integer cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveTurno, cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TurnoId other = (TurnoId) obj;
		return Objects.equals(cveTurno, other.cveTurno) && Objects.equals(cveUniversidad, other.cveUniversidad);
	}

}
