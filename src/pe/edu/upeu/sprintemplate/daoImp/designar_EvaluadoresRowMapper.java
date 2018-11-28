package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.designar_evaluacion;

public class designar_EvaluadoresRowMapper implements RowMapper<designar_evaluacion> {

	@Override
	public designar_evaluacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		designar_evaluacion de=new designar_evaluacion();
		de.setIdesig_evaluacion(rs.getInt("ID_DSGEVA"));
		de.setEstado(rs.getString("ESTADO"));
		de.setFecha_registro(rs.getString("FECHA_REGISTRO"));
		de.setPuntaje(rs.getString("PUNTAJE"));
		de.setIdcon_docente(rs.getInt("DOCE_POR_CONV_IDDOCON"));
		de.setIdpersona(rs.getInt("PERSONA_IDPERS"));
		de.setIdinstrumento(rs.getInt("INSTRUMENTO_IDINSTR"));
		return de;
	}

}
