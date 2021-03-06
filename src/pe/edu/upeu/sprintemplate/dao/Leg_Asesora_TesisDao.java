package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Asesora_Tesis;



public interface Leg_Asesora_TesisDao {
	String create(Leg_Asesora_Tesis l); 
	int update(Leg_Asesora_Tesis l);
	int delete(Leg_Asesora_Tesis l);                     
	Leg_Asesora_Tesis read(int id);                     
	List<Map<String,Object>> readAllLegAsesoraTesisss(int id); 

}
