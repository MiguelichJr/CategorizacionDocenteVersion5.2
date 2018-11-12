package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.sprintemplate.dao.CategoriaDao;
import pe.edu.upeu.sprintemplate.service.CategoriaService;

public class CategoriaServiceImp implements CategoriaService {

	@Autowired
	private CategoriaDao categoriaDao;
	
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return categoriaDao.readAll();   
	}

}
