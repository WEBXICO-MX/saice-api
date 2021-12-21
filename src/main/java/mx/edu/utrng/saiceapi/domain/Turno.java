package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "turnos")
@IdClass(TurnoId.class)
public class Turno implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_turno")
	private Integer cveTurno;
	@Id
	@Column(name = "cve_universidad")
	private Integer cveUniversidad;
	private String descripcion;
	private Boolean activo;
	private Integer duracion;

	public Turno() {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Turno [cveTurno=" + cveTurno + ", cveUniversidad=" + cveUniversidad + ", descripcion=" + descripcion
				+ ", activo=" + activo + ", duracion=" + duracion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, cveTurno, cveUniversidad, descripcion, duracion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turno other = (Turno) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(cveTurno, other.cveTurno)
				&& Objects.equals(cveUniversidad, other.cveUniversidad)
				&& Objects.equals(descripcion, other.descripcion) && Objects.equals(duracion, other.duracion);
	}

}
