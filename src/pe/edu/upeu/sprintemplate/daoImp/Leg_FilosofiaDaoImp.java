package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.sprintemplate.dao.Leg_FiloDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Filosofia_Mision;

public class Leg_FilosofiaDaoImp implements Leg_FiloDao {
	
	@Autowired 
	private JdbcTemplate leg_filosofiamision;
	 
	
	
	public JdbcTemplate getLeg_filosofiamision() {
		return leg_filosofiamision;
	}

	public void setLeg_filosofiamision(JdbcTemplate leg_filosofiamision) {
		this.leg_filosofiamision = leg_filosofiamision;
	}
 
	@Override
	public String create(Leg_Filosofia_Mision l) {
 
		String sql="crear_LEG_FILMISI";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg_filosofiamision).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("decla",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("tipo",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("docu",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("esta",OracleTypes.VARCHAR));  
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));  
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));   
		Map<String,Object> leg= jdbcCall.execute(l.getNombre(),l.getTipo_filosofia(),l.getUrl(),l.getDocumento(),l.getEstado(),l.getDocente()); 
		String resultado=(String) leg.get("lista");
		return resultado;   
		// TODO Auto-generated method stub
		//return leg_filosofiamision.update("call crear_LEG_FILMISI(?,?,?,?,?,?)",l.getNombre(),l.getTipo_filosofia(),l.getUrl(),l.getDocumento(),l.getEstado(),l.getDocente());  
	}  
    
	@Override
	public int update(Leg_Filosofia_Mision l) {
		int x = 0; 
		String sql = "update leg_filmisi set url=? where ID_FILOSOFIA=?";
		try {   
			leg_filosofiamision.update(sql, new Object[] { l.getUrl(),l.getIdfilosifia()}); 
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
	public Leg_Filosofia_Mision read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	public List<Map<String, Object>> readAllLeg_Cosmovision(int id) {
		// TODO Auto-generated method stub
		return leg_filosofiamision.queryForList("select l.NOMBRE,l.DOCUMENTO_SI_NO,l.URL from leg_filmisi l where l.TIPO_FILOSOFIA='Cosmovision' and l.DOCE_POR_CONV_IDDOCON="+id);
	}

	@Override
	public List<Map<String, Object>> readAllLeg_IntegracionEnseñanza(int id) {
		// TODO Auto-generated method stub
		return leg_filosofiamision.queryForList("select l.NOMBRE,l.DOCUMENTO_SI_NO,l.URL from leg_filmisi l where l.TIPO_FILOSOFIA='Integracion Fe' and l.DOCE_POR_CONV_IDDOCON="+id);
	}
 
	@Override
	public List<Map<String, Object>> readAllLeg_ServicioApredizaje(int id) {
		// TODO Auto-generated method stub
		return leg_filosofiamision.queryForList("select l.NOMBRE,l.DOCUMENTO_SI_NO,l.URL from leg_filmisi l where l.TIPO_FILOSOFIA='Servicio Aprendizaje' and l.DOCE_POR_CONV_IDDOCON="+id);
	} 

}
