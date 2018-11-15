package pe.edu.upeu.sprintemplate.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;   
import org.springframework.stereotype.Service;
import pe.edu.upeu.sprintemplate.dao.UsuarioDao;
import pe.edu.upeu.sprintemplate.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	} 
        
	
	 
	
	
	
}
  