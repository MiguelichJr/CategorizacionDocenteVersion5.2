package pe.edu.upeu.sprintemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.sprintemplate.daoImp.CategoriaDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.EspecialidadDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.GradosDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.InstitucionDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.TipoAtributoDaoImp;
  
//import pe.edu.upeu.sprintemplate.daoImp.EspecialidadDaoImp;
//import pe.edu.upeu.sprintemplate.daoImp.GradosDaoImp;
//import pe.edu.upeu.sprintemplate.daoImp.InstitucionDaoImp;    

@Controller            
public class HomeControllerExpediente {
	   
	@Autowired
	private GradosDaoImp gradoDao;
	@Autowired  
	private EspecialidadDaoImp especialidadDao;
	@Autowired
	private InstitucionDaoImp institucionDao;
	@Autowired
	private TipoAtributoDaoImp tipoatributoDao;
	@Autowired
	private CategoriaDaoImp categoriaDao;
	  
	//recuerda que los nombres de las clases tiene que ser iguales a las del beans
	
	@GetMapping("/")
	public String index() {
		return "index";     
	}

	@PostMapping("/home")
	public String main1() {
		return "main";
	}

	@GetMapping("/home")
	public String main2() {
		return "main";
	}

	@GetMapping("/actua")
	public ModelAndView actualizacion() {
		ModelAndView c= new ModelAndView();
		c.setViewName("Legajo_actua");
		c.addObject("lista_institucion",institucionDao.readAll());
		c.addObject("lista_tipoponencia",tipoatributoDao.readAll_tipoponencia());
		c.addObject("lista_tipocapacitacion",tipoatributoDao.readAll_tipocapacitacion());
		return c;    
	}

	@GetMapping("/docpersonal")
	public String dospersonall() {

		return "Legajo_docpersonal";
	}

	 
	@GetMapping("/gra")
	public ModelAndView gradosytitulos() {
		ModelAndView grad= new ModelAndView();
		grad.setViewName("Legajo_gradostitulos");  
		grad.addObject("lista_grados",gradoDao.readAll());
		grad.addObject("lista_institucion",institucionDao.readAll());
		grad.addObject("lista_especialidad",especialidadDao.readAll());
		grad.addObject("lista_tipodedicacion",tipoatributoDao.readAll_tipodedicacion()); 
		grad.addObject("lista_tipoidioma",tipoatributoDao.readAll_tipoidioma()); 
		grad.addObject("lista_nivelidioma",tipoatributoDao.readAll_nivelidioma()); 
		grad.addObject("lista_dominioidioma",tipoatributoDao.readAll_dominioidioma());
		grad.addObject("lista_tipocurso",tipoatributoDao.readAll_tipocurso());  
		grad.addObject("lista_tipomodalidadeducativa",tipoatributoDao.readAll_modalidadeducativa());
		grad.addObject("lista_tipocategoria",categoriaDao.readAll());   
		//categoriaDao
		return grad;     
	}   
	@GetMapping("/investi")
	public ModelAndView investigaciones() {
		ModelAndView gi= new ModelAndView();       
		gi.setViewName("Legajo_investigacion");     
		gi.addObject("lista_tipopublicaciones",tipoatributoDao.readAll_tipopublicaciones());
		gi.addObject("lista_tipopublicaciones_espe",tipoatributoDao.readAll_tipopublicaciones_espe());
		gi.addObject("lista_nivelasesoria",tipoatributoDao.readAll_nivelasesoria()); 
		return gi; 
	}
   
	@GetMapping("/exten")
	public ModelAndView extensiones123() {
		ModelAndView gg= new ModelAndView();
		gg.setViewName("Legajo_extension");      
		gg.addObject("lista_institucion",institucionDao.readAll());
		return gg; 
	}

	@GetMapping("/filo")
	public String filsofia123() {

		return "Legajo_filosofia";
	}

	@GetMapping("/ex")
	public String extra123() {

		return "Legajo_extra";
	}

	@GetMapping("/auto")
	public String auto123() {

		return "Legajo_autoevaluacion";
	}

}
