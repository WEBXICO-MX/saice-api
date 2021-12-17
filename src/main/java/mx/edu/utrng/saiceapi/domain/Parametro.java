package mx.edu.utrng.saiceapi.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "parametros")
@IdClass(ParametroId.class)
public class Parametro {
	@Id
	@Column(name="cve_universidad")
	private Integer cveUniversidad;
	@Id
	@Column(name="cve_periodo")
	private Integer cvePeriodo;
	@Id
	private String cveParametro;
	private String descripcion;
	private String valor;

	public Parametro() {
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

	public String getCveParametro() {
		return cveParametro;
	}

	public void setCveParametro(String cveParametro) {
		this.cveParametro = cveParametro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Parametro [cveUniversidad=" + cveUniversidad + ", cvePeriodo=" + cvePeriodo + ", cveParametro="
				+ cveParametro + ", descripcion=" + descripcion + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveParametro, cvePeriodo, cveUniversidad, descripcion, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parametro other = (Parametro) obj;
		return Objects.equals(cveParametro, other.cveParametro) && Objects.equals(cvePeriodo, other.cvePeriodo)
				&& Objects.equals(cveUniversidad, other.cveUniversidad)
				&& Objects.equals(descripcion, other.descripcion) && Objects.equals(valor, other.valor);
	}

}
