package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
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
	public String create(Leg_Publi l) {
		String sql="crear_LEG_PUBLI";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg_publi).withCatalogName("PKG_LEGAJO").withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("ano2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("nombre2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("nombremedio",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("editorial2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("isbn2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("nupagi",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("lugar2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("estado2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("tipo2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("cate",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));   
		Map<String,Object> leg= jdbcCall.execute(l.getAnio(),l.getNombre_publicacion(),l.getNombre_mediodecomunicacion(),l.getEditorial(),l.getIsbn(),l.getNupaginas(),l.getLugar(),l.getEstado(),l.getTipo(),l.getUrl(),l.getDoce(),l.getCatatributo()); 
		String resultado=(String) leg.get("lista");
		return resultado; 
		// TODO Auto-generated method stub
		//return leg_publi.update("call crear_LEG_PUBLI(?,?,?,?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getNombre_publicacion(),l.getNombre_mediodecomunicacion(),l.getEditorial(),l.getIsbn(),l.getNupaginas(),l.getLugar(),l.getEstado(),l.getTipo(),l.getUrl(),l.getDoce(),l.getCatatributo());
	}    

	@Override
	public int update(Leg_Publi l) {
		int x = 0;    
		String sql = "update LEG_PUBLI set url=? where IDPUB=?";      
		try {    
			leg_publi.update(sql, new Object[] { l.getUrl(),l.getIdpublicacion()}); 
			x = 1;      
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public int delete(Leg_Publi l) {
		int x = 0;    
		String sql = "update LEG_PUBLI set estado=? where IDPUB=?";      
		try {      
			leg_publi.update(sql, new Object[] { l.getEstado(),l.getIdpublicacion()}); 
			x = 1;          
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x; 
	}

	@Override
	public Leg_Publi read(int id) {    
		// TODO Auto-generated method stub
		return null;
	}  
       
	@Override   
	public List<Map<String, Object>> readAllLeg_Publi_Articulos(int id) {
		// TODO Auto-generated method stub
		return leg_publi.queryForList("select l.IDPUB,l.ANIO_PUBLICACION,a.NOMBRE_ATRIBUTO,l.NOMBRE_PUBLICACION,l.NOMBRE_MEDIO_COMUNICACION,"
				+ "l.EDITORIAL,l.ISBN,l.NPAGINAS,l.LUGAR,l.TIPO,l.URL from leg_publi l, atributos a where "
				+ "l.CATEATRI=a.IDATRI and l.TIPO='ARTICULOS' and l.estado='completado' "
				+ "and l.DOCE_POR_CONV_IDDOCON="+id);
	}
     
	@Override
	public List<Map<String, Object>> readAllLeg_Publi_Libros(int id) {
		// TODO Auto-generated method stub        
		return leg_publi.queryForList("select l.IDPUB,l.ANIO_PUBLICACION,a.NOMBRE_ATRIBUTO,l.NOMBRE_PUBLICACION,l.NOMBRE_MEDIO_COMUNICACION,"
				+ "l.EDITORIAL,l.ISBN,l.NPAGINAS,l.LUGAR,l.TIPO,l.URL from leg_publi l, atributos a where "
				+ "l.CATEATRI=a.IDATRI and l.TIPO='LIBROS' and l.estado='completado' "
				+ "and l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
