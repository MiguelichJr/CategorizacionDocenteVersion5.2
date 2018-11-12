package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sprintemplate.daoImp.GradosDaoImp;
import pe.edu.upeu.sprintemplate.service.GradosService;
@Service
public class GradosServiceImp implements GradosService {

	@Autowired
	private GradosDaoImp gdi;
	  
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return gdi.readAll();      
	}

}
