package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class CalificacionAlumnoId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Grupo cveGrupo;
	private Alumno cveAlumno;
	private Materia cveMateria;

	public CalificacionAlumnoId() {
		super();
	}

	public CalificacionAlumnoId(Grupo cveGrupo, Alumno cveAlumno, Materia cveMateria) {
		super();
		this.cveGrupo = cveGrupo;
		this.cveAlumno = cveAlumno;
		this.cveMateria = cveMateria;
	}

	public Grupo getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(Grupo cveGrupo) {
		this.cveGrupo = cveGrupo;
	}

	public Alumno getCveAlumno() {
		return cveAlumno;
	}

	public void setCveAlumno(Alumno cveAlumno) {
		this.cveAlumno = cveAlumno;
	}

	public Materia getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(Materia cveMateria) {
		this.cveMateria = cveMateria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveAlumno, cveGrupo, cveMateria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalificacionAlumnoId other = (CalificacionAlumnoId) obj;
		return Objects.equals(cveAlumno, other.cveAlumno) && Objects.equals(cveGrupo, other.cveGrupo)
				&& Objects.equals(cveMateria, other.cveMateria);
	}

}
