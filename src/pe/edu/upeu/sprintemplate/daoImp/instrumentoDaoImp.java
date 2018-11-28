package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.instrumentoDao;
import pe.edu.upeu.sprintemplate.entity.instrumento;

public class instrumentoDaoImp implements instrumentoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(instrumento i) {
		int x=0;
		String sql="insert into instrumento values(null,?,'1',?,?,?)";
		try {
			jdbcTemplate.update(sql,new Object[] {i.getNombre_plantilla(),i.getTipo(),i.getPorcentaje(),i.getIdconvocatori()});
			x = 1;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		System.out.println(x);
		return x;
	}

	@Override
	public int update(instrumento i) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update instrumento set NOMBRE_PLANTILLA='"+i.getNombre_plantilla()+"',ESTADO='"+i.getEstado()+"',TIPO='"+i.getTipo()+"',PORCENTAJE='"+i.getPorcentaje()+"' where IDINSTR="+i.getIdinstrumento());
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String sql = "update instrumento set estado='0' where idinstr =?";
		try {
			jdbcTemplate.update(sql, new Object[] { id });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		System.out.println(x);
		return x;
	}

	@Override
	public instrumento read(int id) {
		String sql="select * from instrumento where  idinstr=?";
		instrumento po=jdbcTemplate.queryForObject(sql, new instrumentoRowMapper(),id);
		return po;
	}

	@Override
	public List<instrumento> readAll() {
		String sql="select * from instrumento where estado='1' order by idinstr";
		return this.jdbcTemplate.query(sql, new instrumentoRowMapper());
	}


}
