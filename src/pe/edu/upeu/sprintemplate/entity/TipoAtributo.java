package pe.edu.upeu.sprintemplate.entity;

public class TipoAtributo {
	private int idatri;
	private String nombre_atributo;
	private int cate_atri_idcaatri;
	
	public TipoAtributo() {
		super();
	}          

	public TipoAtributo(int idatri, String nombre_atributo, int cate_atri_idcaatri) {
		super();
		this.idatri = idatri;
		this.nombre_atributo = nombre_atributo;
		this.cate_atri_idcaatri = cate_atri_idcaatri;
	}

	public int getIdatri() {
		return idatri;
	}

	public void setIdatri(int idatri) {
		this.idatri = idatri;
	}

	public String getNombre_atributo() {
		return nombre_atributo;
	}

	public void setNombre_atributo(String nombre_atributo) {
		this.nombre_atributo = nombre_atributo;
	}

	public int getCate_atri_idcaatri() {
		return cate_atri_idcaatri;
	}

	public void setCate_atri_idcaatri(int cate_atri_idcaatri) {
		this.cate_atri_idcaatri = cate_atri_idcaatri;
	}
	
	
	
}
