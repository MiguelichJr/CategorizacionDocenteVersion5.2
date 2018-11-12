package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sprintemplate.dao.EspecialidadDao;
import pe.edu.upeu.sprintemplate.daoImp.EspecialidadDaoImp;
import pe.edu.upeu.sprintemplate.service.EspecialidadService;
@Service
public class EspecialidadServiceImp implements EspecialidadService {

	@Autowired 
	private EspecialidadDao especialidadDao;
	
	              
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return especialidadDao.readAll();          
	}

}
      