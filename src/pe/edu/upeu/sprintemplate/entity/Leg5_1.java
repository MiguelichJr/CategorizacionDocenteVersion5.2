package pe.edu.upeu.sprintemplate.entity;

public class Leg5_1 {
	private int idlg5_1;
	private String anio;
	private String nombre_evento;
	private String horas;
	private String creditos;
	private String lugar;
	private int institucion;
	private int doce;
	private int cateatributo;
	private String estado;
	private String tipo;
	public int getIdlg5_1() {
		return idlg5_1;
	}
	public void setIdlg5_1(int idlg5_1) {
		this.idlg5_1 = idlg5_1;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getNombre_evento() {
		return nombre_evento;
	}
	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}
	public String getHoras() {
		return horas;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public String getCreditos() {
		return creditos;
	}
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getInstitucion() {
		return institucion;
	}
	public void setInstitucion(int institucion) {
		this.institucion = institucion;
	}
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}
	public int getCateatributo() {
		return cateatributo;
	}
	public void setCateatributo(int cateatributo) {
		this.cateatributo = cateatributo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Leg5_1(String anio, String nombre_evento, String horas, String creditos, String lugar, int institucion,
			int doce, int cateatributo, String estado, String tipo) {
		super();
		this.anio = anio;
		this.nombre_evento = nombre_evento;
		this.horas = horas;
		this.creditos = creditos;
		this.lugar = lugar;
		this.institucion = institucion;
		this.doce = doce;
		this.cateatributo = cateatributo;
		this.estado = estado;
		this.tipo = tipo;
	}
	
	   
}
