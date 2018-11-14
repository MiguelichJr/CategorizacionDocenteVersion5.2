package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Leg;
   
public interface LegDao {
	int create(Leg l); 
	int update(Leg l);
	int delete(int id);                    
	Leg read(int id); 
	List<Map<String,Object>> readAllExperienciaProfesional(int id);
	List<Map<String,Object>> readAllExperienciaAcademicoAdministrativa(int id); 
}
