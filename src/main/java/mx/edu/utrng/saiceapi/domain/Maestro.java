package mx.edu.utrng.saiceapi.domain;

import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
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
@AttributeOverride(name = "cvePersona", column = @Column(name = "cve_maestro", insertable = false, updatable = false))
@Table(name = "maestros")
@IdClass(MaestroId.class)
public class Maestro extends Personal {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_maestro")
	private Integer cveMaestro;
	private Integer cveCarrera;
	private Integer cveDivision;
	private Integer cveUnidadAcademica;
	private boolean tiempoCompleto;
	private boolean activo;
	private boolean contratoIndefinido;
	private Integer horasBase;

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, mappedBy = "maestro")
	@JsonIgnore
	private Set<GrupoMateria> gruposMateria;

	public Maestro() {
		super();
	}

	public Integer getCveMaestro() {
		return cveMaestro;
	}

	public void setCveMaestro(Integer cveMaestro) {
		this.cveMaestro = cveMaestro;
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

	public boolean isTiempoCompleto() {
		return tiempoCompleto;
	}

	public void setTiempoCompleto(boolean tiempoCompleto) {
		this.tiempoCompleto = tiempoCompleto;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isContratoIndefinido() {
		return contratoIndefinido;
	}

	public void setContratoIndefinido(boolean contratoIndefinido) {
		this.contratoIndefinido = contratoIndefinido;
	}

	public Integer getHorasBase() {
		return horasBase;
	}

	public void setHorasBase(Integer horasBase) {
		this.horasBase = horasBase;
	}

	public Set<GrupoMateria> getGruposMateria() {
		return gruposMateria;
	}

	public void setGruposMateria(Set<GrupoMateria> gruposMateria) {
		this.gruposMateria = gruposMateria;
	}

	@Override
	public String toString() {
		return "Maestro [cveMaestro=" + cveMaestro + ", cveCarrera=" + cveCarrera + ", cveDivision=" + cveDivision
				+ ", cveUnidadAcademica=" + cveUnidadAcademica + ", tiempoCompleto=" + tiempoCompleto + ", activo="
				+ activo + ", contratoIndefinido=" + contratoIndefinido + ", horasBase=" + horasBase
				+ ", gruposMateria=" + gruposMateria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(activo, contratoIndefinido, cveCarrera, cveDivision, cveMaestro,
				cveUnidadAcademica, gruposMateria, horasBase, tiempoCompleto);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maestro other = (Maestro) obj;
		return activo == other.activo && contratoIndefinido == other.contratoIndefinido
				&& Objects.equals(cveCarrera, other.cveCarrera) && Objects.equals(cveDivision, other.cveDivision)
				&& Objects.equals(cveMaestro, other.cveMaestro)
				&& Objects.equals(cveUnidadAcademica, other.cveUnidadAcademica)
				&& Objects.equals(gruposMateria, other.gruposMateria) && Objects.equals(horasBase, other.horasBase)
				&& tiempoCompleto == other.tiempoCompleto;
	}

}
