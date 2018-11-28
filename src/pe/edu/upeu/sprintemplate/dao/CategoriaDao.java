package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Categoria;

public interface CategoriaDao {
	List<Map<String,Object>> readAll();
	List<Categoria> list();
}
