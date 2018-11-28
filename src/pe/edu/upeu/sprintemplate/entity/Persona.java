package pe.edu.upeu.sprintemplate.entity;

public class Persona {
	private int idpersona;
	private String nombre;
	private String apellido;
	private String dni;
	private String partidadenacimiento;
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido, String dni, String partidadenacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.partidadenacimiento = partidadenacimiento;
	}
	public Persona(int idpersona, String nombre, String apellido, String dni, String partidadenacimiento) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.partidadenacimiento = partidadenacimiento;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPartidadenacimiento() {
		return partidadenacimiento;
	}
	public void setPartidadenacimiento(String partidadenacimiento) {
		this.partidadenacimiento = partidadenacimiento;
	}
	@Override
	public String toString() {
		return "Persona [idpersona=" + idpersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", partidadenacimiento=" + partidadenacimiento + "]";
	}
	
}
