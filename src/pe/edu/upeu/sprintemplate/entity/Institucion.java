package pe.edu.upeu.sprintemplate.entity;

public class Institucion {
	private int idint;
	private String nombre_institucion;
	
	private int idmodulos;
	public int getIdint() {
		return idint;
	}
	public void setIdint(int idint) {
		this.idint = idint;
	}
	public String getNombre_institucion() {
		return nombre_institucion;
	}
	public void setNombre_institucion(String nombre_institucion) {
		this.nombre_institucion = nombre_institucion;
	}
	public Institucion(int idint, String nombre_institucion) {
		super();
		this.idint = idint;
		this.nombre_institucion = nombre_institucion;
	}
	public Institucion() {
		super();
	}
	public int getIdmodulos() {
		return idmodulos;
	}
	public void setIdmodulos(int idmodulos) {
		this.idmodulos = idmodulos;
	}
	public Institucion(int idmodulos) {
		super();
		this.idmodulos = idmodulos;
	}  
	
	 

}
