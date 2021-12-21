package mx.edu.utrng.saiceapi.service.dto;

public class GrupoMateriaDTO {
	private String cveMateria;
	private int cveGrupo;

	public GrupoMateriaDTO() {
		super();
	}

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	public int getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(int cveGrupo) {
		this.cveGrupo = cveGrupo;
	}

}
