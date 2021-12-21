package mx.edu.utrng.saiceapi.service.dto;

public class PlanEstudioBusquedaDTO {
	private int cvePlan;
	private int cveUniversidad;

	public PlanEstudioBusquedaDTO() {
		super();
	}

	public int getCvePlan() {
		return cvePlan;
	}

	public void setCvePlan(int cvePlan) {
		this.cvePlan = cvePlan;
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

}
