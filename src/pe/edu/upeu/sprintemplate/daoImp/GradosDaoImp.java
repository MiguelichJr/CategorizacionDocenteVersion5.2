package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.GradosDao;
@Repository
public class GradosDaoImp implements GradosDao {
	/*
	@Autowired
	private JdbcTemplate g;
	
	

	public JdbcTemplate getG() {
		return g;
	}



	public void setG(JdbcTemplate g) {
		this.g = g;
	}

*/
  
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub      
		return null; //g.queryForList("select * from grado");
	}

}
