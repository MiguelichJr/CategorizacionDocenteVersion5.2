package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg_Grados_TitulosDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Grados_Titulos;

public class Leg_Grados_TitulosDaoImp implements Leg_Grados_TitulosDao {
 
	@Autowired
	private JdbcTemplate jleg;
	
	
	public JdbcTemplate getJleg() {
		return jleg;
	}  

	public void setJleg(JdbcTemplate jleg) {
		this.jleg = jleg;
	}

	@Override
	public int create(Leg_Grados_Titulos l) {
		// TODO Auto-generated method stub
		return jleg.update("call crear_LEgGradosTitulosEstudios(?,?,?,?,?,?,?,?,?)",l.getFecha_termino(),l.getEstado(),l.getTesis(),l.getUrl(),l.getUrl2(),l.getInstitucion(),l.getGrado(),l.getEspecialidad(),l.getDocente());
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