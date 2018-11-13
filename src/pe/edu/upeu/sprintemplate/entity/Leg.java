package pe.edu.upeu.sprintemplate.entity;

public class Leg {
	private int idleg;
	private String cargo;
	private  String fecha_inicio;
	private String fecha_fin;
	private int años;
	private int meses;
	private int dias;
	private String lugar;
	private String resolucion;
	private String estado;
	private String url;
	private int institucion;
	private int docente;
	private String tipo;
	private int categoria;
	public int getIdleg() {
		return idleg;
	}
	public void setIdleg(int idleg) {
		this.idleg = idleg;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public int getAños() {
		return años;
	}
	public void setAños(int años) {
		this.años = años;
	}
	public int getMeses() {
		return meses;
	}
	public void setMeses(int meses) {
		this.meses = meses;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	 
	public Leg(String cargo, String fecha_inicio, String fecha_fin, int años, int meses, int dias, String lugar,
			String resolucion, String estado, String url, int institucion, int docente, String tipo, int categoria) {
		super();
		this.cargo = cargo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.años = años;
		this.meses = meses;
		this.dias = dias;
		this.lugar = lugar;
		this.resolucion = resolucion;
		this.estado = estado;
		this.url = url;
		this.institucion = institucion;
		this.docente = docente;
		this.tipo = tipo;
		this.categoria = categoria;
	}
	public Leg() {
		super();
	}
	@Override
	public String toString() {
		return "Leg [cargo=" + cargo + ", fecha_inicio=" + fecha_inicio + ", fecha_fin="
				+ fecha_fin + ", años=" + años + ", meses=" + meses + ", dias=" + dias + ", lugar=" + lugar
				+ ", resolucion=" + resolucion + ", estado=" + estado + ", url=" + url + ", institucion=" + institucion
				+ ", docente=" + docente + ", tipo=" + tipo + ", categoria=" + categoria + "]";
	}
	
	  
}
