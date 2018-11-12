package pe.edu.upeu.sprintemplate.entity;

public class Categoria {
	private int idcate;
	private String nombre_categoria;
	public int getIdcate() {
		return idcate;   
	}
	public void setIdcate(int idcate) {
		this.idcate = idcate;
	}
	public String getNombre_categoria() {
		return nombre_categoria;
	}
	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	public Categoria(int idcate, String nombre_categoria) {
		super();
		this.idcate = idcate;
		this.nombre_categoria = nombre_categoria;
	}
	public Categoria() {
		super();
	}
	
	    
}
