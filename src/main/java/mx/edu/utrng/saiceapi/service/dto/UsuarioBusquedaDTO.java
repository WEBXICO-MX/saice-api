package mx.edu.utrng.saiceapi.service.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UsuarioBusquedaDTO {

	@Size(max = 10)
	@NotBlank(message = "loginUsuario is mandatory")
	private String loginUsuario;
	@Size(max = 10)
	@NotBlank(message = "contrasenia is mandatory")
	private String contrasenia;

	public UsuarioBusquedaDTO() {
		super();
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
		this.contrasenia = encriptarContrasena(contrasenia);
	}

	public String encriptarContrasena(String contrasena) {
		try {

			String original = "ABCDEFGHIJKLMN\321OPQRSTUVWXYZabcdefghijklmn\361opqrstuvwxyz1234567890!$%&/()=?\277\241,.-;:_ ";
			String encriptada = "Uqyh.-aJ,g4TPVDE/2WZ15uBC78b3X:_ 6AOHIYrstNFGvcj\361z\321def)=?\277\241omKL90!(i$%&QRklwxnMSp;";
			String temporal = "";
			label0: for (int x = 0; x < contrasena.length(); x++) {
				int y = 0;
				do {
					if (y >= original.length()) {
						continue label0;
					}
					char xContrasena = contrasena.charAt(x);
					char xOriginal = original.charAt(y);
					if (xContrasena == xOriginal) {
						if ((x + 1) % 2 == 0) {
							temporal = String.valueOf(temporal) + String.valueOf(encriptada.charAt(y));
							continue label0;
						}
						if (y == encriptada.length()) {
							temporal = String.valueOf(temporal) + String.valueOf(encriptada.charAt(1));
						} else {
							temporal = String.valueOf(temporal) + String.valueOf(encriptada.charAt(y + 1));
						}
						continue label0;
					}
					y++;
				} while (true);
			}

			String cadenaEncriptada = temporal;
			return cadenaEncriptada;
		} catch (Exception e) {
			String cadenaEncriptada = "";
			return cadenaEncriptada;

		}
	}

	@Override
	public String toString() {
		return "UsuarioBusquedaDTO [loginUsuario=" + loginUsuario + ", contrasenia=" + contrasenia + "]";
	}

}
