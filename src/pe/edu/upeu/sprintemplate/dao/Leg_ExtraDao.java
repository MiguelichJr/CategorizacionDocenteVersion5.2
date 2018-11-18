package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Extras;



public interface Leg_ExtraDao {
	int create(Leg_Extras l);   
	int update(Leg_Extras l);
	int delete(int id);                     
	Leg_Extras read(int id);                           
	List<Map<String,Object>> readAllLeg_Extras(int id);
}
