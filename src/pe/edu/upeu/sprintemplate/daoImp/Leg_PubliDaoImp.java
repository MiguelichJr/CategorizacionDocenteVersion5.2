package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.Leg_PubliDao;
import pe.edu.upeu.sprintemplate.entity.Leg_Publi;

public class Leg_PubliDaoImp implements Leg_PubliDao {
	
	@Autowired
	private JdbcTemplate leg_publi; 
	

	public JdbcTemplate getLeg_publi() {
		return leg_publi;
	} 

	public void setLeg_publi(JdbcTemplate leg_publi) {
		this.leg_publi = leg_publi;
	}

	@Override
	public int create(Leg_Publi l) {
		// TODO Auto-generated method stub
		return leg_publi.update("call crear_LEG_PUBLI(?,?,?,?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getNombre_publicacion(),l.getNombre_mediodecomunicacion(),l.getEditorial(),l.getIsbn(),l.getNupaginas(),l.getLugar(),l.getEstado(),l.getTipo(),l.getUrl(),l.getDoce(),l.getCatatributo());
	}    

	@Override
	public int update(Leg_Publi l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Leg_Publi read(int id) {
		// TODO Auto-generated method stub
		return null;
	}  
       
	@Override
	public List<Map<String, Object>> readAllLeg_Publi_Articulos(int id) {
		// TODO Auto-generated method stub
		return leg_publi.queryForList("select l.ANIO_PUBLICACION,a.NOMBRE_ATRIBUTO,l.NOMBRE_PUBLICACION,l.NOMBRE_MEDIO_COMUNICACION,l.EDITORIAL,l.ISBN,l.NPAGINAS,l.LUGAR,l.TIPO from leg_publi l, atributos a where l.CATEATRI=a.IDATRI and l.TIPO='ARTICULOS' and l.DOCE_POR_CONV_IDDOCON="+id);
	}

	@Override
	public List<Map<String, Object>> readAllLeg_Publi_Libros(int id) {
		// TODO Auto-generated method stub
		return leg_publi.queryForList("select l.ANIO_PUBLICACION,a.NOMBRE_ATRIBUTO,l.NOMBRE_PUBLICACION,l.NOMBRE_MEDIO_COMUNICACION,l.EDITORIAL,l.ISBN,l.NPAGINAS,l.LUGAR,l.TIPO from leg_publi l, atributos a where l.CATEATRI=a.IDATRI and l.TIPO='LIBROS' and l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
