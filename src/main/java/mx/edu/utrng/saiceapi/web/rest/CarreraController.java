package mx.edu.utrng.saiceapi.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 * REST controller for Carreras info
 */
@RestController
@RequestMapping("/api")
public class CarreraController {

	@Value("classpath:data/carreras.json")
	Resource resourceFile;

	@GetMapping
	@RequestMapping("/carreras")
	public ResponseEntity<JsonNode> getCarreras() throws IOException {
		InputStream str = resourceFile.getInputStream();
		String jsonCarreras = "";

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(str))) {
			jsonCarreras = reader.lines().collect(Collectors.joining("\n"));
		}

		str.close();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode json = mapper.readTree(jsonCarreras);
		return ResponseEntity.ok(json);
	}

}
