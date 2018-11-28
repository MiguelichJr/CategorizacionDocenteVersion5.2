package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.preguntas;

public class preguntasRowMapper implements RowMapper<preguntas> {

	@Override
	public preguntas mapRow(ResultSet rs, int rowNum) throws SQLException {
		preguntas pr=new preguntas();
		pr.setIdpreguntas(rs.getInt("IDPRE"));
		pr.setDescripcion(rs.getString("DESCRIPCION"));
		pr.setValor_maximo(rs.getString("VALOR_MAXIMO"));
		pr.setIdsecciones(rs.getInt("SECCIONES_IDSCC"));
		pr.setIdtipo_de_categoria(rs.getInt("TI_PREGUNTA_IDTP_PREGUNTA"));
		return pr;
	}

}
