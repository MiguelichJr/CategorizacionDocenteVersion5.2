package pe.edu.upeu.sprintemplate.entity;

public class Leg_Asesora_Tesis {
	private int idlegtesis;
	private int anio_1;
	private String titulo;
	private String autor;
	private int anio_2;
	private String resolucion;
	private String estado;
	private String url;
	private int especialidad;
	private int doce;
	private int categoria_atributo;
	public int getIdlegtesis() {
		return idlegtesis;
	}
	public void setIdlegtesis(int idlegtesis) {
		this.idlegtesis = idlegtesis;
	}
	public int getAnio_1() {
		return anio_1;
	}
	public void setAnio_1(int anio_1) {
		this.anio_1 = anio_1;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio_2() {
		return anio_2;
	}
	public void setAnio_2(int anio_2) {
		this.anio_2 = anio_2;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
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
	public int getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(int especialidad) {
		this.especialidad = especialidad;
	}
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}
	public int getCategoria_atributo() {
		return categoria_atributo;
	}
	public void setCategoria_atributo(int categoria_atributo) {
		this.categoria_atributo = categoria_atributo;
	}
	public Leg_Asesora_Tesis(int anio_1, String titulo, String autor, int anio_2, String resolucion, String estado,
			String url, int especialidad, int doce, int categoria_atributo) {
		super();
		this.anio_1 = anio_1;
		this.titulo = titulo;
		this.autor = autor;
		this.anio_2 = anio_2;
		this.resolucion = resolucion;
		this.estado = estado;
		this.url = url;
		this.especialidad = especialidad;
		this.doce = doce;
		this.categoria_atributo = categoria_atributo;
	} 
	
	     

}
