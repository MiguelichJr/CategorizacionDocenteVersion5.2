package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.Convocatoria;

public class convocatoriaRowMapper implements RowMapper<Convocatoria> {

	@Override
	public Convocatoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Convocatoria co=new Convocatoria();
		co.setIdconvocatoria(rs.getInt("IDCNVO"));
		co.setFecha_inicio(rs.getString("FECHA_INICIO"));
		co.setFecha_fin(rs.getString("FECHA_FIN"));
		co.setPerido(rs.getString("PERIODO"));
		co.setNombre(rs.getString("NOMBRE"));
		co.setFecha_registro(rs.getString("FECHA_REGISTRO"));
		co.setFecha_inici_legajo(rs.getString("FECHA_INICIO_RECEPCION_LEGAJO"));
		co.setFecha_fin_legajo(rs.getString("FECHA_FIN_RECEPCION_LEGAJO"));
		return co;
	}

}
