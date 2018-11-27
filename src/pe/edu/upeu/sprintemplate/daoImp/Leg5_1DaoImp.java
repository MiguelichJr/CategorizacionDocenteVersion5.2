package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.internal.OracleTypes;
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
	public String create(Leg5_1 l) {
		String sql="crear_LEG5_1"; 
		SimpleJdbcCall jdbcCall= new SimpleJdbcCall(leg5_1).withCatalogName("PKG_LEGAJO").withProcedureName(sql);
		jdbcCall.addDeclaredParameter(new SqlParameter("anio2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("nombre2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("horas2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("creditos2",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("lugar2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("insti",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("doce",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("cateatrii",OracleTypes.INTEGER));
		jdbcCall.addDeclaredParameter(new SqlParameter("estado",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlParameter("tipo2",OracleTypes.VARCHAR)); 
		jdbcCall.addDeclaredParameter(new SqlParameter("url2",OracleTypes.VARCHAR));
		jdbcCall.addDeclaredParameter(new SqlOutParameter("lista", OracleTypes.VARCHAR));
		Map<String,Object> leg= jdbcCall.execute(l.getAnio(),l.getNombre_evento(),l.getHoras(),l.getCreditos(),l.getLugar(),l.getInstitucion(),l.getDoce(),l.getCateatributo(),l.getEstado(),l.getTipo(),l.getUrl()); 
		String resultado=(String) leg.get("lista");
		return resultado;  
		
		// TODO Auto-generated method stub
		//return leg5_1.update("call crear_LEG5_1(?,?,?,?,?,?,?,?,?,?,?)",l.getAnio(),l.getNombre_evento(),l.getHoras(),l.getCreditos(),l.getLugar(),l.getInstitucion(),l.getDoce(),l.getCateatributo(),l.getEstado(),l.getTipo(),l.getUrl());
	}  

	@Override
	public int update(Leg5_1 l) {
		int x = 0; 
		String sql = "update LEG5_1 set url=? where IDLG51=?"; 
		try {      
			leg5_1.update(sql, new Object[] { l.getUrl(),l.getIdlg5_1()}); 
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public int delete(Leg5_1 l) { 
		int x = 0; 
		String sql = "update LEG5_1 set estado=? where IDLG51=?"; 
		try {      
			leg5_1.update(sql, new Object[] { l.getEstado(),l.getIdlg5_1()}); 
			x = 1; 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public Leg5_1 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    
	@Override
	public List<Map<String, Object>> readAllCyPPonenciasCongresos(int id) {
		// TODO Auto-generated method stub
		return leg5_1.queryForList("select  l.IDLG51,l.ANIO ,a.nombre_atributo,l.NOMBRE_EVENTO,i.nombre_institucion,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5_1 l,ATRIBUTOS a where l.estado='completado' and l.INSTITUCION_IDINT=i.IDINT and l.CATEATRI=a.IDATRI and l.TIPO='Ponencia Congreso' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}

	@Override
	public List<Map<String, Object>> readAllCyPCapacitacionFormalCertificada(int id) {
		// TODO Auto-generated method stub  
		return leg5_1.queryForList("select l.IDLG51,l.ANIO ,a.nombre_atributo,l.NOMBRE_EVENTO,i.nombre_institucion,l.HORAS,l.CREDITOS,l.lugar,l.url from institucion i,leg5_1 l,ATRIBUTOS a where l.estado='completado' and l.INSTITUCION_IDINT=i.IDINT and l.CATEATRI=a.IDATRI and l.TIPO='Capa Formal Certifi' and  l.DOCE_POR_CONV_IDDOCON="+id);
	}
    
}
