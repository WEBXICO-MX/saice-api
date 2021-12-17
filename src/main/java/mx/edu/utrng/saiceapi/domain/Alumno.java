package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "alumnos")
@IdClass(AlumnoId.class)
public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_alumno")
	private int cveAlumno;
	@Id
	@Column(name = "cve_universidad")
	private int cveUniversidad;
	private String matricula;
	private Integer cveGrupo;
	private Integer cvePlan;
	private Integer cveCarrera;
	private Integer cveDivision;
	private Integer cveUnidadAcademica;
	private Integer cveTurno;
	private Integer cveStatus;
	private Integer cvePeriodoActual;
	private Byte gradoActual;
	private Date fechaAlta;
	private Boolean becado;
	private String notas;
	private Boolean activo;
	private Integer cveGeneracion;
	private Integer cvePeriodoInicio;
	private Integer cveGeneracionActual;
	private String cedulaProfesional;
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, mappedBy = "alumno")
	@JsonIgnore
	private Set<CalificacionAlumno> calificacionesAlumno;

	public Alumno() {
		super();
	}

	public int getCveAlumno() {
		return cveAlumno;
	}

	public void setCveAlumno(int cveAlumno) {
		this.cveAlumno = cveAlumno;
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(Integer cveGrupo) {
		this.cveGrupo = cveGrupo;
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

	public Integer getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(Integer cveTurno) {
		this.cveTurno = cveTurno;
	}

	public Integer getCveStatus() {
		return cveStatus;
	}

	public void setCveStatus(Integer cveStatus) {
		this.cveStatus = cveStatus;
	}

	public Integer getCvePeriodoActual() {
		return cvePeriodoActual;
	}

	public void setCvePeriodoActual(Integer cvePeriodoActual) {
		this.cvePeriodoActual = cvePeriodoActual;
	}

	public Byte getGradoActual() {
		return gradoActual;
	}

	public void setGradoActual(Byte gradoActual) {
		this.gradoActual = gradoActual;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Boolean getBecado() {
		return becado;
	}

	public void setBecado(Boolean becado) {
		this.becado = becado;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Integer getCveGeneracion() {
		return cveGeneracion;
	}

	public void setCveGeneracion(Integer cveGeneracion) {
		this.cveGeneracion = cveGeneracion;
	}

	public Integer getCvePeriodoInicio() {
		return cvePeriodoInicio;
	}

	public void setCvePeriodoInicio(Integer cvePeriodoInicio) {
		this.cvePeriodoInicio = cvePeriodoInicio;
	}

	public Integer getCveGeneracionActual() {
		return cveGeneracionActual;
	}

	public void setCveGeneracionActual(Integer cveGeneracionActual) {
		this.cveGeneracionActual = cveGeneracionActual;
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	public Set<CalificacionAlumno> getCalificacionesAlumno() {
		return calificacionesAlumno;
	}

	public void setCalificacionesAlumno(Set<CalificacionAlumno> calificacionesAlumno) {
		this.calificacionesAlumno = calificacionesAlumno;
	}

	@Override
	public String toString() {
		return "Alumno [cveAlumno=" + cveAlumno + ", cveUniversidad=" + cveUniversidad + ", matricula=" + matricula
				+ ", cveGrupo=" + cveGrupo + ", cvePlan=" + cvePlan + ", cveCarrera=" + cveCarrera + ", cveDivision="
				+ cveDivision + ", cveUnidadAcademica=" + cveUnidadAcademica + ", cveTurno=" + cveTurno + ", cveStatus="
				+ cveStatus + ", cvePeriodoActual=" + cvePeriodoActual + ", gradoActual=" + gradoActual + ", fechaAlta="
				+ fechaAlta + ", becado=" + becado + ", notas=" + notas + ", activo=" + activo + ", cveGeneracion="
				+ cveGeneracion + ", cvePeriodoInicio=" + cvePeriodoInicio + ", cveGeneracionActual="
				+ cveGeneracionActual + ", cedulaProfesional=" + cedulaProfesional + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, becado, calificacionesAlumno, cedulaProfesional, cveAlumno, cveCarrera, cveDivision,
				cveGeneracion, cveGeneracionActual, cveGrupo, cvePeriodoActual, cvePeriodoInicio, cvePlan, cveStatus,
				cveTurno, cveUnidadAcademica, cveUniversidad, fechaAlta, gradoActual, matricula, notas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(becado, other.becado)
				&& Objects.equals(calificacionesAlumno, other.calificacionesAlumno)
				&& Objects.equals(cedulaProfesional, other.cedulaProfesional) && cveAlumno == other.cveAlumno
				&& Objects.equals(cveCarrera, other.cveCarrera) && Objects.equals(cveDivision, other.cveDivision)
				&& Objects.equals(cveGeneracion, other.cveGeneracion)
				&& Objects.equals(cveGeneracionActual, other.cveGeneracionActual)
				&& Objects.equals(cveGrupo, other.cveGrupo) && Objects.equals(cvePeriodoActual, other.cvePeriodoActual)
				&& Objects.equals(cvePeriodoInicio, other.cvePeriodoInicio) && Objects.equals(cvePlan, other.cvePlan)
				&& Objects.equals(cveStatus, other.cveStatus) && Objects.equals(cveTurno, other.cveTurno)
				&& Objects.equals(cveUnidadAcademica, other.cveUnidadAcademica)
				&& cveUniversidad == other.cveUniversidad && Objects.equals(fechaAlta, other.fechaAlta)
				&& Objects.equals(gradoActual, other.gradoActual) && Objects.equals(matricula, other.matricula)
				&& Objects.equals(notas, other.notas);
	}

}
