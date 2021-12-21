package mx.edu.utrng.saiceapi.domain;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "planes_estudio")
@IdClass(PlanEstudioId.class)
public class PlanEstudio {
	@Id
	@Column(name = "cve_plan")
	private Integer cvePlan;
	@Id
	@Column(name = "cve_carrera")
	private Integer cveCarrera;
	@Id
	@Column(name = "cve_division")
	private Integer cveDivision;
	@Id
	@Column(name = "cve_unidad_academica")
	private Integer cveUnidadAcademica;
	@Id
	@Column(name = "cve_universidad")
	private Integer cveUniversidad;
	private String cveCgut;
	private Integer cvePeriodoInicio;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String notas;
	private Boolean vigente;
	private Integer anioAutorizacion;
	private Integer materiasCompetencias;

	public PlanEstudio() {
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

	public String getCveCgut() {
		return cveCgut;
	}

	public void setCveCgut(String cveCgut) {
		this.cveCgut = cveCgut;
	}

	public Integer getCvePeriodoInicio() {
		return cvePeriodoInicio;
	}

	public void setCvePeriodoInicio(Integer cvePeriodoInicio) {
		this.cvePeriodoInicio = cvePeriodoInicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public Boolean getVigente() {
		return vigente;
	}

	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}

	public Integer getAnioAutorizacion() {
		return anioAutorizacion;
	}

	public void setAnioAutorizacion(Integer anioAutorizacion) {
		this.anioAutorizacion = anioAutorizacion;
	}

	public Integer getMateriasCompetencias() {
		return materiasCompetencias;
	}

	public void setMateriasCompetencias(Integer materiasCompetencias) {
		this.materiasCompetencias = materiasCompetencias;
	}

	@Override
	public String toString() {
		return "PlanEstudio [cvePlan=" + cvePlan + ", cveCarrera=" + cveCarrera + ", cveDivision=" + cveDivision
				+ ", cveUnidadAcademica=" + cveUnidadAcademica + ", cveUniversidad=" + cveUniversidad + ", cveCgut="
				+ cveCgut + ", cvePeriodoInicio=" + cvePeriodoInicio + ", nombre=" + nombre + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", notas=" + notas + ", vigente=" + vigente
				+ ", anioAutorizacion=" + anioAutorizacion + ", materiasCompetencias=" + materiasCompetencias + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anioAutorizacion, cveCarrera, cveCgut, cveDivision, cvePeriodoInicio, cvePlan,
				cveUnidadAcademica, cveUniversidad, fechaFin, fechaInicio, materiasCompetencias, nombre, notas,
				vigente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanEstudio other = (PlanEstudio) obj;
		return Objects.equals(anioAutorizacion, other.anioAutorizacion) && Objects.equals(cveCarrera, other.cveCarrera)
				&& Objects.equals(cveCgut, other.cveCgut) && Objects.equals(cveDivision, other.cveDivision)
				&& Objects.equals(cvePeriodoInicio, other.cvePeriodoInicio) && Objects.equals(cvePlan, other.cvePlan)
				&& Objects.equals(cveUnidadAcademica, other.cveUnidadAcademica)
				&& Objects.equals(cveUniversidad, other.cveUniversidad) && Objects.equals(fechaFin, other.fechaFin)
				&& Objects.equals(fechaInicio, other.fechaInicio)
				&& Objects.equals(materiasCompetencias, other.materiasCompetencias)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(notas, other.notas)
				&& Objects.equals(vigente, other.vigente);
	}

}
