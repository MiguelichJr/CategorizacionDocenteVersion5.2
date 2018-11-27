package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg5;

public interface Leg5Dao {
	String create(Leg5 l); 
	int update(Leg5 l);
	int delete(Leg5 l);                      
	Leg5 read(int id);                  
	List<Map<String,Object>> readAllCyPOrganizaciondeEventos(int id); 
	List<Map<String,Object>> readAllCapacitacionenlaDocencia(int id);         
}
