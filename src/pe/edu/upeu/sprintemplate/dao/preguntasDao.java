package pe.edu.upeu.sprintemplate.dao;

import java.util.List;

import pe.edu.upeu.sprintemplate.entity.preguntas;

public interface preguntasDao {
	int create (preguntas t);
	int update (preguntas t);
	int delete(int id);
	preguntas read(int id);
	List<preguntas> readlist(int id);

}
