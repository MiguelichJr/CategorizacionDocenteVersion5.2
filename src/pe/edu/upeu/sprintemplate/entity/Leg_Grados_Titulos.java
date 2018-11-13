package pe.edu.upeu.sprintemplate.entity;

public class Leg_Grados_Titulos {
	            
	private int idgro;
	private String fecha_termino;
	private String estado;
	private String tesis;
	private String url;
	private String url2;
	private int institucion;
	private int grado;
	private int especialidad;
	private int docente;
	 
	
	@Override
	public String toString() {
		return "Leg_Grados_Titulos [fecha_termino=" + fecha_termino + ", estado=" + estado + ", tesis=" + tesis
				+ ", url=" + url + ", url2=" + url2 + ", institucion=" + institucion + ", grado=" + grado
				+ ", especialidad=" + especialidad + ", docente=" + docente + "]";
	}
	public int getIdgro() {
		return idgro;
	}
	public void setIdgro(int idgro) {
		this.idgro = idgro;
	}
	public String getFecha_termino() {
		return fecha_termino;
	}
	public void setFecha_termino(String fecha_termino) {
		this.fecha_termino = fecha_termino;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTesis() {
		return tesis;
	}
	public void setTesis(String tesis) {
		this.tesis = tesis;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getInstitucion() {
		return institucion;
	}
	public void setInstitucion(int institucion) {
		this.institucion = institucion;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	public int getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(int especialidad) {
		this.especialidad = especialidad;
	}
	public int getDocente() {
		return docente;
	}
	public void setDocente(int docente) {
		this.docente = docente;
	}
	
	public Leg_Grados_Titulos(int idgro, String fecha_termino, String estado, String tesis, String url, String url2,
			int institucion, int grado, int especialidad, int docente) {
		super();
		this.idgro = idgro;
		this.fecha_termino = fecha_termino;
		this.estado = estado;
		this.tesis = tesis;
		this.url = url;
		this.url2 = url2;
		this.institucion = institucion;
		this.grado = grado;
		this.especialidad = especialidad;
		this.docente = docente;
	}
	public String getUrl2() {
		return url2;
	}
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	public Leg_Grados_Titulos() {
		super();
	}    

}
