package pe.edu.upeu.sprintemplate.service;

import java.util.List;
import java.util.Map;

public interface TipoAtributoService {
	List<Map<String,Object>> readAll_tipodedicacion();
	List<Map<String,Object>> readAll_tipoidioma();
	List<Map<String,Object>> readAll_nivelidioma();
	List<Map<String,Object>> readAll_dominioidioma();
	List<Map<String,Object>> readAll_tipocurso();
	List<Map<String,Object>> readAll_modalidadeducativa();
	List<Map<String,Object>> readAll_tipoponencia();
	List<Map<String,Object>> readAll_tipocapacitacion();
	List<Map<String,Object>> readAll_tipopublicaciones();
	List<Map<String,Object>> readAll_tipopublicaciones_espe(); 
	List<Map<String,Object>> readAll_nivelasesoria();  
}
