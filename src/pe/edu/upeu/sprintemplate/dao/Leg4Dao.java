package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg4;

public interface Leg4Dao {
	int create(Leg4 l); 
	int update(Leg4 l);
	int delete(int id);                    
	Leg4 read(int id);          
	List<Map<String,Object>> readAllIdiomas(int id); 
	List<Map<String,Object>> readAllDominiosEnTecnologia(int id); 
 
}
