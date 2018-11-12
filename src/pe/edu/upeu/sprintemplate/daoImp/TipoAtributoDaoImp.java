package pe.edu.upeu.sprintemplate.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.sprintemplate.dao.TipoAtributoDao;

public class TipoAtributoDaoImp implements TipoAtributoDao {
	
	@Autowired
	private JdbcTemplate jta;
	

	public JdbcTemplate getJta() {
		return jta;
	}

	public void setJta(JdbcTemplate jta) {
		this.jta = jta;
	}
      
	@Override
	public List<Map<String, Object>> readAll_tipodedicacion() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=1");
	}

	@Override
	public List<Map<String, Object>> readAll_tipoidioma() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=2");
	}
             
	@Override
	public List<Map<String, Object>> readAll_nivelidioma() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=3");
	}
  
	@Override
	public List<Map<String, Object>> readAll_dominioidioma() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=4");
	}
     
	@Override
	public List<Map<String, Object>> readAll_tipocurso() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=9");
	}  

	@Override
	public List<Map<String, Object>> readAll_modalidadeducativa() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=10");
	}

	@Override
	public List<Map<String, Object>> readAll_tipoponencia() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=11");     
	}

	@Override
	public List<Map<String, Object>> readAll_tipocapacitacion() {
		// TODO Auto-generated method stub
		return jta.queryForList("SELECT * FROM ATRIBUTOS WHERE CATE_ATRI_IDCAATRI=8");  
	}
	
}
