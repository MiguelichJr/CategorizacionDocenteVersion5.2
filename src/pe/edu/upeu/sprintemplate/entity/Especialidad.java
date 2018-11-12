package pe.edu.upeu.sprintemplate.entity;

public class Especialidad {
	private int idespc;
	private String nombre_especialidad;
	public int getIdespc() {
		return idespc;
	}
	public void setIdespc(int idespc) {
		this.idespc = idespc;
	}
	public String getNombre_especialidad() {
		return nombre_especialidad;
	}
	public void setNombre_especialidad(String nombre_especialidad) {
		this.nombre_especialidad = nombre_especialidad;
	}
	public Especialidad(int idespc, String nombre_especialidad) {
		super();
		this.idespc = idespc;
		this.nombre_especialidad = nombre_especialidad;
	}
	public Especialidad() {
		super();
	}
	
	   
}
