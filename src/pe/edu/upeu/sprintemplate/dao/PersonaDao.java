package pe.edu.upeu.sprintemplate.dao;

import java.util.List;

import pe.edu.upeu.sprintemplate.entity.Persona;

public interface PersonaDao {
	List<Persona> read();
	List<Persona> buscarDocenEvalua();
	List<Persona> buscarCondocen();

}
