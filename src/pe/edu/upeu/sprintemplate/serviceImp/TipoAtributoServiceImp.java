package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.sprintemplate.dao.TipoAtributoDao;
import pe.edu.upeu.sprintemplate.service.TipoAtributoService;

public class TipoAtributoServiceImp implements TipoAtributoService {

	@Autowired
	private TipoAtributoDao tipoatributoDao;
	
	
	
	@Override
	public List<Map<String, Object>> readAll_tipodedicacion() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipodedicacion();
	}

	@Override
	public List<Map<String, Object>> readAll_tipoidioma() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipoidioma();
	}

	@Override
	public List<Map<String, Object>> readAll_nivelidioma() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_nivelidioma();
	}

	@Override
	public List<Map<String, Object>> readAll_dominioidioma() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_dominioidioma();          
	}

	@Override
	public List<Map<String, Object>> readAll_tipocurso() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipocurso();
	}

	@Override
	public List<Map<String, Object>> readAll_modalidadeducativa() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_modalidadeducativa();   
	}

	@Override
	public List<Map<String, Object>> readAll_tipoponencia() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipoponencia();           
	}

	@Override
	public List<Map<String, Object>> readAll_tipocapacitacion() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipocapacitacion(); 
	}

	@Override
	public List<Map<String, Object>> readAll_tipopublicaciones() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipopublicaciones();
	}

	@Override
	public List<Map<String, Object>> readAll_tipopublicaciones_espe() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_tipopublicaciones_espe();   
	}

	@Override
	public List<Map<String, Object>> readAll_nivelasesoria() {
		// TODO Auto-generated method stub
		return tipoatributoDao.readAll_nivelasesoria();    
	}

}
