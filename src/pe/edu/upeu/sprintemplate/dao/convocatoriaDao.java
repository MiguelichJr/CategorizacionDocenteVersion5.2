package pe.edu.upeu.sprintemplate.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.sprintemplate.entity.Convocatoria;

public interface convocatoriaDao {
	int create(Convocatoria c);
	boolean busExisteExpediente(Convocatoria c);
	List<Convocatoria> read();
	List<Convocatoria> readid();
	List<Convocatoria> mostrarTodo();
}
