package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.Usuario;

public interface UsuarioDao {
		List<Map<String,Object>> readAll(Usuario u);      
}
