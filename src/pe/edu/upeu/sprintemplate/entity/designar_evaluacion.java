package pe.edu.upeu.sprintemplate.entity;

public class designar_evaluacion {
	private int idesig_evaluacion;
	private String estado;
	private String fecha_registro;
	private String puntaje;
	private int idcon_docente;
	private int Idpersona;
	private int Idinstrumento;
	public designar_evaluacion() {
		super();
	}
	
	public designar_evaluacion(String puntaje, int idcon_docente, int idpersona, int idinstrumento) {
		super();
		this.puntaje = puntaje;
		this.idcon_docente = idcon_docente;
		Idpersona = idpersona;
		Idinstrumento = idinstrumento;
	}

	public designar_evaluacion(String estado, String fecha_registro, String puntaje, int idcon_docente, int idpersona,
			int idinstrumento) {
		super();
		this.estado = estado;
		this.fecha_registro = fecha_registro;
		this.puntaje = puntaje;
		this.idcon_docente = idcon_docente;
		Idpersona = idpersona;
		Idinstrumento = idinstrumento;
	}
	public designar_evaluacion(int idesig_evaluacion, String estado, String fecha_registro, String puntaje,
			int idcon_docente, int idpersona, int idinstrumento) {
		super();
		this.idesig_evaluacion = idesig_evaluacion;
		this.estado = estado;
		this.fecha_registro = fecha_registro;
		this.puntaje = puntaje;
		this.idcon_docente = idcon_docente;
		Idpersona = idpersona;
		Idinstrumento = idinstrumento;
	}
	
	public int getIdesig_evaluacion() {
		return idesig_evaluacion;
	}
	public void setIdesig_evaluacion(int idesig_evaluacion) {
		this.idesig_evaluacion = idesig_evaluacion;
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
	public String getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(String puntaje) {
		this.puntaje = puntaje;
	}
	public int getIdcon_docente() {
		return idcon_docente;
	}
	public void setIdcon_docente(int idcon_docente) {
		this.idcon_docente = idcon_docente;
	}
	public int getIdpersona() {
		return Idpersona;
	}
	public void setIdpersona(int idpersona) {
		Idpersona = idpersona;
	}
	public int getIdinstrumento() {
		return Idinstrumento;
	}
	public void setIdinstrumento(int idinstrumento) {
		Idinstrumento = idinstrumento;
	}
	@Override
	public String toString() {
		return "designar_evaluacion [idesig_evaluacion=" + idesig_evaluacion + ", estado=" + estado
				+ ", fecha_registro=" + fecha_registro + ", puntaje=" + puntaje + ", idcon_docente=" + idcon_docente
				+ ", Idpersona=" + Idpersona + ", Idinstrumento=" + Idinstrumento + "]";
	}
	 
	
}
