package mx.edu.utrng.saiceapi.web.rest;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utrng.saiceapi.domain.Usuario;
import mx.edu.utrng.saiceapi.service.UsuarioService;
import mx.edu.utrng.saiceapi.service.dto.UsuarioBusquedaDTO;

@RestController
@RequestMapping("/api")
public class UsuarioControllerImpl implements UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@Override
	@GetMapping
	@RequestMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return usuarioService.findAll();
	}

	@Override
	@PostMapping
	@RequestMapping("/usuario")
	public Usuario getUsuario(@Valid @RequestBody UsuarioBusquedaDTO usuarioBusquedaDTO) {
		// TODO Auto-generated method stub
		return usuarioService.findByLoginNameAndContrasenia(usuarioBusquedaDTO);
	}

}
