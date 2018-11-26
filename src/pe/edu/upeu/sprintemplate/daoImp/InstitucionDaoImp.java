package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.sprintemplate.dao.InstitucionDao;
import pe.edu.upeu.sprintemplate.entity.Institucion;
@Repository
public class InstitucionDaoImp implements InstitucionDao {

	@Autowired
	private JdbcTemplate ji;
	

	public JdbcTemplate getJi() {
		return ji;
	}
    

	public void setJi(JdbcTemplate ji) {
		this.ji = ji;
	}


	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ji.queryForList("select * from institucion"); 
	}


	@Override
	public List<Map<String, Object>> readAllPrivilegios(Institucion i) {
		List<Map<String,Object>> listo;
		String sql="LISTAR_PRIVILEGIOS";             
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(ji).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("a",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.CURSOR));
		Map<String,Object> leg= jdbcCall.execute(i.getIdmodulos());           
		listo=(List<Map<String,Object>>) leg.get("lista");
		return listo;
	} 

}
