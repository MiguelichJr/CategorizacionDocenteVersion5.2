package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.docente_convocatoriaDao;
import pe.edu.upeu.sprintemplate.entity.docente_convocatoria;

public class docente_convocatoriaDaoImp implements docente_convocatoriaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(docente_convocatoria dc) {
		int x=0;
		String sql="call Crear_docente_convocatoria(?,?,?,?)";
		try {
			jdbcTemplate.update(sql,new Object[] { dc.getRegimedOCENTE(),dc.getIdconvocatoeri(),dc.getIdcategoria(),dc.getIdPersona()});
			x = 1;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		System.out.println(x);
		return x;
	}

	@Override
	public boolean busExisteExpediente(docente_convocatoria dc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<docente_convocatoria> read() {
		String sql="select * from doce_por_conv where convocatoria_idcnvo=(SELECT idcnvo FROM convocatoria where estado='1') and doce_por_conv.estado='1' order by iddocon";
		return this.jdbcTemplate.query(sql, new docente_convocatoriaRowMapper());
	}

	@Override
	public List<docente_convocatoria> readid(int id) {
		String sql="select * from doce_por_conv where estado='1' and convocatoria_idcnvo=? order by iddocon";
		return this.jdbcTemplate.query(sql, new docente_convocatoriaRowMapper(),id);
	}


	@Override
	public List<Map<String,Object>> readl() {
		return this.jdbcTemplate.queryForList("select cd.iddocon,cd.estado,cd.convocatoria_idcnvo,(p.nombre || ' '||p.apellido) as persona,cd.regimen_docente,c.nombre_categoria from doce_por_conv cd,persona p, CATEGORIA c where P.IDPERS=CD.PERSONA_IDPERS and c.idcate=cd.categoria_idcate and cd.estado='1' and cd.convocatoria_idcnvo=(SELECT idcnvo FROM convocatoria where estado='1')   order by iddocon");
	}


	@Override
	public int delete(int id) {
		int x = 0;
		String sql = "update doce_por_conv set estado='0' where iddocon=?";
		try {
			jdbcTemplate.update(sql, new Object[] { id });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

}
