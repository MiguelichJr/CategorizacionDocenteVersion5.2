package pe.edu.upeu.sprintemplate.entity;

public class secciones {
	private int idsc;
	private  String  nombre;
	private String porcentaje;
	private String tipo;
	private String valor_maximo;
	private  int secciones_id;
	private int idinstrumento;
	public secciones() {
		super();
	}
	
	public secciones(String nombre, String porcentaje, String tipo, String valor_maximo, int idinstrumento) {
		super();
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.tipo = tipo;
		this.valor_maximo = valor_maximo;
		this.idinstrumento = idinstrumento;
	}

	public secciones(String nombre, String porcentaje, String tipo, String valor_maximo, int secciones_id,
			int idinstrumento) {
		super();
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.tipo = tipo;
		this.valor_maximo = valor_maximo;
		this.secciones_id = secciones_id;
		this.idinstrumento = idinstrumento;
	}
	public secciones(int idsc, String nombre, String porcentaje, String tipo, String valor_maximo, int secciones_id,
			int idinstrumento) {
		super();
		this.idsc = idsc;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.tipo = tipo;
		this.valor_maximo = valor_maximo;
		this.secciones_id = secciones_id;
		this.idinstrumento = idinstrumento;
	}
	public int getIdsc() {
		return idsc;
	}
	public void setIdsc(int idsc) {
		this.idsc = idsc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor_maximo() {
		return valor_maximo;
	}
	public void setValor_maximo(String valor_maximo) {
		this.valor_maximo = valor_maximo;
	}
	public int getSecciones_id() {
		return secciones_id;
	}
	public void setSecciones_id(int secciones_id) {
		this.secciones_id = secciones_id;
	}
	public int getIdinstrumento() {
		return idinstrumento;
	}
	public void setIdinstrumento(int idinstrumento) {
		this.idinstrumento = idinstrumento;
	}
	@Override
	public String toString() {
		return "secciones [idsc=" + idsc + ", nombre=" + nombre + ", porcentaje=" + porcentaje + ", tipo=" + tipo
				+ ", valor_maximo=" + valor_maximo + ", secciones_id=" + secciones_id + ", idinstrumento="
				+ idinstrumento + "]";
	}
	
	
}
