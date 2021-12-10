package mx.edu.utrng.saiceapi.web.rest;

import java.util.List;

import mx.edu.utrng.saiceapi.domain.Usuario;
import mx.edu.utrng.saiceapi.service.dto.UsuarioBusquedaDTO;

public interface UsuarioController {
	public List<Usuario> getUsuarios();

	public Usuario getUsuario(UsuarioBusquedaDTO usuarioBusquedaDTO);

}
