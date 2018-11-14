package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.LegDao;
import pe.edu.upeu.sprintemplate.entity.Leg;

public class LegDaoImp implements LegDao {
	  
	@Autowired
	private JdbcTemplate jlegg;
	
	 
	public JdbcTemplate getJlegg() {
		return jlegg;
	}

	public void setJlegg(JdbcTemplate jlegg) {
		this.jlegg = jlegg;
	}

	@Override
	public int create(Leg l) {
		// TODO Auto-generated method stub
		return jlegg.update("call CREAR_LEG(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",l.getCargo(),l.getFecha_inicio(),l.getFecha_fin(),l.getAños(),l.getMeses(),l.getDias(),l.getLugar(),l.getResolucion(),l.getEstado(),l.getUrl(),l.getInstitucion(),l.getDocente(),l.getTipo(),l.getCategoria());
	}

	@Override
	public int update(Leg l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg read(int id) {
		// TODO Auto-generated method stub
		return null; 
	}

	@Override  
	public List<Map<String, Object>> readAllExperienciaProfesional(int id) {
		// TODO Auto-generated method stub
		return jlegg.queryForList("select i.nombre_institucion,l.cargo,a.nombre_atributo,l.fecha_inicio,l.fecha_termino,l.anios,l.meses,l.dias,l.lugar,l.url from institucion i,leg l,ATRIBUTOS a where l.INSTITUCION_IDINT=i.IDINT and l.CAATRI=a.IDATRI and l.TIPO='E. profesional' and"
				+ "  l.DOCE_POR_CONV_IDDOCON="+id);   
	}  

	@Override
	public List<Map<String, Object>> readAllExperienciaAcademicoAdministrativa(int id) {
		// TODO Auto-generated method stub       
		return jlegg.queryForList("select i.nombre_institucion,l.cargo,a.nombre_atributo,l.fecha_inicio,l.fecha_termino,l.resolucion,l.lugar,l.url from institucion i,leg l,ATRIBUTOS a where l.INSTITUCION_IDINT=i.IDINT and l.CAATRI=a.IDATRI and l.TIPO='E. AcademicoAdministrativa' and"
				+ "  l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
