package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg_Grados_Titulos;
         


public interface Leg_Grados_TitulosDao {
	int create(Leg_Grados_Titulos l);
	int update(Leg_Grados_Titulos l);
	int delete(int id);                    
	Leg_Grados_Titulos read(int id);
	List<Map<String,Object>> readAll();  
}
