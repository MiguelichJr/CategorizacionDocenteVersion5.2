package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

public interface TipoAtributoDao {
	List<Map<String,Object>> readAll_tipodedicacion();
	List<Map<String,Object>> readAll_tipoidioma();
	List<Map<String,Object>> readAll_nivelidioma();  
	List<Map<String,Object>> readAll_dominioidioma();
	List<Map<String,Object>> readAll_tipocurso();
	List<Map<String,Object>> readAll_modalidadeducativa();
	List<Map<String,Object>> readAll_tipoponencia();
	List<Map<String,Object>> readAll_tipocapacitacion();  
	 
}
