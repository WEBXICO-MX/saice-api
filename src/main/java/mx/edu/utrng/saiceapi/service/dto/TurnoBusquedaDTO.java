package mx.edu.utrng.saiceapi.service.dto;

public class TurnoBusquedaDTO {
	private int cveTurno;
	private int cveUniversidad;

	public TurnoBusquedaDTO() {
		super();
	}

	public int getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(int cveTurno) {
		this.cveTurno = cveTurno;
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

}
