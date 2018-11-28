package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.designar_evaluacion;

public interface designar_evaluadoresDao {
	int create (designar_evaluacion de);
	
	
	List<Map<String,Object>> read();

	List<Map<String,Object>> read(int id);

	int delete(int id);

}
