package pe.edu.upeu.sprintemplate.entity;

public class Leg7 {
	private int idleg7;
	private int anio;
	private String titulo;
	private String poblacion_onjetiva;
	private String lugar;
	private int nparticipantes;
	private String estado;
	private String tipo;
	private String url;
	private int docente;
	public int getIdleg7() {
		return idleg7;
	}
	public void setIdleg7(int idleg7) {
		this.idleg7 = idleg7;
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
	public String getPoblacion_onjetiva() {
		return poblacion_onjetiva;
	}
	public void setPoblacion_onjetiva(String poblacion_onjetiva) {
		this.poblacion_onjetiva = poblacion_onjetiva;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getNparticipantes() {
		return nparticipantes;
	}
	public void setNparticipantes(int nparticipantes) {
		this.nparticipantes = nparticipantes;
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
	public int getDocente() {
		return docente;
	}
	public void setDocente(int docente) {
		this.docente = docente;
	}
	public Leg7(int anio, String titulo, String poblacion_onjetiva, String lugar, int nparticipantes, String estado,
			String tipo, String url, int docente) {
		super();
		this.anio = anio;
		this.titulo = titulo;
		this.poblacion_onjetiva = poblacion_onjetiva;
		this.lugar = lugar;
		this.nparticipantes = nparticipantes;
		this.estado = estado;
		this.tipo = tipo;
		this.url = url;
		this.docente = docente;
	}
	 	
}
