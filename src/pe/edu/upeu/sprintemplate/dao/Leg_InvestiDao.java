package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Investi;

public interface Leg_InvestiDao {
	String create(Leg_Investi l); 
	int update(Leg_Investi l);   
	int delete(Leg_Investi l);                    
	Leg_Investi read(int id);                  
	List<Map<String,Object>> readAllLegInvestigaciones(int id); 
}
