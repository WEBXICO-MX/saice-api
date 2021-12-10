package mx.edu.utrng.saiceapi.service;

import java.util.List;

import mx.edu.utrng.saiceapi.domain.Usuario;
import mx.edu.utrng.saiceapi.service.dto.UsuarioBusquedaDTO;

public interface UsuarioService {
	public Usuario findByLoginNameAndContrasenia(UsuarioBusquedaDTO usuarioBusqueda);

	public List<Usuario> findAll();
}
