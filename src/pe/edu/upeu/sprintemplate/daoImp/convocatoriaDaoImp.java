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
import pe.edu.upeu.sprintemplate.dao.convocatoriaDao;
import pe.edu.upeu.sprintemplate.entity.Convocatoria;

public class convocatoriaDaoImp implements convocatoriaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Convocatoria c){
		int x=0;
		String sql="CREAR_CONVOCATORIA";

		try {
			SimpleJdbcCall jdbcCall=new SimpleJdbcCall(jdbcTemplate).withProcedureName(sql);
			jdbcCall.addDeclaredParameter(new SqlParameter("fecha_ini",OracleTypes.VARCHAR));
			jdbcCall.addDeclaredParameter(new SqlParameter("fecha_fin_a",OracleTypes.VARCHAR));
			jdbcCall.addDeclaredParameter(new SqlParameter("periodo",OracleTypes.VARCHAR));
			jdbcCall.addDeclaredParameter(new SqlParameter("nombre",OracleTypes.VARCHAR));
			jdbcCall.addDeclaredParameter(new SqlParameter("fecha_ini_recepcion_le",OracleTypes.VARCHAR));
			jdbcCall.addDeclaredParameter(new SqlParameter("fecha_fin_recep_lega",OracleTypes.VARCHAR));
			jdbcCall.addDeclaredParameter(new SqlOutParameter("salida",OracleTypes.VARCHAR));
			Map<String,Object> leg=jdbcCall.execute(c.getFecha_inicio(),c.getFecha_fin(),c.getPerido(),c.getNombre(),c.getFecha_inici_legajo(),c.getFecha_fin_legajo());
			String reultado=(String)leg.get("salida");
			System.out.println(reultado);
			if(reultado==null) {
				System.out.println("No se guardo");
			}else{
				System.out.println("Este re registro");
				x=1;
			}
			System.out.println("Este re registro" +x);
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
			x=2;
		}
		System.out.println(x);
		return x;		
	}

	@Override
	public boolean busExisteExpediente(Convocatoria c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Convocatoria> read() {
		String sql="SELECT * FROM CONVOCATORIA order by idcnvo";
		return this.jdbcTemplate.query(sql, new convocatoriaRowMapper());
	}

	@Override
	public List<Convocatoria> readid() {
		String sql="select * from convocatoria  where ESTADO=1";
		return this.jdbcTemplate.query(sql, new convocatoriaRowMapper());
	}

	@Override
	public List<Convocatoria> mostrarTodo() {
		String sql="select * from convocatoria order by idcnvo";
		return this.jdbcTemplate.query(sql, new convocatoriaRowMapper());
	}

	
}
