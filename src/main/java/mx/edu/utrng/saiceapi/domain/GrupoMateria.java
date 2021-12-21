package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grupo_materia")
@IdClass(GrupoMateriaId.class)
public class GrupoMateria implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_grupo")
	private Integer cveGrupo;
	@Id
	@Column(name = "cve_turno")
	private Integer cveTurno;
	@Id
	@Column(name = "cve_periodo")
	private Integer cvePeriodo;
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
	@Id
	@Column(name = "cve_materia")
	private String cveMateria;

	@Column(name = "cve_maestro")
	private Integer cveMaestro;
	private Integer cveAula;
	private Byte cveEdificio;
	private Integer unidades;

	@ManyToOne(optional = false)
	@JoinColumns({
			@JoinColumn(name = "cve_maestro", referencedColumnName = "cve_maestro", insertable = false, updatable = false),
			@JoinColumn(name = "cve_universidad", referencedColumnName = "cve_universidad", insertable = false, updatable = false) })
	private Maestro maestro;

	public GrupoMateria() {
		super();
	}

	public Integer getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(Integer cveGrupo) {
		this.cveGrupo = cveGrupo;
	}

	public Integer getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(Integer cveTurno) {
		this.cveTurno = cveTurno;
	}

	public Integer getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(Integer cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
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

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	public Integer getCveMaestro() {
		return cveMaestro;
	}

	public void setCveMaestro(Integer cveMaestro) {
		this.cveMaestro = cveMaestro;
	}

	public Integer getCveAula() {
		return cveAula;
	}

	public void setCveAula(Integer cveAula) {
		this.cveAula = cveAula;
	}

	public Byte getCveEdificio() {
		return cveEdificio;
	}

	public void setCveEdificio(Byte cveEdificio) {
		this.cveEdificio = cveEdificio;
	}

	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}

	public Maestro getMaestro() {
		return maestro;
	}

	public void setMaestro(Maestro maestro) {
		this.maestro = maestro;
	}

	@Override
	public String toString() {
		return "GrupoMateria [cveGrupo=" + cveGrupo + ", cveTurno=" + cveTurno + ", cvePeriodo=" + cvePeriodo
				+ ", cvePlan=" + cvePlan + ", cveCarrera=" + cveCarrera + ", cveDivision=" + cveDivision
				+ ", cveUnidadAcademica=" + cveUnidadAcademica + ", cveUniversidad=" + cveUniversidad + ", cveMateria="
				+ cveMateria + ", cveMaestro=" + cveMaestro + ", cveAula=" + cveAula + ", cveEdificio=" + cveEdificio
				+ ", unidades=" + unidades + ", maestro=" + maestro + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveAula, cveCarrera, cveDivision, cveEdificio, cveGrupo, cveMaestro, cveMateria, cvePeriodo,
				cvePlan, cveTurno, cveUnidadAcademica, cveUniversidad, maestro, unidades);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoMateria other = (GrupoMateria) obj;
		return Objects.equals(cveAula, other.cveAula) && Objects.equals(cveCarrera, other.cveCarrera)
				&& Objects.equals(cveDivision, other.cveDivision) && Objects.equals(cveEdificio, other.cveEdificio)
				&& Objects.equals(cveGrupo, other.cveGrupo) && Objects.equals(cveMaestro, other.cveMaestro)
				&& Objects.equals(cveMateria, other.cveMateria) && Objects.equals(cvePeriodo, other.cvePeriodo)
				&& Objects.equals(cvePlan, other.cvePlan) && Objects.equals(cveTurno, other.cveTurno)
				&& Objects.equals(cveUnidadAcademica, other.cveUnidadAcademica)
				&& Objects.equals(cveUniversidad, other.cveUniversidad) && Objects.equals(maestro, other.maestro)
				&& Objects.equals(unidades, other.unidades);
	}

}
