package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.UsuarioDao;


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
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		//System.out.println("loloo");
		return jdbcTemplate.queryForList("select *from usuario"); 
	}
	
}
