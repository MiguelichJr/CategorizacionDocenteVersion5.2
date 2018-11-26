package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Institucion;

public interface InstitucionDao {
	List<Map<String,Object>> readAll();
	List<Map<String,Object>> readAllPrivilegios(Institucion i);     
}
