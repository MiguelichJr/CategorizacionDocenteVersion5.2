package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.docente_convocatoria;


public interface docente_convocatoriaDao {
	int create(docente_convocatoria dc);
	boolean busExisteExpediente(docente_convocatoria dc);
	List<docente_convocatoria> read();
	List<docente_convocatoria> readid(int id);
	List<Map<String,Object>> readl();
	int delete(int id);


}
