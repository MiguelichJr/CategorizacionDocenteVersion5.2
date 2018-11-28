package pe.edu.upeu.sprintemplate.entity;


public class Convocatoria {
	private int idconvocatoria;
	private String fecha_inicio;
	private String fecha_fin;
	private String perido;
	private String nombre;
	private String fecha_registro;
	private String Fecha_inici_legajo;
	private String fecha_fin_legajo;
	public Convocatoria() {
		super();
	}
	
	public Convocatoria(String fecha_inicio, String fecha_fin, String perido, String nombre, String fecha_registro,
			String fecha_inici_legajo, String fecha_fin_legajo) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.perido = perido;
		this.nombre = nombre;
		this.fecha_registro = fecha_registro;
		Fecha_inici_legajo = fecha_inici_legajo;
		this.fecha_fin_legajo = fecha_fin_legajo;
	}
	public Convocatoria(int idconvocatoria, String fecha_inicio, String fecha_fin, String perido, String nombre,
			String fecha_registro, String fecha_inici_legajo, String fecha_fin_legajo) {
		super();
		this.idconvocatoria = idconvocatoria;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.perido = perido;
		this.nombre = nombre;
		this.fecha_registro = fecha_registro;
		Fecha_inici_legajo = fecha_inici_legajo;
		this.fecha_fin_legajo = fecha_fin_legajo;
	}
	public int getIdconvocatoria() {
		return idconvocatoria;
	}
	public void setIdconvocatoria(int idconvocatoria) {
		this.idconvocatoria = idconvocatoria;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getPerido() {
		return perido;
	}
	public void setPerido(String perido) {
		this.perido = perido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getFecha_inici_legajo() {
		return Fecha_inici_legajo;
	}
	public void setFecha_inici_legajo(String fecha_inici_legajo) {
		Fecha_inici_legajo = fecha_inici_legajo;
	}
	public String getFecha_fin_legajo() {
		return fecha_fin_legajo;
	}
	public void setFecha_fin_legajo(String fecha_fin_legajo) {
		this.fecha_fin_legajo = fecha_fin_legajo;
	}
	
	
	public Convocatoria(String fecha_inicio, String fecha_fin, String perido, String nombre, String fecha_inici_legajo,
			String fecha_fin_legajo) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.perido = perido;
		this.nombre = nombre;
		Fecha_inici_legajo = fecha_inici_legajo;
		this.fecha_fin_legajo = fecha_fin_legajo;
	}
	
	public Convocatoria(String fecha_inicio) {
		super();
		this.fecha_inicio = fecha_inicio;
	}
	@Override
	public String toString() {
		return "Convocatoria [idconvocatoria=" + idconvocatoria + ", fecha_inicio=" + fecha_inicio + ", fecha_fin="
				+ fecha_fin + ", perido=" + perido + ", nombre=" + nombre + ", fecha_registro=" + fecha_registro
				+ ", Fecha_inici_legajo=" + Fecha_inici_legajo + ", fecha_fin_legajo=" + fecha_fin_legajo + "]";
	}
	
}
