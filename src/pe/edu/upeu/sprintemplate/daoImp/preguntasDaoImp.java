package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.preguntasDao;
import pe.edu.upeu.sprintemplate.entity.preguntas;


public class preguntasDaoImp implements preguntasDao{
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(preguntas t) {
		String sql="insert into pregun values (null,?,?,?,null)";
		return JdbcTemplate.update(sql,t.getDescripcion(),t.getValor_maximo(),t.getIdsecciones());
	}

	@Override
	public int update(preguntas t) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("update pregun set descripcion='"+t.getDescripcion()+"', valor_maximo='"+t.getValor_maximo()+"' where idpre="+t.getIdpreguntas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public preguntas read(int id) {
		String sql="select * from pregun where idpre=?";
		preguntas ps=JdbcTemplate.queryForObject(sql,new preguntasRowMapper(),id);
		return ps;
	}

	@Override
	public List<preguntas> readlist(int id) {
		String sql="select * from pregun where secciones_idscc=? order by idpre";
		return this.JdbcTemplate.query(sql, new preguntasRowMapper(),id);
	}

	

}
