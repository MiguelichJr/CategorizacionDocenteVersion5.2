package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.EspecialidadDao;
@Repository
public class EspecialidadDaoImp implements EspecialidadDao {

	@Autowired
	private JdbcTemplate je;       
	
	
	
	     


	@Override      
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub   
		return je.queryForList("select * from especialidad");
	}






	public JdbcTemplate getJe() {
		return je;
	}






	public void setJe(JdbcTemplate je) {
		this.je = je;
	}

}
