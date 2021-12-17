package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "materias")
public class Materia implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cve_materia")
	private String cveMateria;
	private Integer cveAreaConocimiento;
	private String nombre;
	private Byte horasPractica;
	private Byte horasTeoria;
	private Byte horasCuatrimestre;
	private Byte creditos;
	private Boolean curricular;
	private Boolean opcional;
	private Boolean activo;
	private Integer horasLab;
	private String distribucion;
	private Integer cveUsuario;
	private Date fechaModificacion;
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, mappedBy = "materia")
	@JsonIgnore
	private Set<CalificacionAlumno> calificacionesAlumno;

	public Materia() {
		super();
	}

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	public Integer getCveAreaConocimiento() {
		return cveAreaConocimiento;
	}

	public void setCveAreaConocimiento(Integer cveAreaConocimiento) {
		this.cveAreaConocimiento = cveAreaConocimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Byte getHorasPractica() {
		return horasPractica;
	}

	public void setHorasPractica(Byte horasPractica) {
		this.horasPractica = horasPractica;
	}

	public Byte getHorasTeoria() {
		return horasTeoria;
	}

	public void setHorasTeoria(Byte horasTeoria) {
		this.horasTeoria = horasTeoria;
	}

	public Byte getHorasCuatrimestre() {
		return horasCuatrimestre;
	}

	public void setHorasCuatrimestre(Byte horasCuatrimestre) {
		this.horasCuatrimestre = horasCuatrimestre;
	}

	public Byte getCreditos() {
		return creditos;
	}

	public void setCreditos(Byte creditos) {
		this.creditos = creditos;
	}

	public Boolean getCurricular() {
		return curricular;
	}

	public void setCurricular(Boolean curricular) {
		this.curricular = curricular;
	}

	public Boolean getOpcional() {
		return opcional;
	}

	public void setOpcional(Boolean opcional) {
		this.opcional = opcional;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Integer getHorasLab() {
		return horasLab;
	}

	public void setHorasLab(Integer horasLab) {
		this.horasLab = horasLab;
	}

	public String getDistribucion() {
		return distribucion;
	}

	public void setDistribucion(String distribucion) {
		this.distribucion = distribucion;
	}

	public Integer getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(Integer cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Set<CalificacionAlumno> getCalificacionesAlumno() {
		return calificacionesAlumno;
	}

	public void setCalificacionesAlumno(Set<CalificacionAlumno> calificacionesAlumno) {
		this.calificacionesAlumno = calificacionesAlumno;
	}

	@Override
	public String toString() {
		return "Materia [cveMateria=" + cveMateria + ", cveAreaConocimiento=" + cveAreaConocimiento + ", nombre="
				+ nombre + ", horasPractica=" + horasPractica + ", horasTeoria=" + horasTeoria + ", horasCuatrimestre="
				+ horasCuatrimestre + ", creditos=" + creditos + ", curricular=" + curricular + ", opcional=" + opcional
				+ ", activo=" + activo + ", horasLab=" + horasLab + ", distribucion=" + distribucion + ", cveUsuario="
				+ cveUsuario + ", fechaModificacion=" + fechaModificacion + "]";
	}

}
