package pe.edu.upeu.sprintemplate.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.sprintemplate.entity.docente_convocatoria;

public class docente_convocatoriaRowMapper  implements RowMapper<docente_convocatoria>{

	@Override
	public docente_convocatoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		docente_convocatoria ne = new docente_convocatoria();
		ne.setIddocentecon(rs.getInt("IDDOCON"));
		ne.setEstado(rs.getString("ESTADO"));
		ne.setFecha_registro(rs.getString("FECHA_REGISTRO"));
		ne.setRegimedOCENTE(rs.getString("REGIMEN_DOCENTE"));
		ne.setIdconvocatoeri(rs.getInt("CONVOCATORIA_IDCNVO"));
		ne.setIdcategoria(rs.getInt("CATEGORIA_IDCATE"));
		ne.setIdcategoria1(rs.getInt("CATEGORIA_IDCATE1"));
		ne.setIdPersona(rs.getInt("PERSONA_IDPERS"));
		ne.setPerso_secretaria(rs.getString("PERSONA_SECRETARIA"));
		return ne;
	}

}
