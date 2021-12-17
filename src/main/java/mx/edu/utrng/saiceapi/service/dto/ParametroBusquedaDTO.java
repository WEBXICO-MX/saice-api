package mx.edu.utrng.saiceapi.service.dto;


public class ParametroBusquedaDTO {
	private String cveParametros;
	private int cvePeriodo;

	public ParametroBusquedaDTO() {
		super();
	}

	public String getCveParametros() {
		return cveParametros;
	}

	public void setCveParametros(String cveParametros) {
		this.cveParametros = cveParametros;
	}

	public int getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(int cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

}
