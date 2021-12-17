package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class PersonaId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer cvePersona;
	private Integer cveUniversidad;

	public PersonaId() {
		super();
	}

	public Integer getCvePersona() {
		return cvePersona;
	}

	public void setCvePersona(Integer cvePersona) {
		this.cvePersona = cvePersona;
	}

	public Integer getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(Integer cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cvePersona, cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaId other = (PersonaId) obj;
		return Objects.equals(cvePersona, other.cvePersona) && Objects.equals(cveUniversidad, other.cveUniversidad);
	}

}
