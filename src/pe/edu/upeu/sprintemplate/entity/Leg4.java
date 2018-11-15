package pe.edu.upeu.sprintemplate.entity;

public class Leg4 {
	private int idleg4;
	private String fecha;
	private String estado;
	private String tipo;
	private String url;
	private int institucion;
	private int doce;
	private int atri1;
	private int atri2;
	private int atri3;
	public int getIdleg4() {
		return idleg4;
	}
	public void setIdleg4(int idleg4) {
		this.idleg4 = idleg4;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
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
	public int getDoce() {
		return doce;
	}
	public void setDoce(int doce) {
		this.doce = doce;
	}
	public int getAtri1() {
		return atri1;
	}
	public void setAtri1(int atri1) {
		this.atri1 = atri1;
	}
	public int getAtri2() {
		return atri2;
	}
	public void setAtri2(int atri2) {
		this.atri2 = atri2;
	}
	public int getAtri3() {
		return atri3;
	}
	public void setAtri3(int atri3) {
		this.atri3 = atri3;
	}
	public Leg4(String fecha, String estado, String tipo, String url, int institucion, int doce, int atri1, int atri2,
			int atri3) {
		super();
		this.fecha = fecha;
		this.estado = estado;
		this.tipo = tipo;
		this.url = url;
		this.institucion = institucion;
		this.doce = doce;
		this.atri1 = atri1;
		this.atri2 = atri2;
		this.atri3 = atri3;
	}
	     
	
	
	
	

}
