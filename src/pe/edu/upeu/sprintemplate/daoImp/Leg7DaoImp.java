package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.sprintemplate.dao.Leg7Dao;
import pe.edu.upeu.sprintemplate.entity.Leg7;

public class Leg7DaoImp implements Leg7Dao{
	
	@Autowired
	private JdbcTemplate leg_extension;
	 
	
	
	public JdbcTemplate getLeg_extension() {
		return leg_extension;
	}

	public void setLeg_extension(JdbcTemplate leg_extension) {
		this.leg_extension = leg_extension;
	}

	@Override 
	public String create(Leg7 l) { 
		String sql="crear_LEG7_EXTN_CUL";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg_extension).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("anio2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("nombre2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("pobla",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("lugar2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("npar",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("estado2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("tipo2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));  
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));   
		Map<String,Object> leg= jdbcCall.execute(l.getAnio(),l.getTitulo(),l.getPoblacion_onjetiva(),l.getLugar(),l.getNparticipantes(),l.getEstado(),l.getTipo(),l.getUrl(),l.getDocente()); 
		String resultado=(String) leg.get("lista");
		return resultado;    
		
		
		// TODO Auto-generated method stub 
		//return leg_extension.update("call crear_LEG7_EXTN_CUL(?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getTitulo(),l.getPoblacion_onjetiva(),l.getLugar(),l.getNparticipantes(),l.getEstado(),l.getTipo(),l.getUrl(),l.getDocente());
	}   

	@Override
	public int update(Leg7 l) {
		int x = 0;    
		String sql = "update LEG7_EXTN_CUL set url=? where ID_LEG7=?";
		try {    
			leg_extension.update(sql, new Object[] { l.getUrl(),l.getIdleg7()}); 
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
	public Leg7 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Override
	public List<Map<String, Object>> readAllLeg7ExtensionCultural(int id) {
		// TODO Auto-generated method stub
		return leg_extension.queryForList("select l.ANIO,l.TITULO,l.POBLACION_OBJETIVA,l.LUGAR,l.NPARTICIPANTES,l.ESTADO,l.TIPO,l.URL,l.DOCE_POR_CONV_IDDOCON  from leg7_extn_cul l where  l.DOCE_POR_CONV_IDDOCON="+id);
	}
}
