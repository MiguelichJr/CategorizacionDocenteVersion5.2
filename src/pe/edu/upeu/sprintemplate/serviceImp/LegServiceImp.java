package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.sprintemplate.dao.LegDao;
import pe.edu.upeu.sprintemplate.entity.Leg;
import pe.edu.upeu.sprintemplate.service.LegService;

public class LegServiceImp implements LegService {
	
	@Autowired
	private LegDao legDao;
	
	
	@Override
	public int create(Leg l) {
		// TODO Auto-generated method stub
		return legDao.create(l);
	}
     
	@Override
	public int update(Leg l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
