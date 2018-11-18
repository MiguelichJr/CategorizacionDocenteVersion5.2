package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg7Dao;
import pe.edu.upeu.sprintemplate.entity.Leg7;

public class Leg7DaoImp implements Leg7Dao{
	
	@Autowired
	private JdbcTemplate leg_extension;
	 
	
	
	public JdbcTemplate getLeg_extension() {
		return leg_extension;
	}

	public void setLeg_extension(JdbcTemplate leg_extension) {
		this.leg_extension = leg_extension;
	}

	@Override
	public int create(Leg7 l) {
		// TODO Auto-generated method stub 
		return leg_extension.update("call crear_LEG7_EXTN_CUL(?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getTitulo(),l.getPoblacion_onjetiva(),l.getLugar(),l.getNparticipantes(),l.getEstado(),l.getTipo(),l.getUrl(),l.getDocente());
	}   

	@Override
	public int update(Leg7 l) {
		// TODO Auto-generated method stub
		return 0;
	} 

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg7 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Override
	public List<Map<String, Object>> readAllLeg7ExtensionCultural(int id) {
		// TODO Auto-generated method stub
		return leg_extension.queryForList("select l.ANIO,l.TITULO,l.POBLACION_OBJETIVA,l.LUGAR,l.NPARTICIPANTES,l.ESTADO,l.TIPO,l.URL,l.DOCE_POR_CONV_IDDOCON  from leg7_extn_cul l where  l.DOCE_POR_CONV_IDDOCON="+id);
	}
}
