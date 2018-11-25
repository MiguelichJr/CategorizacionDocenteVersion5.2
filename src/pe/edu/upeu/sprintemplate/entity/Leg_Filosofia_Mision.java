package pe.edu.upeu.sprintemplate.entity;

public class Leg_Filosofia_Mision {
	private int idfilosifia;
	private String nombre;
	private String tipo_filosofia;
	private String url;
	private String documento;
	private String estado;
	private int docente;
	public int getIdfilosifia() {
		return idfilosifia;
	}
	public void setIdfilosifia(int idfilosifia) {
		this.idfilosifia = idfilosifia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_filosofia() {
		return tipo_filosofia;
	}
	public void setTipo_filosofia(String tipo_filosofia) {
		this.tipo_filosofia = tipo_filosofia;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {   
		this.url = url;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getDocente() {
		return docente;
	}
	public void setDocente(int docente) {
		this.docente = docente;
	}
	public Leg_Filosofia_Mision(String nombre, String tipo_filosofia, String url, String documento, String estado,
			int docente) {
		super();
		this.nombre = nombre;
		this.tipo_filosofia = tipo_filosofia;
		this.url = url;
		this.documento = documento;
		this.estado = estado;
		this.docente = docente;
	}
	public Leg_Filosofia_Mision(int idfilosifia, String url) {
		super();
		this.idfilosifia = idfilosifia;
		this.url = url;
	}
	public Leg_Filosofia_Mision(String estado, int idfilosifia) {
		super();
		
		this.estado = estado;
		this.idfilosifia = idfilosifia;    
	}
	@Override
	public String toString() {
		return "Leg_Filosofia_Mision [idfilosifia=" + idfilosifia + ", nombre=" + nombre + ", tipo_filosofia="
				+ tipo_filosofia + ", url=" + url + ", documento=" + documento + ", estado=" + estado + ", docente="
				+ docente + "]";
	}
	
	  
	   
	   
	
	
}
