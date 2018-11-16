package pe.edu.upeu.sprintemplate.entity;

public class Leg5_1 {
	private int idlg5_1;
	private int anio;
	private String nombre_evento;
	private int horas;
	private int creditos;
	private String lugar;
	private int institucion;
	private int doce; 
	private int cateatributo;
	private String estado;
	private String tipo;
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getIdlg5_1() {
		return idlg5_1;
	}
	public void setIdlg5_1(int idlg5_1) {
		this.idlg5_1 = idlg5_1;
	}
	
	public String getNombre_evento() {
		return nombre_evento;
	}
	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}
	  
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
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
	public Leg5_1(int anio, String nombre_evento, int horas, int creditos, String lugar, int institucion, int doce,
			int cateatributo, String estado, String tipo, String url) {
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
		this.url = url;
	}
	
	  
	 
	
	   
}
