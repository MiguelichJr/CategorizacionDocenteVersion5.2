package pe.edu.upeu.sprintemplate.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sprintemplate.entity.instrumento;


public interface instrumentoDao {
	int create(instrumento i);
	int update(instrumento i);
	int delete(int id);
	instrumento read(int id);
	List<instrumento> readAll();

}
