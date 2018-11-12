package pe.edu.upeu.sprintemplate.entity;

public class Grados {

	private int idgrd;
	private String nombre_grado;
	public int getIdgrd() {
		return idgrd;
	}
	public void setIdgrd(int idgrd) {
		this.idgrd = idgrd;
	}
	public String getNombre_grado() {
		return nombre_grado;
	}
	public void setNombre_grado(String nombre_grado) {
		this.nombre_grado = nombre_grado;
	}
	public Grados(int idgrd, String nombre_grado) {
		super();
		this.idgrd = idgrd;
		this.nombre_grado = nombre_grado;
	}
	public Grados() {
		super();
	}
	  
	
}
