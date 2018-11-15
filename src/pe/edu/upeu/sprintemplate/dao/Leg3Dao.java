package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg3;



public interface Leg3Dao {
	int create(Leg3 l);  
	int update(Leg3 l);
	int delete(int id);                    
	Leg3 read(int id);        
	List<Map<String,Object>> readAllEDUEnComplementarias(int id);
	List<Map<String,Object>> readAllEDUEnEntornosVirtuales(int id); 
       
}
