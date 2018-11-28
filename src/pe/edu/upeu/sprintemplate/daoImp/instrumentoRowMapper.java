package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.instrumento;

public class instrumentoRowMapper implements RowMapper<instrumento> {

	@Override
	public instrumento mapRow(ResultSet rs, int rowNum) throws SQLException {
		instrumento in=new instrumento();
		in.setIdinstrumento(rs.getInt("IDINSTR"));
		in.setNombre_plantilla(rs.getString("NOMBRE_PLANTILLA"));
		in.setEstado(rs.getString("ESTADO"));
		in.setTipo(rs.getString("TIPO"));
		in.setPorcentaje(rs.getString("PORCENTAJE"));
		in.setIdconvocatori(rs.getInt("CONVOCATORIA_IDCNVO"));
		return in;
	}

}
