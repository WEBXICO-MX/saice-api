package mx.edu.utrng.saiceapi.domain;

import java.util.Date;
import java.util.Objects;

import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "personal")
@IdClass(PersonalId.class)
public class Personal extends Persona {

	private static final long serialVersionUID = 1L;
	private Integer cvePuesto;
	private Integer cveCategoria;
	private Integer cveOrganigrama;
	private String numeroNomina;
	private Integer numeroTarjeta;
	private Date fechaAdscripcion;
	private Boolean activo;
	private Double salario;
	private Date fechaAlta;
	private Integer cveCapturo;
	private Date fechaCaptura;
	private Integer cveTipoContratacion;

	public Personal() {
		super();
	}

	public Integer getCvePuesto() {
		return cvePuesto;
	}

	public void setCvePuesto(Integer cvePuesto) {
		this.cvePuesto = cvePuesto;
	}

	public Integer getCveCategoria() {
		return cveCategoria;
	}

	public void setCveCategoria(Integer cveCategoria) {
		this.cveCategoria = cveCategoria;
	}

	public Integer getCveOrganigrama() {
		return cveOrganigrama;
	}

	public void setCveOrganigrama(Integer cveOrganigrama) {
		this.cveOrganigrama = cveOrganigrama;
	}

	public String getNumeroNomina() {
		return numeroNomina;
	}

	public void setNumeroNomina(String numeroNomina) {
		this.numeroNomina = numeroNomina;
	}

	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Date getFechaAdscripcion() {
		return fechaAdscripcion;
	}

	public void setFechaAdscripcion(Date fechaAdscripcion) {
		this.fechaAdscripcion = fechaAdscripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getCveCapturo() {
		return cveCapturo;
	}

	public void setCveCapturo(Integer cveCapturo) {
		this.cveCapturo = cveCapturo;
	}

	public Date getFechaCaptura() {
		return fechaCaptura;
	}

	public void setFechaCaptura(Date fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}

	public Integer getCveTipoContratacion() {
		return cveTipoContratacion;
	}

	public void setCveTipoContratacion(Integer cveTipoContratacion) {
		this.cveTipoContratacion = cveTipoContratacion;
	}

	@Override
	public String toString() {
		return "Personal [cvePuesto=" + cvePuesto + ", cveCategoria=" + cveCategoria + ", cveOrganigrama="
				+ cveOrganigrama + ", numeroNomina=" + numeroNomina + ", numeroTarjeta=" + numeroTarjeta
				+ ", fechaAdscripcion=" + fechaAdscripcion + ", activo=" + activo + ", salario=" + salario
				+ ", fechaAlta=" + fechaAlta + ", cveCapturo=" + cveCapturo + ", fechaCaptura=" + fechaCaptura
				+ ", cveTipoContratacion=" + cveTipoContratacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(activo, cveCapturo, cveCategoria, cveOrganigrama, cvePuesto,
				cveTipoContratacion, fechaAdscripcion, fechaAlta, fechaCaptura, numeroNomina, numeroTarjeta, salario);
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
		Personal other = (Personal) obj;
		return activo == other.activo && Objects.equals(cveCapturo, other.cveCapturo)
				&& Objects.equals(cveCategoria, other.cveCategoria)
				&& Objects.equals(cveOrganigrama, other.cveOrganigrama) && Objects.equals(cvePuesto, other.cvePuesto)
				&& Objects.equals(cveTipoContratacion, other.cveTipoContratacion)
				&& Objects.equals(fechaAdscripcion, other.fechaAdscripcion)
				&& Objects.equals(fechaAlta, other.fechaAlta) && Objects.equals(fechaCaptura, other.fechaCaptura)
				&& Objects.equals(numeroNomina, other.numeroNomina)
				&& Objects.equals(numeroTarjeta, other.numeroTarjeta) && Objects.equals(salario, other.salario);
	}

}
