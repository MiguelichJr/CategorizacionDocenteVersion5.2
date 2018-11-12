package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.GradosDao;
@Repository
public class GradosDaoImp implements GradosDao {
	
	@Autowired
	private JdbcTemplate j; 
	
	  
    
	       
  
	public JdbcTemplate getJ() {
		return j;
	}


          


	public void setJ(JdbcTemplate j) {
		this.j = j;
	}





	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub      
		return j.queryForList("select * from grado");
	}

}
