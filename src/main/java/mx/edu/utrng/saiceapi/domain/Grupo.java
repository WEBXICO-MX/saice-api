package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="grupos")
@IdClass(GrupoId.class)
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int cveGrupo;
	@Id
	private int cveTurno;
	@Id
	private int cvePlan;
	@Id
	private int cveCarrera;
	@Id
	private int cveDivision;
	@Id
	private int cveUnidadAcademica;
	@Id
	private int cveUniversidad;
	@Id
	private int cvePeriodo;
	private int cveMaestro;
	private byte grado;
	private String idGrupo;
	private int capacidadMaxima;
	private int numeroRepetidores;

	public Grupo() {
		super();
	}

	public Grupo(int cveGrupo, int cveTurno, int cvePlan, int cveCarrera, int cveDivision, int cveUnidadAcademica,
			int cveUniversidad, int cvePeriodo, int cveMaestro, byte grado, String idGrupo, int capacidadMaxima,
			int numeroRepetidores) {
		super();
		this.cveGrupo = cveGrupo;
		this.cveTurno = cveTurno;
		this.cvePlan = cvePlan;
		this.cveCarrera = cveCarrera;
		this.cveDivision = cveDivision;
		this.cveUnidadAcademica = cveUnidadAcademica;
		this.cveUniversidad = cveUniversidad;
		this.cvePeriodo = cvePeriodo;
		this.cveMaestro = cveMaestro;
		this.grado = grado;
		this.idGrupo = idGrupo;
		this.capacidadMaxima = capacidadMaxima;
		this.numeroRepetidores = numeroRepetidores;
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

	public int getCveMaestro() {
		return cveMaestro;
	}

	public void setCveMaestro(int cveMaestro) {
		this.cveMaestro = cveMaestro;
	}

	public byte getGrado() {
		return grado;
	}

	public void setGrado(byte grado) {
		this.grado = grado;
	}

	public String getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getNumeroRepetidores() {
		return numeroRepetidores;
	}

	public void setNumeroRepetidores(int numeroRepetidores) {
		this.numeroRepetidores = numeroRepetidores;
	}

	@Override
	public String toString() {
		return "Grupo [cveGrupo=" + cveGrupo + ", cveTurno=" + cveTurno + ", cvePlan=" + cvePlan + ", cveCarrera="
				+ cveCarrera + ", cveDivision=" + cveDivision + ", cveUnidadAcademica=" + cveUnidadAcademica
				+ ", cveUniversidad=" + cveUniversidad + ", cvePeriodo=" + cvePeriodo + ", cveMaestro=" + cveMaestro
				+ ", grado=" + grado + ", idGrupo=" + idGrupo + ", capacidadMaxima=" + capacidadMaxima
				+ ", numeroRepetidores=" + numeroRepetidores + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacidadMaxima, cveCarrera, cveDivision, cveGrupo, cveMaestro, cvePeriodo, cvePlan,
				cveTurno, cveUnidadAcademica, cveUniversidad, grado, idGrupo, numeroRepetidores);
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
		return capacidadMaxima == other.capacidadMaxima && cveCarrera == other.cveCarrera
				&& cveDivision == other.cveDivision && cveGrupo == other.cveGrupo && cveMaestro == other.cveMaestro
				&& cvePeriodo == other.cvePeriodo && cvePlan == other.cvePlan && cveTurno == other.cveTurno
				&& cveUnidadAcademica == other.cveUnidadAcademica && cveUniversidad == other.cveUniversidad
				&& grado == other.grado && Objects.equals(idGrupo, other.idGrupo)
				&& numeroRepetidores == other.numeroRepetidores;
	}

}
