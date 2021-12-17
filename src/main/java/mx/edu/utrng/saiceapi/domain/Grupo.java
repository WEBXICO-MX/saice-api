package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "grupos")
@IdClass(GrupoId.class)
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_grupo")
	private int cveGrupo;
	@Id
	@Column(name = "cve_turno")
	private int cveTurno;
	@Id
	@Column(name = "cve_plan")
	private int cvePlan;
	@Id
	@Column(name = "cve_carrera")
	private int cveCarrera;
	@Id
	@Column(name = "cve_division")
	private int cveDivision;
	@Id
	@Column(name = "cve_unidad_academica")
	private int cveUnidadAcademica;
	@Id
	@Column(name = "cve_universidad")
	private int cveUniversidad;
	@Id
	@Column(name = "cve_periodo")
	private int cvePeriodo;
	private Integer cveMaestro;
	private Byte grado;
	private String idGrupo;
	private Integer capacidadMaxima;
	private Integer numeroRepetidores;
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, mappedBy = "grupo")
	@JsonIgnore
	private Set<CalificacionAlumno> calificacionesAlumno;

	public Grupo() {
		super();
	}

	public int getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(int cveGrupo) {
		this.cveGrupo = cveGrupo;
	}

	public int getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(int cveTurno) {
		this.cveTurno = cveTurno;
	}

	public int getCvePlan() {
		return cvePlan;
	}

	public void setCvePlan(int cvePlan) {
		this.cvePlan = cvePlan;
	}

	public int getCveCarrera() {
		return cveCarrera;
	}

	public void setCveCarrera(int cveCarrera) {
		this.cveCarrera = cveCarrera;
	}

	public int getCveDivision() {
		return cveDivision;
	}

	public void setCveDivision(int cveDivision) {
		this.cveDivision = cveDivision;
	}

	public int getCveUnidadAcademica() {
		return cveUnidadAcademica;
	}

	public void setCveUnidadAcademica(int cveUnidadAcademica) {
		this.cveUnidadAcademica = cveUnidadAcademica;
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public int getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(int cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public Integer getCveMaestro() {
		return cveMaestro;
	}

	public void setCveMaestro(Integer cveMaestro) {
		this.cveMaestro = cveMaestro;
	}

	public Byte getGrado() {
		return grado;
	}

	public void setGrado(Byte grado) {
		this.grado = grado;
	}

	public String getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Integer getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Integer getNumeroRepetidores() {
		return numeroRepetidores;
	}

	public void setNumeroRepetidores(Integer numeroRepetidores) {
		this.numeroRepetidores = numeroRepetidores;
	}

	public Set<CalificacionAlumno> getCalificacionesAlumno() {
		return calificacionesAlumno;
	}

	public void setCalificacionesAlumno(Set<CalificacionAlumno> calificacionesAlumno) {
		this.calificacionesAlumno = calificacionesAlumno;
	}

	@Override
	public String toString() {
		return "Grupo [cveGrupo=" + cveGrupo + ", cveTurno=" + cveTurno + ", cvePlan=" + cvePlan + ", cveCarrera="
				+ cveCarrera + ", cveDivision=" + cveDivision + ", cveUnidadAcademica=" + cveUnidadAcademica
				+ ", cveUniversidad=" + cveUniversidad + ", cvePeriodo=" + cvePeriodo + ", cveMaestro=" + cveMaestro
				+ ", grado=" + grado + ", idGrupo=" + idGrupo + ", capacidadMaxima=" + capacidadMaxima
				+ ", numeroRepetidores=" + numeroRepetidores + ", getCveGrupo()=" + getCveGrupo() + ", getCveTurno()="
				+ getCveTurno() + ", getCvePlan()=" + getCvePlan() + ", getCveCarrera()=" + getCveCarrera()
				+ ", getCveDivision()=" + getCveDivision() + ", getCveUnidadAcademica()=" + getCveUnidadAcademica()
				+ ", getCveUniversidad()=" + getCveUniversidad() + ", getCvePeriodo()=" + getCvePeriodo()
				+ ", getCveMaestro()=" + getCveMaestro() + ", getGrado()=" + getGrado() + ", getIdGrupo()="
				+ getIdGrupo() + ", getCapacidadMaxima()=" + getCapacidadMaxima() + ", getNumeroRepetidores()="
				+ getNumeroRepetidores() + ", getCalificacionesAlumno()=" + getCalificacionesAlumno() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(calificacionesAlumno, capacidadMaxima, cveCarrera, cveDivision, cveGrupo, cveMaestro,
				cvePeriodo, cvePlan, cveTurno, cveUnidadAcademica, cveUniversidad, grado, idGrupo, numeroRepetidores);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		return Objects.equals(calificacionesAlumno, other.calificacionesAlumno)
				&& Objects.equals(capacidadMaxima, other.capacidadMaxima) && cveCarrera == other.cveCarrera
				&& cveDivision == other.cveDivision && cveGrupo == other.cveGrupo
				&& Objects.equals(cveMaestro, other.cveMaestro) && cvePeriodo == other.cvePeriodo
				&& cvePlan == other.cvePlan && cveTurno == other.cveTurno
				&& cveUnidadAcademica == other.cveUnidadAcademica && cveUniversidad == other.cveUniversidad
				&& Objects.equals(grado, other.grado) && Objects.equals(idGrupo, other.idGrupo)
				&& Objects.equals(numeroRepetidores, other.numeroRepetidores);
	}

}
