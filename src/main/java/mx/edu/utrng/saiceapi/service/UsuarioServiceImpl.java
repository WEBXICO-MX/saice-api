package mx.edu.utrng.saiceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utrng.saiceapi.domain.Usuario;
import mx.edu.utrng.saiceapi.repository.UsuarioRepository;
import mx.edu.utrng.saiceapi.service.dto.UsuarioBusquedaDTO;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario findByLoginNameAndContrasenia(UsuarioBusquedaDTO usuarioBusqueda) {

		return usuarioRepository.findByLoginUsuarioAndContrasenia(usuarioBusqueda.getLoginUsuario(), usuarioBusqueda.getContrasenia());
	}

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioRepository.findAll();
	}

}
