package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Extras;



public interface Leg_ExtraDao {
	String create(Leg_Extras l);   
	int update(Leg_Extras l);
	int delete(Leg_Extras l);                      
	Leg_Extras read(int id);                           
	List<Map<String,Object>> readAllLeg_Extras(int id);
}
