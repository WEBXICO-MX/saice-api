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
@Table(name = "personas")
@IdClass(PersonaId.class)
public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_persona")
	private Integer cvePersona;
	@Id
	@Column(name = "cve_universidad")
	private Integer cveUniversidad;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private Byte cveEstadoCivil;
	private Byte cveTipoPersona;
	private Integer cvePais;
	private String rfc;
	private Date fechaNacimiento;
	private String curp;
	private String sexo;
	private Integer cveTipoSangre;
	private Double peso;
	private Double estatura;
	private Boolean famDiabetico;
	private Boolean famHipertenso;
	private Boolean famCardiaco;
	private Boolean esMadre;
	private Boolean esSindicalizado;
	private Integer domicilioPrincipal;
	private Integer cveEstado;
	private Boolean discapacidad;
	private Integer cveEtnia;

	public Persona() {
		super();
	}

	public Integer getCvePersona() {
		return cvePersona;
	}

	public void setCvePersona(Integer cvePersona) {
		this.cvePersona = cvePersona;
	}

	public Integer getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(Integer cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}

	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}

	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public Byte getCveEstadoCivil() {
		return cveEstadoCivil;
	}

	public void setCveEstadoCivil(Byte cveEstadoCivil) {
		this.cveEstadoCivil = cveEstadoCivil;
	}

	public Byte getCveTipoPersona() {
		return cveTipoPersona;
	}

	public void setCveTipoPersona(Byte cveTipoPersona) {
		this.cveTipoPersona = cveTipoPersona;
	}

	public Integer getCvePais() {
		return cvePais;
	}

	public void setCvePais(Integer cvePais) {
		this.cvePais = cvePais;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getCveTipoSangre() {
		return cveTipoSangre;
	}

	public void setCveTipoSangre(Integer cveTipoSangre) {
		this.cveTipoSangre = cveTipoSangre;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Boolean getFamDiabetico() {
		return famDiabetico;
	}

	public void setFamDiabetico(Boolean famDiabetico) {
		this.famDiabetico = famDiabetico;
	}

	public Boolean getFamHipertenso() {
		return famHipertenso;
	}

	public void setFamHipertenso(Boolean famHipertenso) {
		this.famHipertenso = famHipertenso;
	}

	public Boolean getFamCardiaco() {
		return famCardiaco;
	}

	public void setFamCardiaco(Boolean famCardiaco) {
		this.famCardiaco = famCardiaco;
	}

	public Boolean getEsMadre() {
		return esMadre;
	}

	public void setEsMadre(Boolean esMadre) {
		this.esMadre = esMadre;
	}

	public Boolean getEsSindicalizado() {
		return esSindicalizado;
	}

	public void setEsSindicalizado(Boolean esSindicalizado) {
		this.esSindicalizado = esSindicalizado;
	}

	public Integer getDomicilioPrincipal() {
		return domicilioPrincipal;
	}

	public void setDomicilioPrincipal(Integer domicilioPrincipal) {
		this.domicilioPrincipal = domicilioPrincipal;
	}

	public Integer getCveEstado() {
		return cveEstado;
	}

	public void setCveEstado(Integer cveEstado) {
		this.cveEstado = cveEstado;
	}

	public Boolean getDiscapacidad() {
		return discapacidad;
	}

	public void setDiscapacidad(Boolean discapacidad) {
		this.discapacidad = discapacidad;
	}

	public Integer getCveEtnia() {
		return cveEtnia;
	}

	public void setCveEtnia(Integer cveEtnia) {
		this.cveEtnia = cveEtnia;
	}

	@Override
	public String toString() {
		return "Persona [cvePersona=" + cvePersona + ", cveUniversidad=" + cveUniversidad + ", nombre=" + nombre
				+ ", apellidoPat=" + apellidoPat + ", apellidoMat=" + apellidoMat + ", cveEstadoCivil=" + cveEstadoCivil
				+ ", cveTipoPersona=" + cveTipoPersona + ", cvePais=" + cvePais + ", rfc=" + rfc + ", fechaNacimiento="
				+ fechaNacimiento + ", curp=" + curp + ", sexo=" + sexo + ", cveTipoSangre=" + cveTipoSangre + ", peso="
				+ peso + ", estatura=" + estatura + ", famDiabetico=" + famDiabetico + ", famHipertenso="
				+ famHipertenso + ", famCardiaco=" + famCardiaco + ", esMadre=" + esMadre + ", esSindicalizado="
				+ esSindicalizado + ", domicilioPrincipal=" + domicilioPrincipal + ", cveEstado=" + cveEstado
				+ ", discapacidad=" + discapacidad + ", cveEtnia=" + cveEtnia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidoMat, apellidoPat, curp, cveEstado, cveEstadoCivil, cveEtnia, cvePais, cvePersona,
				cveTipoPersona, cveTipoSangre, cveUniversidad, discapacidad, domicilioPrincipal, esMadre,
				esSindicalizado, estatura, famCardiaco, famDiabetico, famHipertenso, fechaNacimiento, nombre, peso, rfc,
				sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidoMat, other.apellidoMat) && Objects.equals(apellidoPat, other.apellidoPat)
				&& Objects.equals(curp, other.curp) && Objects.equals(cveEstado, other.cveEstado)
				&& Objects.equals(cveEstadoCivil, other.cveEstadoCivil) && Objects.equals(cveEtnia, other.cveEtnia)
				&& Objects.equals(cvePais, other.cvePais) && Objects.equals(cvePersona, other.cvePersona)
				&& Objects.equals(cveTipoPersona, other.cveTipoPersona)
				&& Objects.equals(cveTipoSangre, other.cveTipoSangre)
				&& Objects.equals(cveUniversidad, other.cveUniversidad)
				&& Objects.equals(discapacidad, other.discapacidad)
				&& Objects.equals(domicilioPrincipal, other.domicilioPrincipal)
				&& Objects.equals(esMadre, other.esMadre) && Objects.equals(esSindicalizado, other.esSindicalizado)
				&& Objects.equals(estatura, other.estatura) && Objects.equals(famCardiaco, other.famCardiaco)
				&& Objects.equals(famDiabetico, other.famDiabetico)
				&& Objects.equals(famHipertenso, other.famHipertenso)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(peso, other.peso) && Objects.equals(rfc, other.rfc)
				&& Objects.equals(sexo, other.sexo);
	}

}
