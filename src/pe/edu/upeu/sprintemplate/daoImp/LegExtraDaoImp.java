package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg_ExtraDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Extras;

public class LegExtraDaoImp implements Leg_ExtraDao {
	@Autowired
	private JdbcTemplate leg_extrassss;
	
	
	public JdbcTemplate getLeg_extrassss() {
		return leg_extrassss;
	}   

	public void setLeg_extrassss(JdbcTemplate leg_extrassss) {
		this.leg_extrassss = leg_extrassss;
	}

	@Override 
	public int create(Leg_Extras l) {
		// TODO Auto-generated method stub
		return leg_extrassss.update("call crear_LEG_LOGEXTS(?,?,?,?)",l.getDeclaracion(),l.getUrl(),l.getDocente(),l.getEstado());
	}

	@Override
	public int update(Leg_Extras l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg_Extras read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllLeg_Extras(int id) {
		// TODO Auto-generated method stub   
		return leg_extrassss.queryForList("select * from leg_logexts l where l.DOCE_POR_CONV_IDDOCON="+id);
	}
	

}
