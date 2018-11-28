package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.seccionesDao;
import pe.edu.upeu.sprintemplate.entity.secciones;


public class seccionesDaoImp implements seccionesDao{
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(secciones s) {
		int x=0;
		String sql="INSERT INTO secciones VALUES( NULL,?,?,?,?,null,?)";
		try {
			JdbcTemplate.update(sql,new Object[] {s.getNombre(),s.getPorcentaje(),s.getTipo(),s.getValor_maximo(),s.getIdinstrumento()});
			x = 1;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		System.out.println(x);
		return x;
	}

	@Override
	public int update(secciones s) {
		return JdbcTemplate.update("update secciones set NOMBRE_SECCIONES='"+s.getNombre()+"',PORCETANJE='"+s.getPorcentaje()+"',TIPO_EVALUACION='"+s.getTipo()+"',VALOR_MAXIMO='"+s.getValor_maximo()+"' where IDSCC="+s.getIdsc());
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String sql = "delete from secciones where idscc=?";
		try {
			JdbcTemplate.update(sql, new Object[] { id });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public secciones read(int id) {
		String sql="select * from secciones where idscc=?";
		secciones po=JdbcTemplate.queryForObject(sql, new seccionesRowMapper(),id);
		return po;
	}

	@Override
	public List<secciones> readl(int id) {
		String sql="select * from secciones where instrumento_idinstr=? order by idscc";
		return this.JdbcTemplate.query(sql, new seccionesRowMapper(),id);
	}

}
