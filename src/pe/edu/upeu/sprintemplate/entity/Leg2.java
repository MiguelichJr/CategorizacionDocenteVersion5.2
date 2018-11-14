package pe.edu.upeu.sprintemplate.entity;

public class Leg2 {
	private int idlg2;
	private String fecha_inicio;
	private String fecha_termino;
	private int anios;
	private int meses;
	private int dias;
	private String lugar;
	private String estado;
	private String tipo;
	private String url;
	private int categoria;
	private int institucion;
	private int docente;
	public int getIdlg2() {
		return idlg2;
	}
	public void setIdlg2(int idlg2) {
		this.idlg2 = idlg2;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_termino() {
		return fecha_termino;
	}
	public void setFecha_termino(String fecha_termino) {
		this.fecha_termino = fecha_termino;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
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
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
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
	public Leg2(String fecha_inicio, String fecha_termino, int anios, int meses, int dias, String lugar, String estado,
			String tipo, String url, int categoria, int institucion, int docente) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_termino = fecha_termino;
		this.anios = anios;
		this.meses = meses;
		this.dias = dias;
		this.lugar = lugar;
		this.estado = estado;
		this.tipo = tipo;
		this.url = url;
		this.categoria = categoria;
		this.institucion = institucion;
		this.docente = docente;
	}
	
	       
}
