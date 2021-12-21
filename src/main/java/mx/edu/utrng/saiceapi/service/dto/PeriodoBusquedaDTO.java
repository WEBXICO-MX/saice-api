package mx.edu.utrng.saiceapi.service.dto;

public class PeriodoBusquedaDTO {
	private int cvePeriodo;
	private int cveUniversidad;

	public PeriodoBusquedaDTO() {
		super();
	}

	public int getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(int cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

}
