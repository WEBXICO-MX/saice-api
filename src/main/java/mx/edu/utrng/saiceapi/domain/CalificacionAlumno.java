package mx.edu.utrng.saiceapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "calificaciones_alumno")
@IdClass(CalificacionAlumnoId.class)
public class CalificacionAlumno {
	@Id
	@Column(name = "cve_grupo")
	private int cveGrupo;
	@Id
	@Column(name = "cve_turno")
	private int cveTurno;
	@Id
	@Column(name = "cve_plan")
	private int cvePlan;
	@Id
	@Column(name = "cve_carrera")
	private int cveCarrera;
	@Id
	@Column(name = "cve_division")
	private int cveDivision;
	@Id
	@Column(name = "cve_unidad_academica")
	private int cveUnidadAcademica;
	@Id
	@Column(name = "cve_universidad")
	private int cveUniversidad;
	@Id
	@Column(name = "cve_periodo")
	private int cvePeriodo;
	@Id
	@Column(name = "cve_alumno")
	private int cveAlumno;
	@Id
	@Column(name = "cve_materia")
	private String cveMateria;
	private Date fcf;
	private Double cf;
	private Boolean valida;
	private Double cm1;
	private Date fcm1;
	@Column(name = "cr1_1")
	private Double cr11;
	@Column(name = "caro1_1")
	private Integer caro11;
	@Column(name = "fcr1_1")
	private Date fcr11;
	private Double cm2;
	private Date fcm2;
	@Column(name = "cr2_1")
	private Double cr21;
	@Column(name = "caro2_1")
	private Integer caro21;
	@Column(name = "fcr2_1")
	private Date fcr21;
	private Double cm3;
	private Date fcm3;
	@Column(name = "cr3_1")
	private Double cr31;
	@Column(name = "caro3_1")
	private Integer caro31;
	@Column(name = "fcr3_1")
	private Date fcr31;
	private Double cfr1;
	private Integer carf1;
	private Date fcfr1;
	private Boolean exento;
	@Column(name = "uri_1")
	private Boolean uri1;
	@Column(name = "uri_2")
	private Boolean uri2;
	@Column(name = "uri_3")
	private Boolean uri3;

	@ManyToOne(optional = false)
	@JoinColumns({
			@JoinColumn(name = "cve_grupo", referencedColumnName = "cve_grupo", insertable = false, updatable = false),
			@JoinColumn(name = "cve_turno", referencedColumnName = "cve_turno", insertable = false, updatable = false),
			@JoinColumn(name = "cve_plan", referencedColumnName = "cve_plan", insertable = false, updatable = false),
			@JoinColumn(name = "cve_carrera", referencedColumnName = "cve_carrera", insertable = false, updatable = false),
			@JoinColumn(name = "cve_division", referencedColumnName = "cve_division", insertable = false, updatable = false),
			@JoinColumn(name = "cve_unidad_academica", referencedColumnName = "cve_unidad_academica", insertable = false, updatable = false),
			@JoinColumn(name = "cve_universidad", referencedColumnName = "cve_universidad", insertable = false, updatable = false),
			@JoinColumn(name = "cve_periodo", referencedColumnName = "cve_periodo", insertable = false, updatable = false) })
	private Grupo grupo;

	@ManyToOne(optional = false)
	@JoinColumns({
			@JoinColumn(name = "cve_alumno", referencedColumnName = "cve_alumno", insertable = false, updatable = false),
			@JoinColumn(name = "cve_universidad", referencedColumnName = "cve_universidad", insertable = false, updatable = false) })
	private Alumno alumno;
	@ManyToOne(optional = false)
	@JoinColumn(name = "cve_materia", referencedColumnName = "cve_materia", insertable = false, updatable = false)
	private Materia materia;

	public CalificacionAlumno() {
		super();
	}

	public int getCveGrupo() {
		return cveGrupo;
	}

	public void setCveGrupo(int cveGrupo) {
		this.cveGrupo = cveGrupo;
	}

	public int getCveTurno() {
		return cveTurno;
	}

	public void setCveTurno(int cveTurno) {
		this.cveTurno = cveTurno;
	}

	public int getCvePlan() {
		return cvePlan;
	}

	public void setCvePlan(int cvePlan) {
		this.cvePlan = cvePlan;
	}

	public int getCveCarrera() {
		return cveCarrera;
	}

	public void setCveCarrera(int cveCarrera) {
		this.cveCarrera = cveCarrera;
	}

