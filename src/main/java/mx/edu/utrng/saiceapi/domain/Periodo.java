package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="periodos")
@IdClass(PeriodoId.class)
public class Periodo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="cve_periodo")
	private Integer cvePeriodo;
	@Id
	@Column(name="cve_universidad")
	private Integer cveUniversidad;
	private Integer cveCiclo;
	private Integer numeroPeriodo;
	private Integer ano;
	private Date fechaInicio;
	private Date fechaFin;
	private Boolean activo;

	public Periodo() {
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

	public Integer getCveCiclo() {
		return cveCiclo;
	}

	public void setCveCiclo(Integer cveCiclo) {
		this.cveCiclo = cveCiclo;
	}

	public Integer getNumeroPeriodo() {
		return numeroPeriodo;
	}

	public void setNumeroPeriodo(Integer numeroPeriodo) {
		this.numeroPeriodo = numeroPeriodo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Periodo [cvePeriodo=" + cvePeriodo + ", cveUniversidad=" + cveUniversidad + ", cveCiclo=" + cveCiclo
				+ ", numeroPeriodo=" + numeroPeriodo + ", ano=" + ano + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", activo=" + activo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, ano, cveCiclo, cvePeriodo, cveUniversidad, fechaFin, fechaInicio, numeroPeriodo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Periodo other = (Periodo) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(ano, other.ano)
				&& Objects.equals(cveCiclo, other.cveCiclo) && Objects.equals(cvePeriodo, other.cvePeriodo)
				&& Objects.equals(cveUniversidad, other.cveUniversidad) && Objects.equals(fechaFin, other.fechaFin)
				&& Objects.equals(fechaInicio, other.fechaInicio) && Objects.equals(numeroPeriodo, other.numeroPeriodo);
	}

}
