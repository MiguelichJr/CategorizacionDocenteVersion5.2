package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.PersonaDao;
import pe.edu.upeu.sprintemplate.entity.Persona;


public class PersonaDaoImpl implements PersonaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public List<Persona> read() {
		String sql="select * from persona";
		return this.jdbcTemplate.query(sql,new PersonaRowMapper());
	}



	@Override
	public List<Persona> buscarDocenEvalua() {
		String sql="select * from persona WHERE idpers NOT IN (select persona_idpers from doce_por_conv  where convocatoria_idcnvo=(SELECT idcnvo FROM convocatoria where estado='activo') and doce_por_conv.estado='1')";  
		return this.jdbcTemplate.query(sql,new PersonaRowMapper());    
	}         
  


	@Override
	public List<Persona> buscarCondocen() {
		// TODO Auto-generated method stub
		return null;
	}

}
