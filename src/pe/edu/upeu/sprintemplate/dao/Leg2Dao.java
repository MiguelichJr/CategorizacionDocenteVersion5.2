package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg2;

public interface Leg2Dao {
	int create(Leg2 l); 
	int update(Leg2 l);
	int delete(int id);                    
	Leg2 read(int id);        
	List<Map<String,Object>> readAllCategoriaDocente(int id);
	List<Map<String,Object>> readAllExpeDocen_EnPresencial(int id); 
}
 
