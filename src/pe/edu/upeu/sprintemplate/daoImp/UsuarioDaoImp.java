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
import pe.edu.upeu.sprintemplate.dao.UsuarioDao;
import pe.edu.upeu.sprintemplate.entity.Usuario;


@Repository
public class UsuarioDaoImp implements UsuarioDao {
  
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getjdbcTemplate() { 
		return jdbcTemplate;  
	}

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate; 
	}
	
	@Override
	public List<Map<String, Object>> readAllLogin(Usuario u) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> listo;
		String sql="VALIDARUSUARIO_PROCEDURE";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(jdbcTemplate).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("a",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("b",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.CURSOR));
		Map<String,Object> leg= jdbcCall.execute(u.getNom_user(),u.getClave()); 
		listo=(List<Map<String,Object>>) leg.get("lista");
		return listo;                 
	}

	@Override 
	public List<Map<String, Object>> readAllModulos(Usuario u) {
		List<Map<String,Object>> listo;
		String sql="LISTAR_MODULOS_PORIDROL";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(jdbcTemplate).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("a",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.CURSOR));
		Map<String,Object> leg= jdbcCall.execute(u.getIdmodulo());     
		listo=(List<Map<String,Object>>) leg.get("lista");
		return listo;
	}

	@Override
	public List<Map<String, Object>> readAllPrivilegios(int id) {
		List<Map<String,Object>> listo;
		String sql="LISTAR_PRIVILEGIOS";           
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(jdbcTemplate).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("a",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.CURSOR));
		Map<String,Object> leg= jdbcCall.execute(id);           
		listo=(List<Map<String,Object>>) leg.get("lista");
		return listo;
	}     
        

	
	
}
