package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.sprintemplate.dao.Leg_ReconociDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Reconocimientos;

public class Leg_ReconociDaoImp implements Leg_ReconociDao {
  
	@Autowired
	private JdbcTemplate leg_reconocimiento;
	 
	
	public JdbcTemplate getLeg_reconocimiento() {
		return leg_reconocimiento;
	}

	public void setLeg_reconocimiento(JdbcTemplate leg_reconocimiento) {
		this.leg_reconocimiento = leg_reconocimiento;
	}
    
	@Override
	public String create(Leg_Reconocimientos l) {
		String sql="crear_LGRECONOCI";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg_reconocimiento).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("fecha",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("anio2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("labor2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("reconocim",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("lugar2",OracleTypes.VARCHAR));  
		jdbcCall.addDeclaredParameter(new SqlParameter("estado2",OracleTypes.VARCHAR)); 
		jdbcCall.addDeclaredParameter(new SqlParameter("tipo2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("insti",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));  
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));   
		Map<String,Object> leg= jdbcCall.execute(l.getFecha(),l.getAnio(),l.getLabor(),l.getReconco_descip(),l.getLugar(),l.getEstado(),l.getTipo(),l.getUrl(),l.getInstitucion(),l.getDocente()); 
		String resultado=(String) leg.get("lista");
		return resultado;   
		// TODO Auto-generated method stub
		//return leg_reconocimiento.update("call crear_LGRECONOCI(?,?,?,?,?,?,?,?,?,?)",l.getFecha(),l.getAnio(),l.getLabor(),l.getReconco_descip(),l.getLugar(),l.getEstado(),l.getTipo(),l.getUrl(),l.getInstitucion(),l.getDocente());
	}
 
	@Override
	public int update(Leg_Reconocimientos l) {
		int x = 0; 
		String sql = "update LGRECONOCI set url=? where IDRECONO=?";
		try {       
			leg_reconocimiento.update(sql, new Object[] { l.getUrl(),l.getIdreconoci()}); 
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
	public Leg_Reconocimientos read(int id) {
		// TODO Auto-generated method stub
		return null;
	} 
  
	@Override
	public List<Map<String, Object>> readAllLeg_Reconocimientos(int id) {
		// TODO Auto-generated method stub
		return leg_reconocimiento.queryForList("select l.FECHA,l.ANIO,l.LABOR,l.RECONOCIMIENTO_DESCRIPCION,l.LUGAR,l.ESTADO,l.TIPO,l.URL,i.NOMBRE_INSTITUCION,l.DOCE_POR_CONV_IDDOCON  from lgreconoci l,institucion i where l.INSTITUCION_IDINT=i.IDINT and l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
