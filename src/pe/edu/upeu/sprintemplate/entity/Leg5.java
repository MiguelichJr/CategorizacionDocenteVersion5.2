package pe.edu.upeu.sprintemplate.entity;

public class Leg5 {
	private int idlg5;
	private int anio; 
	private String fecha;
	private String nombre_evento;
	private int horas;
	private int creditos;
	private String lugar;
	private String estado;
	private String fecha_termino;
	private String tipo;
	private String url;
	private int institucion;
	private int doce; 
	 
	   
	
	public Leg5(int anio, String fecha, String nombre_evento, int horas, int creditos, String lugar, String estado,
			String tipo, String url, int institucion, int doce) {
		super();
		this.anio = anio;
		this.fecha = fecha;
		this.nombre_evento = nombre_evento;
		this.horas = horas;
		this.creditos = creditos;
		this.lugar = lugar;
		this.estado = estado;
		this.tipo = tipo;
		this.url = url;
		this.institucion = institucion;
		this.doce = doce;
	}
	public int getIdlg5() {
		return idlg5;
	}
	public void setIdlg5(int idlg5) {
		this.idlg5 = idlg5;
	}
	   
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNombre_evento() {
		return nombre_evento;
	}
	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFecha_termino() {
		return fecha_termino;
	}
	public void setFecha_termino(String fecha_termino) {
		this.fecha_termino = fecha_termino;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}
	public Leg5(String fecha, String nombre_evento, int horas, int creditos, String lugar, String estado,
			String fecha_termino, String tipo, String url, int institucion, int doce) {
		super();
		this.fecha = fecha;
		this.nombre_evento = nombre_evento;
		this.horas = horas;
		this.creditos = creditos;
		this.lugar = lugar;
		this.estado = estado;
		this.fecha_termino = fecha_termino;
		this.tipo = tipo;
		this.url = url;
		this.institucion = institucion;
		this.doce = doce;
	}
	public Leg5(int idlg5, String url) {
		super();
		this.idlg5 = idlg5;
		this.url = url;
	}
	public Leg5(String estado,int idlg5) {
		super();
		
		this.estado = estado;
		this.idlg5 = idlg5;  
	}
	  
	
	 
	  
	
	
	

}
