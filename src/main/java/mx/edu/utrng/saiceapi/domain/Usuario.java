package mx.edu.utrng.saiceapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "habilitados")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cve_persona")
	private long cvePersona;
	@Column(name = "login_usuario")
	private String loginUsuario;
	@Column(name = "contrasena")
	private String contrasenia;
	@Transient
	private String token;

	public Usuario() {
		super();
	}

	public Usuario(long cvePersona, String loginUsuario, String contrasenia) {
		super();
		this.cvePersona = cvePersona;
		this.loginUsuario = loginUsuario;
		this.contrasenia = contrasenia;
	}

	public long getCvePersona() {
		return cvePersona;
	}

	public void setCvePersona(long cvePersona) {
		this.cvePersona = cvePersona;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Usuario [cvePersona=" + cvePersona + ", loginUsuario=" + loginUsuario + ", contrasenia=" + contrasenia
				+ "]";
	}

}
