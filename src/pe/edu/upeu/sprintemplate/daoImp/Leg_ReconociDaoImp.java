package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg_ReconociDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Reconocimientos;

public class Leg_ReconociDaoImp implements Leg_ReconociDao {
  
	@Autowired
	private JdbcTemplate leg_reconocimiento;
	 
	
	public JdbcTemplate getLeg_reconocimiento() {
		return leg_reconocimiento;
	}

	public void setLeg_reconocimiento(JdbcTemplate leg_reconocimiento) {
		this.leg_reconocimiento = leg_reconocimiento;
	}

	@Override
	public int create(Leg_Reconocimientos l) {
		// TODO Auto-generated method stub
		return leg_reconocimiento.update("call crear_LGRECONOCI(?,?,?,?,?,?,?,?,?,?)",l.getFecha(),l.getAnio(),l.getLabor(),l.getReconco_descip(),l.getLugar(),l.getEstado(),l.getTipo(),l.getUrl(),l.getInstitucion(),l.getDocente());
	}

	@Override
	public int update(Leg_Reconocimientos l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override 
	public Leg_Reconocimientos read(int id) {
		// TODO Auto-generated method stub
		return null;
	} 
  
	@Override
	public List<Map<String, Object>> readAllLeg_Reconocimientos(int id) {
		// TODO Auto-generated method stub
		return leg_reconocimiento.queryForList("select l.FECHA,l.ANIO,l.LABOR,l.RECONOCIMIENTO_DESCRIPCION,l.LUGAR,l.ESTADO,l.TIPO,l.URL,i.NOMBRE_INSTITUCION,l.DOCE_POR_CONV_IDDOCON  from lgreconoci l,institucion i where l.INSTITUCION_IDINT=i.IDINT and l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
