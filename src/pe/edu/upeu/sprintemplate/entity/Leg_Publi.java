package pe.edu.upeu.sprintemplate.entity;

public class Leg_Publi {
	private int idpublicacion;
	private int anio; 
	private String nombre_publicacion;
	private String nombre_mediodecomunicacion;
	private String editorial;
	private String isbn;
	private int nupaginas;
	private String lugar;
	private String estado;
	private String tipo;
	private String url;
	private int doce;
	private int catatributo;
	public int getIdpublicacion() {
		return idpublicacion;
	}
	public void setIdpublicacion(int idpublicacion) {
		this.idpublicacion = idpublicacion;
	}
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getNombre_publicacion() {
		return nombre_publicacion;
	}
	public void setNombre_publicacion(String nombre_publicacion) {
		this.nombre_publicacion = nombre_publicacion;
	}
	public String getNombre_mediodecomunicacion() {
		return nombre_mediodecomunicacion;
	}
	public void setNombre_mediodecomunicacion(String nombre_mediodecomunicacion) {
		this.nombre_mediodecomunicacion = nombre_mediodecomunicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNupaginas() {
		return nupaginas;
	}
	public void setNupaginas(int nupaginas) {
		this.nupaginas = nupaginas;
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
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}
	public int getCatatributo() {
		return catatributo;
	}
	public void setCatatributo(int catatributo) {
		this.catatributo = catatributo;
	}
	public Leg_Publi(int anio, String nombre_publicacion, String nombre_mediodecomunicacion, String editorial,
			String isbn, int nupaginas, String lugar, String estado, String tipo, String url, int doce,
			int catatributo) {
		super();
		this.anio = anio;
		this.nombre_publicacion = nombre_publicacion;
		this.nombre_mediodecomunicacion = nombre_mediodecomunicacion;
		this.editorial = editorial;
		this.isbn = isbn;
		this.nupaginas = nupaginas;
		this.lugar = lugar;
		this.estado = estado;
		this.tipo = tipo;
		this.url = url;
		this.doce = doce;
		this.catatributo = catatributo;
	}
	public Leg_Publi(int anio, String nombre_publicacion, String editorial, String isbn, int nupaginas, String estado,
			String tipo, String url, int doce, int catatributo) {
		super();
		this.anio = anio;
		this.nombre_publicacion = nombre_publicacion;
		this.editorial = editorial;
		this.isbn = isbn;
		this.nupaginas = nupaginas;
		this.estado = estado;
		this.tipo = tipo;
		this.url = url;
		this.doce = doce;
		this.catatributo = catatributo;
	}
	
	 
	     
}
