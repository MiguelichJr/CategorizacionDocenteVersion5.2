package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg_InvestiDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Investi;

public class Leg_InvestiDaoImp implements Leg_InvestiDao {
	
	@Autowired
	private JdbcTemplate leg_investi;
	  
	
	
	public JdbcTemplate getLeg_investi() {
		return leg_investi;
	}

	public void setLeg_investi(JdbcTemplate leg_investi) {
		this.leg_investi = leg_investi;
	}

	@Override
	public int create(Leg_Investi l) {
		// TODO Auto-generated method stub
		return leg_investi.update("call crear_LEG_INVESTI(?,?,?,?,?,?)",l.getAnio(),l.getTitulo(),l.getNumero_resolucion(),l.getEstado(),l.getUrl(),l.getDoce());
	}
    
	@Override
	public int update(Leg_Investi l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg_Investi read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllLegInvestigaciones(int id) {
		// TODO Auto-generated method stub    
		return leg_investi.queryForList("select * from LEG_INVESTI where DOCE_POR_CONV_IDDOCON="+id);
	}

}
