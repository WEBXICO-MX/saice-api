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
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "cve_grupo"), @JoinColumn(name = "cve_turno"), @JoinColumn(name = "cve_plan"),
			@JoinColumn(name = "cve_carrera"), @JoinColumn(name = "cve_division"),
			@JoinColumn(name = "cve_unidad_academica"), @JoinColumn(name = "cve_universidad"),
			@JoinColumn(name = "cve_periodo") })
	private Grupo cveGrupo;
	@Id
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "cve_alumno",insertable=false, updatable=false), @JoinColumn(name = "cve_universidad",insertable=false, updatable=false) })
	private Alumno cveAlumno;
	@Id
	@ManyToOne
	@JoinColumn(name = "cve_materia")
	private Materia cveMateria;
	private Date fcf;
	private double cf;
	private boolean valida;
	private double cm1;
	private Date fcm1;
	@Column(name = "cr1_1")
	private double cr11;
	private int caro11;
	@Column(name = "fcr1_1")
	private Date fcr11;
	private double cm2;
	private Date fcm2;
	@Column(name = "cr2_1")
	private double cr21;
	private int caro21;
	@Column(name = "fcr2_1")
	private Date fcr21;
	private double cm3;
	private Date fcm3;
	@Column(name = "cr3_1")
	private double cr31;
	private int caro31;
	@Column(name = "fcr3_1")
	private Date fcr31;
	private double cfr1;
	private int carf1;
	private Date fcfr1;
	private boolean exento;
	@Column(name = "uri_1")
	private boolean uri1;
	@Column(name = "uri_2")
	private boolean uri2;
	@Column(name = "uri_3")
	private boolean uri3;

	public CalificacionAlumno() {
		super();
	}

	public CalificacionAlumno(Grupo cveGrupo, Alumno cveAlumno, Materia cveMateria, Date fcf, double cf, boolean valida,
			double cm1, Date fcm1, double cr11, int caro11, Date fcr11, double cm2, Date fcm2, double cr21, int caro21,
			Date fcr21, double cm3, Date fcm3, double cr31, int caro31, Date fcr31, double cfr1, int carf1, Date fcfr1,
			boolean exento, boolean uri1, boolean uri2, boolean uri3) {
		super();
		this.cveGrupo = cveGrupo;
		this.cveAlumno = cveAlumno;
		this.cveMateria = cveMateria;
		this.fcf = fcf;
		this.cf = cf;
		this.valida = valida;
		this.cm1 = cm1;
		this.fcm1 = fcm1;
		this.cr11 = cr11;
		this.caro11 = caro11;
		this.fcr11 = fcr11;
		this.cm2 = cm2;
		this.fcm2 = fcm2;
		this.cr21 = cr21;
		this.caro21 = caro21;
		this.fcr21 = fcr21;
		this.cm3 = cm3;
		this.fcm3 = fcm3;
		this.cr31 = cr31;
		this.caro31 = caro31;
		this.fcr31 = fcr31;
		this.cfr1 = cfr1;
		this.carf1 = carf1;
		this.fcfr1 = fcfr1;
		this.exento = exento;
		this.uri1 = uri1;
		this.uri2 = uri2;
		this.uri3 = uri3;
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

	public Date getFcf() {
		return fcf;
	}

	public void setFcf(Date fcf) {
		this.fcf = fcf;
	}

	public double getCf() {
		return cf;
	}

	public void setCf(double cf) {
		this.cf = cf;
	}

	public boolean isValida() {
		return valida;
	}

	public void setValida(boolean valida) {
		this.valida = valida;
	}

	public double getCm1() {
		return cm1;
	}

	public void setCm1(double cm1) {
		this.cm1 = cm1;
	}

	public Date getFcm1() {
		return fcm1;
	}

	public void setFcm1(Date fcm1) {
		this.fcm1 = fcm1;
	}

	public double getCr11() {
		return cr11;
	}

	public void setCr11(double cr11) {
		this.cr11 = cr11;
	}

	public int getCaro11() {
		return caro11;
	}

	public void setCaro11(int caro11) {
		this.caro11 = caro11;
	}

	public Date getFcr11() {
		return fcr11;
	}

	public void setFcr11(Date fcr11) {
		this.fcr11 = fcr11;
	}

	public double getCm2() {
		return cm2;
	}

	public void setCm2(double cm2) {
		this.cm2 = cm2;
	}

	public Date getFcm2() {
		return fcm2;
	}

	public void setFcm2(Date fcm2) {
		this.fcm2 = fcm2;
	}

	public double getCr21() {
		return cr21;
	}

	public void setCr21(double cr21) {
		this.cr21 = cr21;
	}

	public int getCaro21() {
		return caro21;
	}

	public void setCaro21(int caro21) {
		this.caro21 = caro21;
	}

	public Date getFcr21() {
		return fcr21;
	}

	public void setFcr21(Date fcr21) {
		this.fcr21 = fcr21;
	}

	public double getCm3() {
		return cm3;
	}

	public void setCm3(double cm3) {
		this.cm3 = cm3;
	}

	public Date getFcm3() {
		return fcm3;
	}

	public void setFcm3(Date fcm3) {
		this.fcm3 = fcm3;
	}

	public double getCr31() {
		return cr31;
	}

	public void setCr31(double cr31) {
		this.cr31 = cr31;
	}

	public int getCaro31() {
		return caro31;
	}

	public void setCaro31(int caro31) {
		this.caro31 = caro31;
	}

	public Date getFcr31() {
		return fcr31;
	}

	public void setFcr31(Date fcr31) {
		this.fcr31 = fcr31;
	}

	public double getCfr1() {
		return cfr1;
	}

	public void setCfr1(double cfr1) {
		this.cfr1 = cfr1;
	}

	public int getCarf1() {
		return carf1;
	}

	public void setCarf1(int carf1) {
		this.carf1 = carf1;
	}

	public Date getFcfr1() {
		return fcfr1;
	}

	public void setFcfr1(Date fcfr1) {
		this.fcfr1 = fcfr1;
	}

	public boolean isExento() {
		return exento;
	}

	public void setExento(boolean exento) {
		this.exento = exento;
	}

	public boolean isUri1() {
		return uri1;
	}

	public void setUri1(boolean uri1) {
		this.uri1 = uri1;
	}

	public boolean isUri2() {
		return uri2;
	}

	public void setUri2(boolean uri2) {
		this.uri2 = uri2;
	}

	public boolean isUri3() {
		return uri3;
	}

	public void setUri3(boolean uri3) {
		this.uri3 = uri3;
	}

	@Override
	public String toString() {
		return "CalificacionAlumno [cveGrupo=" + cveGrupo + ", cveAlumno=" + cveAlumno + ", cveMateria=" + cveMateria
				+ ", fcf=" + fcf + ", cf=" + cf + ", valida=" + valida + ", cm1=" + cm1 + ", fcm1=" + fcm1 + ", cr11="
				+ cr11 + ", caro11=" + caro11 + ", fcr11=" + fcr11 + ", cm2=" + cm2 + ", fcm2=" + fcm2 + ", cr21="
				+ cr21 + ", caro21=" + caro21 + ", fcr21=" + fcr21 + ", cm3=" + cm3 + ", fcm3=" + fcm3 + ", cr31="
				+ cr31 + ", caro31=" + caro31 + ", fcr31=" + fcr31 + ", cfr1=" + cfr1 + ", carf1=" + carf1 + ", fcfr1="
				+ fcfr1 + ", exento=" + exento + ", uri1=" + uri1 + ", uri2=" + uri2 + ", uri3=" + uri3 + "]";
	}

}
