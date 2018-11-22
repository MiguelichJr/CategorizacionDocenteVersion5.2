package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Reconocimientos;



public interface Leg_ReconociDao {
	String create(Leg_Reconocimientos l);   
	int update(Leg_Reconocimientos l);
	int delete(int id);                    
	Leg_Reconocimientos read(int id);                      
	List<Map<String,Object>> readAllLeg_Reconocimientos(int id);    
}
