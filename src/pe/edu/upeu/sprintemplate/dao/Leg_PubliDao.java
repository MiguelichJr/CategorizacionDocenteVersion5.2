package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Publi;



public interface Leg_PubliDao {
	int create(Leg_Publi l);   
	int update(Leg_Publi l);
	int delete(int id);                    
	Leg_Publi read(int id);                      
	List<Map<String,Object>> readAllLeg_Publi_Articulos(int id); 
	List<Map<String,Object>> readAllLeg_Publi_Libros(int id); 


}
