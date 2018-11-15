package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sprintemplate.dao.Leg3Dao;
import pe.edu.upeu.sprintemplate.entity.Leg3;
@Repository
public class Leg3DaoImp implements Leg3Dao {
    
	@Autowired
	private JdbcTemplate leg3;   
	                      
	
	public JdbcTemplate getLeg3() {
		return leg3;
	}

	public void setLeg3(JdbcTemplate leg3) {
		this.leg3 = leg3;
	}

	@Override
	public int create(Leg3 l) {
		// TODO Auto-generated method stub
		return leg3.update("call crear_LEG33(?,?,?,?,?,?,?,?,?,?,?,?)",l.getFecha_inicio(),l.getFecha_termino(),l.getAnios(),l.getMeses(),l.getDias(),l.getLugar(),l.getCargo(),l.getEstado(),l.getTpo(),l.getUrl(),l.getInstitucion(),l.getDoce());
	}       
         
	@Override
	public int update(Leg3 l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg3 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	  
	@Override
	public List<Map<String, Object>> readAllEDUEnComplementarias(int id) {
		// TODO Auto-generated method stub         
		return leg3.queryForList("select i.nombre_institucion,L.CARGO,l.fecha_inicio,l.fecha_termino,l.lugar,l.url from institucion i,leg3 l where l.INSTITUCION_IDINT=i.IDINT and l.TPO='EDU en Complementaria' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}
    
	@Override  
	public List<Map<String, Object>> readAllEDUEnEntornosVirtuales(int id) {
		// TODO Auto-generated method stub
		return leg3.queryForList("select i.nombre_institucion,l.fecha_inicio,l.fecha_termino,l.anios,l.meses,l.dias,l.lugar,l.url from institucion i,leg3 l where l.INSTITUCION_IDINT=i.IDINT and l.TPO='EDU en Entornos Virtuales' and  l.DOCE_POR_CONV_IDDOCON="+id); 
	}

}
