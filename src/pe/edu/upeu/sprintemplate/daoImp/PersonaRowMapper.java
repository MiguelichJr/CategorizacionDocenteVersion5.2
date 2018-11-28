package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.Persona;

public class PersonaRowMapper implements RowMapper<Persona> {

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Persona per=new Persona();
		per.setIdpersona(rs.getInt("IDPERS"));
		per.setNombre(rs.getString("NOMBRE"));
		per.setApellido(rs.getString("APELLIDO"));
		per.setDni(rs.getString("url(dni)"));
		per.setPartidadenacimiento(rs.getString("url(partida_nacimiento)"));
		return per;
	}

}
