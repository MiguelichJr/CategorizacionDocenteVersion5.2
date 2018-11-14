package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg2Dao;
import pe.edu.upeu.sprintemplate.entity.Leg2;

public class Leg2DaoImp implements Leg2Dao {
	
	@Autowired
	private JdbcTemplate jleg2;
	   
	@Override
	public int create(Leg2 l) {
		// TODO Auto-generated method stub
		return jleg2.update("call crear_LEG2(?,?,?,?,?,?,?,?,?,?,?,?)",l.getFecha_inicio(),l.getFecha_termino(),l.getAnios(),l.getMeses(),l.getDias(),l.getLugar(),l.getEstado(),l.getTipo(),l.getUrl(),l.getCategoria(),l.getInstitucion(),l.getDocente());
	} 

	@Override
	public int update(Leg2 l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg2 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
        
	@Override
	public List<Map<String, Object>> readAllCategoriaDocente(int id) {
		// TODO Auto-generated method stub
		return jleg2.queryForList("select i.nombre_institucion,c.nombre_categoria,l.fecha_inicio,l.fecha_termino,l.anios,l.meses,l.dias,l.lugar,l.url from institucion i,LEG2 l,CATEGORIA c where l.INSTITUCION_IDINT=i.IDINT and l.CATEGORIA_IDCATE=c.IDCATE and l.TIPO='Cate Docente' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}  
  
	@Override
	public List<Map<String, Object>> readAllExpeDocen_EnPresencial(int id) {
		// TODO Auto-generated method stub
		return jleg2.queryForList("select i.nombre_institucion,c.nombre_categoria,l.fecha_inicio,l.fecha_termino,l.anios,l.meses,l.dias,l.lugar,l.url from institucion i,LEG2 l,CATEGORIA c where l.INSTITUCION_IDINT=i.IDINT and l.CATEGORIA_IDCATE=c.IDCATE and l.TIPO='EDU en Presencial' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}  

}
