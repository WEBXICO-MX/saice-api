package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class AlumnoId implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cveAlumno;
	private int cveUniversidad;

	public AlumnoId() {
		super();
	}

	public AlumnoId(int cveAlumno, int cveUniversidad) {
		super();
		this.cveAlumno = cveAlumno;
		this.cveUniversidad = cveUniversidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveAlumno, cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlumnoId other = (AlumnoId) obj;
		return cveAlumno == other.cveAlumno && cveUniversidad == other.cveUniversidad;
	}

}
