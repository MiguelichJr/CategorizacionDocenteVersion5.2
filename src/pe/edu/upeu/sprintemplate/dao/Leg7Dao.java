package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg7;
     

public interface Leg7Dao {
	String create(Leg7 l); 
	int update(Leg7 l);
	int delete(Leg7 l);                     
	Leg7 read(int id);                         
	List<Map<String,Object>> readAllLeg7ExtensionCultural(int id); 
}
