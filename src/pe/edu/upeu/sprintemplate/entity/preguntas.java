package pe.edu.upeu.sprintemplate.entity;

public class preguntas {
	private int idpreguntas;
	private String descripcion;
	private String valor_maximo;
	private int idsecciones;
	private int idtipo_de_categoria;
	public preguntas() {
		super();
	}
	public preguntas(String descripcion, String valor_maximo, int idsecciones, int idtipo_de_categoria) {
		super();
		this.descripcion = descripcion;
		this.valor_maximo = valor_maximo;
		this.idsecciones = idsecciones;
		this.idtipo_de_categoria = idtipo_de_categoria;
	}
	public preguntas(int idpreguntas, String descripcion, String valor_maximo, int idsecciones,
			int idtipo_de_categoria) {
		super();
		this.idpreguntas = idpreguntas;
		this.descripcion = descripcion;
		this.valor_maximo = valor_maximo;
		this.idsecciones = idsecciones;
		this.idtipo_de_categoria = idtipo_de_categoria;
	}
	public int getIdpreguntas() {
		return idpreguntas;
	}
	public void setIdpreguntas(int idpreguntas) {
		this.idpreguntas = idpreguntas;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getValor_maximo() {
		return valor_maximo;
	}
	public void setValor_maximo(String valor_maximo) {
		this.valor_maximo = valor_maximo;
	}
	public int getIdsecciones() {
		return idsecciones;
	}
	public void setIdsecciones(int idsecciones) {
		this.idsecciones = idsecciones;
	}
	public int getIdtipo_de_categoria() {
		return idtipo_de_categoria;
	}
	public void setIdtipo_de_categoria(int idtipo_de_categoria) {
		this.idtipo_de_categoria = idtipo_de_categoria;
	}
	@Override
	public String toString() {
		return "preguntas [idpreguntas=" + idpreguntas + ", descripcion=" + descripcion + ", valor_maximo="
				+ valor_maximo + ", idsecciones=" + idsecciones + ", idtipo_de_categoria=" + idtipo_de_categoria + "]";
	}

	
	
}
