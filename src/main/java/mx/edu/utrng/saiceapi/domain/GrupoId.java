package mx.edu.utrng.saiceapi.domain;

import java.io.Serializable;
import java.util.Objects;

public class GrupoId implements Serializable {

	private static final long serialVersionUID = 1L;
	private int cveGrupo;
	private int cveTurno;
	private int cvePlan;
	private int cveCarrera;
	private int cveDivision;
	private int cveUnidadAcademica;
	private int cveUniversidad;
	private int cvePeriodo;

	public GrupoId() {
		super();
	}

	public GrupoId(int cveGrupo, int cveTurno, int cvePlan, int cveCarrera, int cveDivision, int cveUnidadAcademica,
			int cveUniversidad, int cvePeriodo) {
		super();
		this.cveGrupo = cveGrupo;
		this.cveTurno = cveTurno;
		this.cvePlan = cvePlan;
		this.cveCarrera = cveCarrera;
		this.cveDivision = cveDivision;
		this.cveUnidadAcademica = cveUnidadAcademica;
		this.cveUniversidad = cveUniversidad;
		this.cvePeriodo = cvePeriodo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cveCarrera, cveDivision, cveGrupo, cvePeriodo, cvePlan, cveTurno, cveUnidadAcademica,
				cveUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoId other = (GrupoId) obj;
		return cveCarrera == other.cveCarrera && cveDivision == other.cveDivision && cveGrupo == other.cveGrupo
				&& cvePeriodo == other.cvePeriodo && cvePlan == other.cvePlan && cveTurno == other.cveTurno
				&& cveUnidadAcademica == other.cveUnidadAcademica && cveUniversidad == other.cveUniversidad;
	}

}
