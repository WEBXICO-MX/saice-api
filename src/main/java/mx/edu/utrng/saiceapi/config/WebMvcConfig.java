package mx.edu.utrng.saiceapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
	// De acuerdo con los requisitos, reescriba los diversos métodos definidos por
	// la interfaz WebMvcConfigurer para personalizar Spring MVC
	@Override
	public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
		// ...
	}

	// ...
}
