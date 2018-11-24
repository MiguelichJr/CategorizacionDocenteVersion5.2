package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
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
	public String create(Leg5 l) {
		// TODO Auto-generated method stub   
		//return leg5.update("call crear_LEG5(?,?,?,?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getFecha(),l.getNombre_evento(),l.getHoras(),l.getCreditos(),l.getLugar(),l.getEstado(),l.getFecha_termino(),l.getTipo(),l.getUrl(),l.getInstitucion(),l.getDoce()); 
		String sql="crear_LEG5";  
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg5).withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("an2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("fecha2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("nombre2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("horas2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("creditos2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("lugar2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("estado2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("fechatermino2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("tipo2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR)); 
		jdbcCall.addDeclaredParameter(new SqlParameter("insti",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));
		Map<String,Object> leg= jdbcCall.execute(l.getAnio(),l.getFecha(),l.getNombre_evento(),l.getHoras(),l.getCreditos(),l.getLugar(),l.getEstado(),l.getFecha_termino(),l.getTipo(),l.getUrl(),l.getInstitucion(),l.getDoce()); 
		String resultado=(String) leg.get("lista");
		return resultado;   
	}        
  
	@Override
	public int update(Leg5 l) {
		int x = 0;    
		String sql = "update LEG5 set url=? where IDLG5=?";
		try {   
			leg5.update(sql, new Object[] { l.getUrl(),l.getIdlg5()}); 
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
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
		return leg5.queryForList("select l.ANIOS,l.FECHA,l.NOMBRE_EVENTO,i.NOMBRE_INSTITUCION,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5 l where l.estado='completado' and l.INSTITUCION_IDINT=i.IDINT and l.TIPO='C y P OrgaEventos' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}
 
	@Override
	public List<Map<String, Object>> readAllCapacitacionenlaDocencia(int id) {
		// TODO Auto-generated method stub
		return leg5.queryForList("select l.ANIOS,l.FECHA,l.NOMBRE_EVENTO,i.NOMBRE_INSTITUCION,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5 l where l.estado='completado' and l.INSTITUCION_IDINT=i.IDINT and l.TIPO='Capa en la Docencia' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}       

}
