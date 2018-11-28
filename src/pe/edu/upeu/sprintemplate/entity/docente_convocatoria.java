package pe.edu.upeu.sprintemplate.entity;

public class docente_convocatoria {
	
	private int iddocentecon;
	private String estado;
	private String fecha_registro;
	private String RegimedOCENTE;
	private int idconvocatoeri;
	private int idcategoria;
	private int idcategoria1;
	private int idPersona;
	private String Perso_secretaria;
	public docente_convocatoria() {
		super();
	}
	public docente_convocatoria(String estado, String fecha_registro, String regimedOCENTE, int idconvocatoeri,
			int idcategoria, int idcategoria1, int idPersona, String perso_secretaria) {
		super();
		this.estado = estado;
		this.fecha_registro = fecha_registro;
		RegimedOCENTE = regimedOCENTE;
		this.idconvocatoeri = idconvocatoeri;
		this.idcategoria = idcategoria;
		this.idcategoria1 = idcategoria1;
		this.idPersona = idPersona;
		Perso_secretaria = perso_secretaria;
	}
	public docente_convocatoria(int iddocentecon, String estado, String fecha_registro, String regimedOCENTE,
			int idconvocatoeri, int idcategoria, int idcategoria1, int idPersona, String perso_secretaria) {
		super();
		this.iddocentecon = iddocentecon;
		this.estado = estado;
		this.fecha_registro = fecha_registro;
		RegimedOCENTE = regimedOCENTE;
		this.idconvocatoeri = idconvocatoeri;
		this.idcategoria = idcategoria;
		this.idcategoria1 = idcategoria1;
		this.idPersona = idPersona;
		Perso_secretaria = perso_secretaria;
	}
	
	
	
	public docente_convocatoria(String regimedOCENTE, int idconvocatoeri, int idcategoria, int idPersona) {
		super();
		RegimedOCENTE = regimedOCENTE;
		this.idconvocatoeri = idconvocatoeri;
		this.idcategoria = idcategoria;
		this.idPersona = idPersona;
	}
	public int getIddocentecon() {
		return iddocentecon;
	}
	public void setIddocentecon(int iddocentecon) {
		this.iddocentecon = iddocentecon;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getRegimedOCENTE() {
		return RegimedOCENTE;
	}
	public void setRegimedOCENTE(String regimedOCENTE) {
		RegimedOCENTE = regimedOCENTE;
	}
	public int getIdconvocatoeri() {
		return idconvocatoeri;
	}
	public void setIdconvocatoeri(int idconvocatoeri) {
		this.idconvocatoeri = idconvocatoeri;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public int getIdcategoria1() {
		return idcategoria1;
	}
	public void setIdcategoria1(int idcategoria1) {
		this.idcategoria1 = idcategoria1;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getPerso_secretaria() {
		return Perso_secretaria;
	}
	public void setPerso_secretaria(String perso_secretaria) {
		Perso_secretaria = perso_secretaria;
	}
	
	
	
	@Override
	public String toString() {
		return "docente_convocatoria [iddocentecon=" + iddocentecon + ", estado=" + estado + ", fecha_registro="
				+ fecha_registro + ", RegimedOCENTE=" + RegimedOCENTE + ", idconvocatoeri=" + idconvocatoeri
				+ ", idcategoria=" + idcategoria + ", idcategoria1=" + idcategoria1 + ", idPersona=" + idPersona
				+ ", Perso_secretaria=" + Perso_secretaria + "]";
	}
	
	

}
