package mx.edu.utrng.saiceapi.web.rest;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import mx.edu.utrng.saiceapi.domain.Usuario;
import mx.edu.utrng.saiceapi.service.UsuarioService;
import mx.edu.utrng.saiceapi.service.dto.UsuarioBusquedaDTO;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping
	@RequestMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return usuarioService.findAll();
	}

	@PostMapping
	@RequestMapping("/usuario")
	public Usuario getUsuario(@Valid @RequestBody UsuarioBusquedaDTO usuarioBusquedaDTO) {
		// TODO Auto-generated method stub
		String token;
		Usuario busqueda = usuarioService.findByLoginNameAndContrasenia(usuarioBusquedaDTO);
		
		if(busqueda != null) {
			token = getJWTToken(usuarioBusquedaDTO.getLoginUsuario());
			busqueda.setToken(token);
		}
		
		return busqueda;
	}
	
	private String getJWTToken(String username) {
		String secretKey = "S41c3W3bx1c0.2021";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
}
