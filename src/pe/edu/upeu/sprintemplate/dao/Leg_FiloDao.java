package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Filosofia_Mision;


public interface Leg_FiloDao {
	String create(Leg_Filosofia_Mision l);   
	int update(Leg_Filosofia_Mision l);
	int delete(int id);                     
	Leg_Filosofia_Mision read(int id);                      
	List<Map<String,Object>> readAllLeg_Cosmovision(int id);
	List<Map<String,Object>> readAllLeg_IntegracionEnseñanza(int id);
	List<Map<String,Object>> readAllLeg_ServicioApredizaje(int id);

}
