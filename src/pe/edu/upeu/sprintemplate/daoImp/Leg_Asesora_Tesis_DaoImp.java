package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
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
	public String create(Leg_Asesora_Tesis l) { 
		String sql="crear_LEG_ASETESIS";
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg_tesis).withCatalogName("PKG_LEGAJO").withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("anio2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("nombre2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("autor",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("anio_3",OracleTypes.INTEGER));  
		jdbcCall.addDeclaredParameter(new SqlParameter("reso",OracleTypes.VARCHAR)); 
		jdbcCall.addDeclaredParameter(new SqlParameter("esta",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("espe",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("cate",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));   
		Map<String,Object> leg= jdbcCall.execute(l.getAnio_1(),l.getTitulo(),l.getAutor(),l.getAnio_2(),l.getResolucion(),l.getEstado(),l.getUrl(),l.getEspecialidad(),l.getDoce(),l.getCategoria_atributo()); 
		String resultado=(String) leg.get("lista");
		return resultado;  
		// TODO Auto-generated method stub
		//return leg_tesis.update("call crear_LEG_ASETESIS(?,?,?,?,?,?,?,?,?,?)",l.getAnio_1(),l.getTitulo(),l.getAutor(),l.getAnio_2(),l.getResolucion(),l.getEstado(),l.getUrl(),l.getEspecialidad(),l.getDoce(),l.getCategoria_atributo()); 
	}

	@Override
	public int update(Leg_Asesora_Tesis l) {
		int x = 0;   
		String sql = "update LEG_ASETESIS set url=? where IDLGTESIS=?";
		try {         
			leg_tesis.update(sql, new Object[] { l.getUrl(),l.getIdlegtesis()}); 
			x = 1;     
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	} 

	@Override
	public int delete(Leg_Asesora_Tesis l) {  
		int x = 0;    
		String sql = "update LEG_ASETESIS set estado=? where IDLGTESIS=?";
		try {          
			leg_tesis.update(sql, new Object[] { l.getEstado(),l.getIdlegtesis()}); 
			x = 1;     
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x; 
	}

	@Override 
	public Leg_Asesora_Tesis read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
      
	@Override 
	public List<Map<String, Object>> readAllLegAsesoraTesisss(int id) {
		// TODO Auto-generated method stub
		return leg_tesis.queryForList("select l.IDLGTESIS,l.ANIO,l.TITULO,l.AUTOR,l.ANIO_1,l.RESOLUCION,l.ESTADO,l.URL,e.NOMBRE_ESPECIALIDAD,"
				+ "l.DOCE_POR_CONV_IDDOCON,a.NOMBRE_ATRIBUTO from leg_asetesis l,ATRIBUTOS a, ESPECIALIDAD e where "
				+ "l.ESPECIALIDAD_IDESPC=e.IDESPC and l.estado='completado' "  
				+ "and l.CAATRI=a.IDATRI and l.DOCE_POR_CONV_IDDOCON="+id);
	}

}
