package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
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
	public String create(Leg_Extras l) {
		
		String sql="CREAR_LEG_LOGEXTS";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg_extrassss).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("decla",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("URL2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("esta",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));
		Map<String,Object> leg= jdbcCall.execute(l.getDeclaracion(),l.getUrl(),l.getDocente(),l.getEstado()); 
		String resultado=(String) leg.get("lista");
		return resultado;          
	   	
	}

	@Override
	public int update(Leg_Extras l) {
		// TODO Auto-generated method stub
		int x = 0; 
		String sql = "update leg_logexts set url=? where Idlogros=?";
		try {   
			leg_extrassss.update(sql, new Object[] { l.getUrl(),l.getId()}); 
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
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
