

package pe.edu.upeu.sprintemplate.daoImp;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.sprintemplate.dao.AutoevaluacionDao;
import pe.edu.upeu.sprintemplate.entity.Autoevaluacion;
@Repository
public class AutoevaluacionDaoImp implements AutoevaluacionDao {
	
	          
	
	@Autowired
	private JdbcTemplate autoevaluacion;
	
   
	public JdbcTemplate getAutoevaluacion() {
		return autoevaluacion;
	}


	public void setAutoevaluacion(JdbcTemplate autoevaluacion) {
		this.autoevaluacion = autoevaluacion;
	}
 

	@Override    
	public String create(Autoevaluacion a)  {              
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(autoevaluacion).withProcedureName("registrar_nota_autoevaluacioin");
		jdbcCall.addDeclaredParameter(new SqlParameter("puntaje1",OracleTypes.INTEGER));   
		jdbcCall.addDeclaredParameter(new SqlParameter("docente_id",OracleTypes.INTEGER));  
		jdbcCall.addDeclaredParameter(new SqlParameter("persona_id",OracleTypes.INTEGER)); 
		jdbcCall.addDeclaredParameter(new SqlParameter("instrumento",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));
		Map<String,Object> auto= jdbcCall.execute(a.getNota(),a.getId_docente(),a.getPersona_id_pers(),a.getId_instr());               
		String resultado=(String) auto.get("lista");    
		return resultado;
	}
	/*
	@Autowired
	private JdbcTemplate autoevaluacion;

	public JdbcTemplate getAutoevaluacion() {
		return autoevaluacion;
	}

	public void setAutoevaluacion(JdbcTemplate autoevaluacion) {
		this.autoevaluacion = autoevaluacion;
	}
 
	@Override  
	public String create(Autoevaluacion aut) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(autoevaluacion).withProcedureName("registrar_nota_autoevaluacioin");
		jdbcCall.addDeclaredParameter(new SqlParameter("puntaje1",OracleTypes.NUMBER));
		jdbcCall.addDeclaredParameter(new SqlParameter("docente_id",OracleTypes.INTEGER));  
		jdbcCall.addDeclaredParameter(new SqlParameter("persona_id",OracleTypes.INTEGER)); 
		jdbcCall.addDeclaredParameter(new SqlParameter("instrumento",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));
		Map<String,Object> auto= jdbcCall.execute(aut.getId_docente(),aut.getPersona_id_pers(),aut.getId_instr(),aut.getNota()); 
		String resultado=(String) auto.get("lista");
		return resultado;          
	   		}
  
	                
   */ 
}
 