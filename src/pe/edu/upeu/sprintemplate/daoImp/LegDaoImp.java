package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.LegDao;
import pe.edu.upeu.sprintemplate.entity.Leg;

public class LegDaoImp implements LegDao {
	  
	@Autowired
	private JdbcTemplate jlegg;
	
	 
	public JdbcTemplate getJlegg() {
		return jlegg;
	}

	public void setJlegg(JdbcTemplate jlegg) {
		this.jlegg = jlegg;
	}

	@Override
	public int create(Leg l) {
		// TODO Auto-generated method stub
		return jlegg.update("call CREAR_LEG(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",l.getCargo(),l.getFecha_inicio(),l.getFecha_fin(),l.getAños(),l.getMeses(),l.getDias(),l.getLugar(),l.getResolucion(),l.getEstado(),l.getUrl(),l.getInstitucion(),l.getDocente(),l.getTipo(),l.getCategoria());
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
