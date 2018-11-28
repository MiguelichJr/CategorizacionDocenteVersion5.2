package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.secciones;

public class seccionesRowMapper implements RowMapper<secciones> {

	@Override
	public secciones mapRow(ResultSet rs, int rowNum) throws SQLException {
		secciones ne=new secciones();
		ne.setIdsc(rs.getInt("IDSCC"));
		ne.setNombre(rs.getString("NOMBRE_SECCIONES"));
		ne.setPorcentaje(rs.getString("PORCETANJE"));
		ne.setTipo(rs.getString("TIPO_EVALUACION"));
		ne.setValor_maximo(rs.getString("VALOR_MAXIMO"));
		ne.setSecciones_id(rs.getInt("SECCIONES_IDSCC"));
		ne.setIdinstrumento(rs.getInt("INSTRUMENTO_IDINSTR"));
		return ne;
	}

}
