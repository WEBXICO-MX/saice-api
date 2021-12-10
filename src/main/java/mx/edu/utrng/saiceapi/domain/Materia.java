package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
public class Materia implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cve_materia")
	private String cveMateria;
	private int cveAreaConocimiento;
	private String nombre;
	private byte horasPractica;
	private byte horasTeoria;
	private byte horasCuatrimestre;
	private byte creditos;
	private boolean curricular;
	private boolean opcional;
	private boolean activo;
	private int horasLab;
	private String distribucion;
	private int cveUsuario;
	private Date fechaModificacion;

	public Materia() {
		super();
	}

	public Materia(String cveMateria, int cveAreaConocimiento, String nombre, byte horasPractica, byte horasTeoria,
			byte horasCuatrimestre, byte creditos, boolean curricular, boolean opcional, boolean activo, int horasLab,
			String distribucion, int cveUsuario, Date fechaModificacion) {
		super();
		this.cveMateria = cveMateria;
		this.cveAreaConocimiento = cveAreaConocimiento;
		this.nombre = nombre;
		this.horasPractica = horasPractica;
		this.horasTeoria = horasTeoria;
		this.horasCuatrimestre = horasCuatrimestre;
		this.creditos = creditos;
		this.curricular = curricular;
		this.opcional = opcional;
		this.activo = activo;
		this.horasLab = horasLab;
		this.distribucion = distribucion;
		this.cveUsuario = cveUsuario;
		this.fechaModificacion = fechaModificacion;
	}

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	public int getCveAreaConocimiento() {
		return cveAreaConocimiento;
	}

	public void setCveAreaConocimiento(int cveAreaConocimiento) {
		this.cveAreaConocimiento = cveAreaConocimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getHorasPractica() {
		return horasPractica;
	}

	public void setHorasPractica(byte horasPractica) {
		this.horasPractica = horasPractica;
	}

	public byte getHorasTeoria() {
		return horasTeoria;
	}

	public void setHorasTeoria(byte horasTeoria) {
		this.horasTeoria = horasTeoria;
	}

	public byte getHorasCuatrimestre() {
		return horasCuatrimestre;
	}

	public void setHorasCuatrimestre(byte horasCuatrimestre) {
		this.horasCuatrimestre = horasCuatrimestre;
	}

	public byte getCreditos() {
		return creditos;
	}

	public void setCreditos(byte creditos) {
		this.creditos = creditos;
	}

	public boolean isCurricular() {
		return curricular;
	}

	public void setCurricular(boolean curricular) {
		this.curricular = curricular;
	}

	public boolean isOpcional() {
		return opcional;
	}

	public void setOpcional(boolean opcional) {
		this.opcional = opcional;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getHorasLab() {
		return horasLab;
	}

	public void setHorasLab(int horasLab) {
		this.horasLab = horasLab;
	}

	public String getDistribucion() {
		return distribucion;
	}

	public void setDistribucion(String distribucion) {
		this.distribucion = distribucion;
	}

	public int getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(int cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String toString() {
		return "Materia [cveMateria=" + cveMateria + ", cveAreaConocimiento=" + cveAreaConocimiento + ", nombre="
				+ nombre + ", horasPractica=" + horasPractica + ", horasTeoria=" + horasTeoria + ", horasCuatrimestre="
				+ horasCuatrimestre + ", creditos=" + creditos + ", curricular=" + curricular + ", opcional=" + opcional
				+ ", activo=" + activo + ", horasLab=" + horasLab + ", distribucion=" + distribucion + ", cveUsuario="
				+ cveUsuario + ", fechaModificacion=" + fechaModificacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, creditos, curricular, cveAreaConocimiento, cveMateria, cveUsuario, distribucion,
				fechaModificacion, horasCuatrimestre, horasLab, horasPractica, horasTeoria, nombre, opcional);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return activo == other.activo && creditos == other.creditos && curricular == other.curricular
				&& cveAreaConocimiento == other.cveAreaConocimiento && Objects.equals(cveMateria, other.cveMateria)
				&& cveUsuario == other.cveUsuario && Objects.equals(distribucion, other.distribucion)
				&& Objects.equals(fechaModificacion, other.fechaModificacion)
				&& horasCuatrimestre == other.horasCuatrimestre && horasLab == other.horasLab
				&& horasPractica == other.horasPractica && horasTeoria == other.horasTeoria
				&& Objects.equals(nombre, other.nombre) && opcional == other.opcional;
	}

}
