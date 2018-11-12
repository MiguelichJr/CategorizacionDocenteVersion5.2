package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.InstitucionDao;
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

}
