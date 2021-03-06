package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.CategoriaDao;
import pe.edu.upeu.sprintemplate.entity.Categoria;

public class CategoriaDaoImp implements CategoriaDao {
 
	@Autowired
	private JdbcTemplate jca;
	
	
	public JdbcTemplate getJca() {
		return jca;
	}


	public void setJca(JdbcTemplate jca) {
		this.jca = jca;
	}


	@Override 
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub 
		return jca.queryForList("select * from categoria");
	}


	@Override
	public List<Categoria> list() {
		String sql="select * from CATEGORIA";
		return jca.query(sql, new categoriaRowMapper());
	}

}
