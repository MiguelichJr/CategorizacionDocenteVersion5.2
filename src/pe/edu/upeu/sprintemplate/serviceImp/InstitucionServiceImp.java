package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sprintemplate.dao.InstitucionDao;
import pe.edu.upeu.sprintemplate.daoImp.InstitucionDaoImp;
import pe.edu.upeu.sprintemplate.service.InstitucionService;
@Service
public class InstitucionServiceImp implements InstitucionService {

	@Autowired
	private InstitucionDao institucionDao;
	
	   
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return institucionDao.readAll();     
	}

}
