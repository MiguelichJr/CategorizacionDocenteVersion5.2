package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg_Asesora_TesisDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Asesora_Tesis;

public class Leg_Asesora_Tesis_DaoImp implements Leg_Asesora_TesisDao {
	
	@Autowired
	private JdbcTemplate leg_tesis;
	
	
	public JdbcTemplate getLeg_tesis() {
		return leg_tesis;
	}  

	public void setLeg_tesis(JdbcTemplate leg_tesis) {
		this.leg_tesis = leg_tesis;
	}

	@Override  
	public int create(Leg_Asesora_Tesis l) {
		// TODO Auto-generated method stub
		return leg_tesis.update("call crear_LEG_ASETESIS(?,?,?,?,?,?,?,?,?,?)",l.getAnio_1(),l.getTitulo(),l.getAutor(),l.getAnio_2(),l.getResolucion(),l.getEstado(),l.getUrl(),l.getEspecialidad(),l.getDoce(),l.getCategoria_atributo()); 
	}

	@Override
	public int update(Leg_Asesora_Tesis l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg_Asesora_Tesis read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Override
	public List<Map<String, Object>> readAllLegAsesoraTesisss(int id) {
		// TODO Auto-generated method stub
		return leg_tesis.queryForList("select l.ANIO,l.TITULO,l.AUTOR,l.ANIO_1,l.RESOLUCION,l.ESTADO,l.URL,e.NOMBRE_ESPECIALIDAD,l.DOCE_POR_CONV_IDDOCON,a.NOMBRE_ATRIBUTO from leg_asetesis l,ATRIBUTOS a, ESPECIALIDAD e where l.ESPECIALIDAD_IDESPC=e.IDESPC and l.CAATRI=a.IDATRI and l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
