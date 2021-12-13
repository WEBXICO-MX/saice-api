package mx.edu.utrng.saiceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaiceApiApplication.class, args);
	}
	
	/*
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, "/api/usuario").permitAll()
				.anyRequest().authenticated();
		}
	}*/

}
