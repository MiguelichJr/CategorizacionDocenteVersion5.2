package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.designar_evaluadoresDao;
import pe.edu.upeu.sprintemplate.entity.designar_evaluacion;

public class designar_EvaluadoresDaImp implements designar_evaluadoresDao {
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Map<String, Object>> read() {
		
		return this.JdbcTemplate.queryForList("select a.id_dsgeva,(select (p.nombre||' '|| p.apellido) from persona p where p.idpers=a.persona_idpers) as evaluador, (select ins.nombre_plantilla from instrumento ins where ins.IDINSTR=a.INSTRUMENTO_IDINSTR) as Instrumento, c.nombre||' '|| c.apellido docente from desig_evalua a,DOCE_POR_CONV b, persona c where a.doce_por_conv_iddocon=b.iddocon and b.persona_idpers=c.idpers and b.estado='1' and a.estado='1' and b.convocatoria_idcnvo=(SELECT idcnvo FROM convocatoria where estado='1') order by a.id_dsgeva\r\n" + "");
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(designar_evaluacion de) {
		int x=0;
		String sql="call Asignar_docente_convocatoria(?,?,?,?)";
		try {
			JdbcTemplate.update(sql,new Object[] { de.getPuntaje(),de.getIdcon_docente(),de.getIdpersona(),de.getIdinstrumento()});
			x = 1;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		System.out.println(x);
		return x;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String sql = "update desig_evalua set estado='0' where id_dsgeva=?";
		try {
			JdbcTemplate.update(sql, new Object[] { id });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		System.out.println(x);
		return x;
	}

	
}
