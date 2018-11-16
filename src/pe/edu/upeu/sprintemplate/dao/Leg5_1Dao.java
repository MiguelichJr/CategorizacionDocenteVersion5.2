package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg5_1;

public interface Leg5_1Dao {
	int create(Leg5_1 l); 
	int update(Leg5_1 l);
	int delete(int id);                    
	Leg5_1 read(int id);                  
	List<Map<String,Object>> readAllCyPPonenciasCongresos(int id); 
	List<Map<String,Object>> readAllCyPCapacitacionFormalCertificada(int id);         

  
}
