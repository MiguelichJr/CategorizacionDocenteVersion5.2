package pe.edu.upeu.sprintemplate.dao;

import java.util.List;

import pe.edu.upeu.sprintemplate.entity.secciones;

public interface seccionesDao {
	int create (secciones s);
	int update(secciones s);
	int delete(int id);
	secciones read(int id);
	List<secciones> readl(int id);

}
