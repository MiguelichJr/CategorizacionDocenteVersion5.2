package pe.edu.upeu.sprintemplate.entity;

public class Autoevaluacion {
private int id_dsgva;
private int id_docente;
private  int id_instr;
private int nota;     
private int persona_id_pers;  

public Autoevaluacion( int id_docente, int id_instr, int nota, int persona_id_pers 
		) {
	super();   
	this.id_docente = id_docente;
	this.id_instr = id_instr;
	this.nota = nota; 
	this.persona_id_pers = persona_id_pers;      
}
     

public int getId_dsgva() { 
	return id_dsgva;
} 

public void setId_dsgva(int id_dsgva) {
	this.id_dsgva = id_dsgva;
}
       
public int getId_docente() {
	return id_docente;
}

public void setId_docente(int id_docente) {
	this.id_docente = id_docente;
}

public int getId_instr() {
	return id_instr;
}

public void setId_instr(int id_instr) {
	this.id_instr = id_instr;
}

public int getNota() {
	return nota; 
}

public void setNota(int nota) {
	this.nota = nota;
}




public int getPersona_id_pers() {
	return persona_id_pers;
}

public void setPersona_id_pers(int persona_id_pers) {
	this.persona_id_pers = persona_id_pers;
}
  




	 
}
