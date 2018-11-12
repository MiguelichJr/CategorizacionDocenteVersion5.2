package pe.edu.upeu.sprintemplate.entity;

public class Usuario {
	private int iduser;
	private String nom_user;
	private String clave;
	private int persona_idpers;
	
	public Usuario(int iduser, String nom_user, String clave, int persona_idpers) {
		super();
		this.iduser = iduser;
		this.nom_user = nom_user;
		this.clave = clave;
		this.persona_idpers = persona_idpers;
	}
	
	public Usuario() {
		super();
	}    

	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getPersona_idpers() {
		return persona_idpers;
	}
	public void setPersona_idpers(int persona_idpers) {
		this.persona_idpers = persona_idpers;
	}
	
	
	
}
