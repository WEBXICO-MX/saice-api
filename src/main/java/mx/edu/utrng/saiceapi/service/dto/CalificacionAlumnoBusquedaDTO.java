package mx.edu.utrng.saiceapi.service.dto;

public class CalificacionAlumnoBusquedaDTO {
	private int cveUniversidad;
	private int cveAlumno;

	public CalificacionAlumnoBusquedaDTO() {
		super();
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public int getCveAlumno() {
		return cveAlumno;
	}

	public void setCveAlumno(int cveAlumno) {
		this.cveAlumno = cveAlumno;
	}

}
