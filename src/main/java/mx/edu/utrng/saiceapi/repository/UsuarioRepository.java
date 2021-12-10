package mx.edu.utrng.saiceapi.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.utrng.saiceapi.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	Usuario findByLoginUsuarioAndContrasenia(String loginUsuario, String contrasenia);
}
