package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class MaestroId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer cveMaestro;
	private Integer cveUniversidad;

	public MaestroId() {
		super();
	}

	public Integer getCveMaestro() {
		return cveMaestro;
	}

	public void setCveMaestro(Integer cveMaestro) {
		this.cveMaestro = cveMaestro;
	}

	public Integer getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(Integer cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	@Override
	public String toString() {
		return "MaestroId [cveMaestro=" + cveMaestro + ", cveUniversidad=" + cveUniversidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveMaestro, cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaestroId other = (MaestroId) obj;
		return Objects.equals(cveMaestro, other.cveMaestro) && Objects.equals(cveUniversidad, other.cveUniversidad);
	}

}
