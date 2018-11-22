package pe.edu.upeu.sprintemplate.entity;

public class Leg_Reconocimientos {
	private int idreconoci;
	private String fecha;  
	private int anio;
	private String labor;
	private String reconco_descip;
	private String lugar;
	private String estado;
	private String tipo;
	private String url;
	private int institucion;
	private int docente;
	public int getIdreconoci() {
		return idreconoci;
	}
	public void setIdreconoci(int idreconoci) {
		this.idreconoci = idreconoci;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getLabor() {
		return labor;
	}
	public void setLabor(String labor) {
		this.labor = labor;
	}
	public String getReconco_descip() {
		return reconco_descip;
	}
	public void setReconco_descip(String reconco_descip) {
		this.reconco_descip = reconco_descip;
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
	public int getInstitucion() {
		return institucion;
	}
	public void setInstitucion(int institucion) {
		this.institucion = institucion;
	}
	public int getDocente() {
		return docente;
	}
	public void setDocente(int docente) {
		this.docente = docente;
	}
	public Leg_Reconocimientos(String fecha, int anio, String labor, String reconco_descip, String lugar, String estado,
			String tipo, String url, int institucion, int docente) {
		super();
		this.fecha = fecha;
		this.anio = anio;
		this.labor = labor;
		this.reconco_descip = reconco_descip;
		this.lugar = lugar;
		this.estado = estado;
		this.tipo = tipo;
		this.url = url;
		this.institucion = institucion;
		this.docente = docente;
	}
	public Leg_Reconocimientos(int idreconoci, String url) {
		super();
		this.idreconoci = idreconoci;
		this.url = url;
	}
	 
	  
}
  