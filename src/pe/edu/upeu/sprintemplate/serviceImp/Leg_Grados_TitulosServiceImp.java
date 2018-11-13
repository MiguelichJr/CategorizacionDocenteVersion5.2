package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.sprintemplate.dao.Leg_Grados_TitulosDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Grados_Titulos;
import pe.edu.upeu.sprintemplate.service.Leg_Grados_TitulosService;

public class Leg_Grados_TitulosServiceImp implements Leg_Grados_TitulosService {
	
	@Autowired
	private Leg_Grados_TitulosDao leggradosDao;  
	
	@Override
	public int create(Leg_Grados_Titulos l) {
		// TODO Auto-generated method stub
		return leggradosDao.create(l); 
	}

	@Override
	public int update(Leg_Grados_Titulos l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg_Grados_Titulos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
