package pe.edu.upeu.sprintemplate.entity;

public class Leg_Investi {
	private int idleg_investigaciones;
	private int anio;
	private String titulo;
	private int numero_resolucion;
	private String estado;
	private String url;
	private int doce;
	
	public int getIdleg_investigaciones() {
		return idleg_investigaciones;
	}
	public void setIdleg_investigaciones(int idleg_investigaciones) {
		this.idleg_investigaciones = idleg_investigaciones;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumero_resolucion() {
		return numero_resolucion;
	}
	public void setNumero_resolucion(int numero_resolucion) {
		this.numero_resolucion = numero_resolucion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}  
	public Leg_Investi(int anio, String titulo, int numero_resolucion, String estado, String url, int doce) {
		super();
		this.anio = anio;
		this.titulo = titulo;
		this.numero_resolucion = numero_resolucion;
		this.estado = estado;
		this.url = url;
		this.doce = doce;
	}
	public Leg_Investi(int idleg_investigaciones, String url) {
		super();
		this.idleg_investigaciones = idleg_investigaciones;
		this.url = url;
	}
	
	      
	
}
