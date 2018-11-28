package pe.edu.upeu.sprintemplate.entity;

public class instrumento {
	private int idinstrumento;
	private String nombre_plantilla;
	private String estado;
	private String tipo;
	private String porcentaje;
	private int idconvocatori;
	public instrumento() {
		super();
	}
	public instrumento(String nombre_plantilla, String estado, String tipo, String porcentaje, int idconvocatori) {
		super();
		this.nombre_plantilla = nombre_plantilla;
		this.estado = estado;
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.idconvocatori = idconvocatori;
	}
	
	public instrumento(String nombre_plantilla, String tipo, String porcentaje, int idconvocatori) {
		super();
		this.nombre_plantilla = nombre_plantilla;
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.idconvocatori = idconvocatori;
	}
	public instrumento(int idinstrumento, String nombre_plantilla, String estado, String tipo, String porcentaje) {
		super();
		this.idinstrumento = idinstrumento;
		this.nombre_plantilla = nombre_plantilla;
		this.estado = estado;
		this.tipo = tipo;
		this.porcentaje = porcentaje;
	}
	public instrumento(int idinstrumento, String nombre_plantilla, String estado, String tipo, String porcentaje,
			int idconvocatori) {
		super();
		this.idinstrumento = idinstrumento;
		this.nombre_plantilla = nombre_plantilla;
		this.estado = estado;
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.idconvocatori = idconvocatori;
	}
	
	
	public int getIdinstrumento() {
		return idinstrumento;
	}
	public void setIdinstrumento(int idinstrumento) {
		this.idinstrumento = idinstrumento;
	}
	public String getNombre_plantilla() {
		return nombre_plantilla;
	}
	public void setNombre_plantilla(String nombre_plantilla) {
		this.nombre_plantilla = nombre_plantilla;
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
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	public int getIdconvocatori() {
		return idconvocatori;
	}
	public void setIdconvocatori(int idconvocatori) {
		this.idconvocatori = idconvocatori;
	}
	@Override
	public String toString() {
		return "instrumento [idinstrumento=" + idinstrumento + ", nombre_plantilla=" + nombre_plantilla + ", estado="
				+ estado + ", tipo=" + tipo + ", porcentaje=" + porcentaje + ", idconvocatori=" + idconvocatori + "]";
	}
	
	
}
