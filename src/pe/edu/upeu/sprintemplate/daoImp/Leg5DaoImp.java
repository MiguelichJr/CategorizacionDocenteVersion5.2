package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.Leg5Dao;
import pe.edu.upeu.sprintemplate.entity.Leg5;
@Repository
public class Leg5DaoImp implements Leg5Dao {
         	
	@Autowired
	private JdbcTemplate leg5;
	
	
	        
	
	public JdbcTemplate getLeg5() {
		return leg5;
	}
      
	public void setLeg5(JdbcTemplate leg5) {
		this.leg5 = leg5;
	}
     
	@Override
	public int create(Leg5 l) {
		// TODO Auto-generated method stub   
		return leg5.update("call crear_LEG5(?,?,?,?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getFecha(),l.getNombre_evento(),l.getHoras(),l.getCreditos(),l.getLugar(),l.getEstado(),l.getFecha_termino(),l.getTipo(),l.getUrl(),l.getInstitucion(),l.getDoce()); 
	}        

	@Override
	public int update(Leg5 l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg5 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllCyPOrganizaciondeEventos(int id) {
		// TODO Auto-generated method stub
		return leg5.queryForList("select l.ANIOS,l.FECHA,l.NOMBRE_EVENTO,i.NOMBRE_INSTITUCION,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5 l where l.INSTITUCION_IDINT=i.IDINT and l.TIPO='C y P OrgaEventos' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}

	@Override
	public List<Map<String, Object>> readAllCapacitacionenlaDocencia(int id) {
		// TODO Auto-generated method stub
		return leg5.queryForList("select l.ANIOS,l.FECHA,l.NOMBRE_EVENTO,i.NOMBRE_INSTITUCION,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5 l where l.INSTITUCION_IDINT=i.IDINT and l.TIPO='Capa en la Docencia' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}       

}
