package pe.edu.upeu.sprintemplate.entity;

public class Leg3 {
	private int id_leg3;
	private String fecha_inicio;
	private String fecha_termino;
	private int anios;
	private int meses;
	private int dias;
	private String lugar;
	private String cargo;
	private String estado;
	private String tpo;
	private String url;
	private int institucion;
	private int doce;
	public int getId_leg3() {
		return id_leg3;
	}
	public void setId_leg3(int id_leg3) {
		this.id_leg3 = id_leg3;
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTpo() {
		return tpo;
	}
	public void setTpo(String tpo) {
		this.tpo = tpo;
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
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}
	public Leg3(String fecha_inicio, String fecha_termino, int anios, int meses, int dias, String lugar, String estado,
			String tpo, String url, int institucion, int doce) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_termino = fecha_termino;
		this.anios = anios;
		this.meses = meses;
		this.dias = dias;
		this.lugar = lugar;
		this.estado = estado;
		this.tpo = tpo;
		this.url = url;
		this.institucion = institucion;
		this.doce = doce;
	}
	public Leg3(String fecha_inicio, String fecha_termino, String lugar, String cargo, String estado, String tpo,
			String url, int institucion, int doce) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_termino = fecha_termino;
		this.lugar = lugar;
		this.cargo = cargo;
		this.estado = estado;
		this.tpo = tpo;
		this.url = url;
		this.institucion = institucion;
		this.doce = doce;
	} 
	 
	 
	            
}