	public int getCveDivision() {
		return cveDivision;
	}

	public void setCveDivision(int cveDivision) {
		this.cveDivision = cveDivision;
	}

	public int getCveUnidadAcademica() {
		return cveUnidadAcademica;
	}

	public void setCveUnidadAcademica(int cveUnidadAcademica) {
		this.cveUnidadAcademica = cveUnidadAcademica;
	}

	public int getCveUniversidad() {
		return cveUniversidad;
	}

	public void setCveUniversidad(int cveUniversidad) {
		this.cveUniversidad = cveUniversidad;
	}

	public int getCvePeriodo() {
		return cvePeriodo;
	}

	public void setCvePeriodo(int cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public int getCveAlumno() {
		return cveAlumno;
	}

	public void setCveAlumno(int cveAlumno) {
		this.cveAlumno = cveAlumno;
	}

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	public Date getFcf() {
		return fcf;
	}

	public void setFcf(Date fcf) {
		this.fcf = fcf;
	}

	public Double getCf() {
		return cf;
	}

	public void setCf(Double cf) {
		this.cf = cf;
	}

	public Boolean getValida() {
		return valida;
	}

	public void setValida(Boolean valida) {
		this.valida = valida;
	}

	public Double getCm1() {
		return cm1;
	}

	public void setCm1(Double cm1) {
		this.cm1 = cm1;
	}

	public Date getFcm1() {
		return fcm1;
	}

	public void setFcm1(Date fcm1) {
		this.fcm1 = fcm1;
	}

	public Double getCr11() {
		return cr11;
	}

	public void setCr11(Double cr11) {
		this.cr11 = cr11;
	}

	public Integer getCaro11() {
		return caro11;
	}

	public void setCaro11(Integer caro11) {
		this.caro11 = caro11;
	}

	public Date getFcr11() {
		return fcr11;
	}

	public void setFcr11(Date fcr11) {
		this.fcr11 = fcr11;
	}

	public Double getCm2() {
		return cm2;
	}

	public void setCm2(Double cm2) {
		this.cm2 = cm2;
	}

	public Date getFcm2() {
		return fcm2;
	}

	public void setFcm2(Date fcm2) {
		this.fcm2 = fcm2;
	}

	public Double getCr21() {
		return cr21;
	}

	public void setCr21(Double cr21) {
		this.cr21 = cr21;
	}

	public Integer getCaro21() {
		return caro21;
	}

	public void setCaro21(Integer caro21) {
		this.caro21 = caro21;
	}

	public Date getFcr21() {
		return fcr21;
	}

	public void setFcr21(Date fcr21) {
		this.fcr21 = fcr21;
	}

	public Double getCm3() {
		return cm3;
	}

	public void setCm3(Double cm3) {
		this.cm3 = cm3;
	}

	public Date getFcm3() {
		return fcm3;
	}

	public void setFcm3(Date fcm3) {
		this.fcm3 = fcm3;
	}

	public Double getCr31() {
		return cr31;
	}

	public void setCr31(Double cr31) {
		this.cr31 = cr31;
	}

	public Integer getCaro31() {
		return caro31;
	}

	public void setCaro31(Integer caro31) {
		this.caro31 = caro31;
	}

	public Date getFcr31() {
		return fcr31;
	}

	public void setFcr31(Date fcr31) {
		this.fcr31 = fcr31;
	}

	public Double getCfr1() {
		return cfr1;
	}

	public void setCfr1(Double cfr1) {
		this.cfr1 = cfr1;
	}

	public Integer getCarf1() {
		return carf1;
	}

	public void setCarf1(Integer carf1) {
		this.carf1 = carf1;
	}

	public Date getFcfr1() {
		return fcfr1;
	}

	public void setFcfr1(Date fcfr1) {
		this.fcfr1 = fcfr1;
	}

	public Boolean getExento() {
		return exento;
	}

	public void setExento(Boolean exento) {
		this.exento = exento;
	}

	public Boolean getUri1() {
		return uri1;
	}

	public void setUri1(Boolean uri1) {
		this.uri1 = uri1;
	}

	public Boolean getUri2() {
		return uri2;
	}

	public void setUri2(Boolean uri2) {
		this.uri2 = uri2;
	}

	public Boolean getUri3() {
		return uri3;
	}

	public void setUri3(Boolean uri3) {
		this.uri3 = uri3;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
