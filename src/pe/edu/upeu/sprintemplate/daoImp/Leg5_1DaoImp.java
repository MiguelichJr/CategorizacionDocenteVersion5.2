package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg5_1Dao;
import pe.edu.upeu.sprintemplate.entity.Leg5_1;

public class Leg5_1DaoImp implements Leg5_1Dao {
    
	@Autowired
	private JdbcTemplate leg5_1; 
	
	
	
	public JdbcTemplate getLeg5_1() {
		return leg5_1;
	}

	public void setLeg5_1(JdbcTemplate leg5_1) {
		this.leg5_1 = leg5_1;
	}
        
	@Override
	public int create(Leg5_1 l) {
		// TODO Auto-generated method stub
		return leg5_1.update("call crear_LEG5_1(?,?,?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getNombre_evento(),l.getHoras(),l.getCreditos(),l.getLugar(),l.getInstitucion(),l.getDoce(),l.getCateatributo(),l.getEstado(),l.getTipo(),l.getUrl());
	} 

	@Override
	public int update(Leg5_1 l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg5_1 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    
	@Override
	public List<Map<String, Object>> readAllCyPPonenciasCongresos(int id) {
		// TODO Auto-generated method stub
		return leg5_1.queryForList("select l.ANIO ,a.nombre_atributo,l.NOMBRE_EVENTO,i.nombre_institucion,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5_1 l,ATRIBUTOS a where l.INSTITUCION_IDINT=i.IDINT and l.CATEATRI=a.IDATRI and l.TIPO='Ponencia Congreso' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}

	@Override
	public List<Map<String, Object>> readAllCyPCapacitacionFormalCertificada(int id) {
		// TODO Auto-generated method stub  
		return leg5_1.queryForList("select l.ANIO ,a.nombre_atributo,l.NOMBRE_EVENTO,i.nombre_institucion,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5_1 l,ATRIBUTOS a where l.INSTITUCION_IDINT=i.IDINT and l.CATEATRI=a.IDATRI and l.TIPO='Capa Formal Certifi' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
