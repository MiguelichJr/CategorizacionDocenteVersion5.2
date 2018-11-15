package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.Leg4Dao;
import pe.edu.upeu.sprintemplate.entity.Leg4;
@Repository
public class Leg4DaoImp implements Leg4Dao {
 
	@Autowired
	private JdbcTemplate leg4;
	
	   
	
	
	public JdbcTemplate getLeg4() {
		return leg4;
	}

	public void setLeg4(JdbcTemplate leg4) {
		this.leg4 = leg4;
	}

	@Override
	public int create(Leg4 l) {
		// TODO Auto-generated method stub
		return leg4.update("call crear_LEG4(?,?,?,?,?,?,?,?,?)",l.getFecha(),l.getEstado(),l.getTipo(),l.getUrl(),l.getAtri1(),l.getAtri2(),l.getAtri3(),l.getInstitucion(),l.getDoce());
	}        

	@Override
	public int update(Leg4 l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg4 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllIdiomas(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllDominiosEnTecnologia(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
