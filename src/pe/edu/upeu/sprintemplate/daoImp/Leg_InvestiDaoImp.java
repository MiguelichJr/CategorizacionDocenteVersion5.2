package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
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
	public String create(Leg_Investi l) {
		String sql="crear_LEG_INVESTI";  
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg_investi).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("anio2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("nombre2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("nureso",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("estado2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR)); 
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));  
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));   
		Map<String,Object> leg= jdbcCall.execute(l.getAnio(),l.getTitulo(),l.getNumero_resolucion(),l.getEstado(),l.getUrl(),l.getDoce()); 
		String resultado=(String) leg.get("lista");
		return resultado; 
		// TODO Auto-generated method stub
		//return leg_investi.update("call crear_LEG_INVESTI(?,?,?,?,?,?)",l.getAnio(),l.getTitulo(),l.getNumero_resolucion(),l.getEstado(),l.getUrl(),l.getDoce());
	}
        
	@Override
	public int update(Leg_Investi l) {
		int x = 0;    
		String sql = "update LEG_INVESTI set url=? where ID_LEG_INVESTIGACIONES=?";
		try {    
			leg_investi.update(sql, new Object[] { l.getUrl(),l.getIdleg_investigaciones()}); 
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
	public Leg_Investi read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
     
	@Override
	public List<Map<String, Object>> readAllLegInvestigaciones(int id) {   
		// TODO Auto-generated method stub    
		return leg_investi.queryForList("select * from LEG_INVESTI where estado='completado' and DOCE_POR_CONV_IDDOCON="+id);
	}   

}
