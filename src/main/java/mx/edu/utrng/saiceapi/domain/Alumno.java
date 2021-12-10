package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
@IdClass(AlumnoId.class)
public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int cveAlumno;
	@Id
	private int cveUniversidad;
	private String matricula;
	private int cveGrupo;
	private int cvePlan;
	private int cveCarrera;
	private int cveDivision;
	private int cveUnidadAcademica;
	private int cveTurno;
	private int cveStatus;
	private int cvePeriodoActual;
	private byte gradoActual;
	private Date fechaAlta;
	private boolean becado;
	private String notas;
	private boolean activo;
	private int cveGeneracion;
	private int cvePeriodoInicio;
	private int cveGeneracionActual;
	private String cedulaProfesional;

	public Alumno() {
		super();
	}

	public Alumno(int cveAlumno, int cveUniversidad, String matricula, int cveGrupo, int cvePlan, int cveCarrera,
			int cveDivision, int cveUnidadAcademica, int cveTurno, int cveStatus, int cvePeriodoActual,
			byte gradoActual, Date fechaAlta, boolean becado, String notas, boolean activo, int cveGeneracion,
			int cvePeriodoInicio, int cveGeneracionActual, String cedulaProfesional) {
		super();
		this.cveAlumno = cveAlumno;
		this.cveUniversidad = cveUniversidad;
		this.matricula = matricula;
		this.cveGrupo = cveGrupo;
		this.cvePlan = cvePlan;
		this.cveCarrera = cveCarrera;
		this.cveDivision = cveDivision;
		this.cveUnidadAcademica = cveUnidadAcademica;
		this.cveTurno = cveTurno;
		this.cveStatus = cveStatus;
		this.cvePeriodoActual = cvePeriodoActual;
		this.gradoActual = gradoActual;
		this.fechaAlta = fechaAlta;
		this.becado = becado;
		this.notas = notas;
		this.activo = activo;
		this.cveGeneracion = cveGeneracion;
		this.cvePeriodoInicio = cvePeriodoInicio;
		this.cveGeneracionActual = cveGeneracionActual;
		this.cedulaProfesional = cedulaProfesional;
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

	public int getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(int cveGrupo) {
		this.cveGrupo = cveGrupo;
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

	public int getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(int cveTurno) {
		this.cveTurno = cveTurno;
	}

	public int getCveStatus() {
		return cveStatus;
	}

	public void setCveStatus(int cveStatus) {
		this.cveStatus = cveStatus;
	}

	public int getCvePeriodoActual() {
		return cvePeriodoActual;
	}

	public void setCvePeriodoActual(int cvePeriodoActual) {
		this.cvePeriodoActual = cvePeriodoActual;
	}

	public byte getGradoActual() {
		return gradoActual;
	}

	public void setGradoActual(byte gradoActual) {
		this.gradoActual = gradoActual;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getCveGeneracion() {
		return cveGeneracion;
	}

	public void setCveGeneracion(int cveGeneracion) {
		this.cveGeneracion = cveGeneracion;
	}

	public int getCvePeriodoInicio() {
		return cvePeriodoInicio;
	}

	public void setCvePeriodoInicio(int cvePeriodoInicio) {
		this.cvePeriodoInicio = cvePeriodoInicio;
	}

	public int getCveGeneracionActual() {
		return cveGeneracionActual;
	}

	public void setCveGeneracionActual(int cveGeneracionActual) {
		this.cveGeneracionActual = cveGeneracionActual;
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
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
		return Objects.hash(activo, becado, cedulaProfesional, cveAlumno, cveCarrera, cveDivision, cveGeneracion,
				cveGeneracionActual, cveGrupo, cvePeriodoActual, cvePeriodoInicio, cvePlan, cveStatus, cveTurno,
				cveUnidadAcademica, cveUniversidad, fechaAlta, gradoActual, matricula, notas);
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
		return activo == other.activo && becado == other.becado
				&& Objects.equals(cedulaProfesional, other.cedulaProfesional) && cveAlumno == other.cveAlumno
				&& cveCarrera == other.cveCarrera && cveDivision == other.cveDivision
				&& cveGeneracion == other.cveGeneracion && cveGeneracionActual == other.cveGeneracionActual
				&& cveGrupo == other.cveGrupo && cvePeriodoActual == other.cvePeriodoActual
				&& cvePeriodoInicio == other.cvePeriodoInicio && cvePlan == other.cvePlan
				&& cveStatus == other.cveStatus && cveTurno == other.cveTurno
				&& cveUnidadAcademica == other.cveUnidadAcademica && cveUniversidad == other.cveUniversidad
				&& Objects.equals(fechaAlta, other.fechaAlta) && gradoActual == other.gradoActual
				&& Objects.equals(matricula, other.matricula) && Objects.equals(notas, other.notas);
	}

}
