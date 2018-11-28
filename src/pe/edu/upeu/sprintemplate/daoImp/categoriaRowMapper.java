package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.Categoria;

public class categoriaRowMapper implements RowMapper<Categoria> {

	@Override
	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categoria as=new Categoria();
		as.setIdcate(rs.getInt("IDCATE"));
		as.setNombre_categoria(rs.getString("NOMBRE_CATEGORIA"));
		return as;
	}

}
