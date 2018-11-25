package pe.edu.upeu.sprintemplate.entity;

public class Leg_Extras {
	private int id;
	private String declaracion;
	private String url;
	private int docente;
	private String estado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeclaracion() {
		return declaracion;
	}
	public void setDeclaracion(String declaracion) {
		this.declaracion = declaracion;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Leg_Extras(String declaracion, String url, int docente, String estado) {
		super();
		this.declaracion = declaracion;
		this.url = url;
		this.docente = docente;
		this.estado = estado;
	}
	public Leg_Extras(int id, String url) {
		super();
		this.id = id;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Leg_Extras [id=" + id + ", declaracion=" + declaracion + ", url=" + url + ", docente=" + docente
				+ ", estado=" + estado + "]";
	}
	public Leg_Extras(String estado,int id) {
		super();
		this.estado = estado;           
		this.id = id;
		
	}
	    
	       	 
	
	    
}
