package pe.edu.upeu.sprintemplate.controller;



import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.sprintemplate.dao.Leg2Dao;
import pe.edu.upeu.sprintemplate.dao.Leg3Dao;
import pe.edu.upeu.sprintemplate.dao.LegDao;
import pe.edu.upeu.sprintemplate.daoImp.CategoriaDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.EspecialidadDaoImp;  
import pe.edu.upeu.sprintemplate.daoImp.GradosDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.InstitucionDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg2DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg3DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.LegDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_Grados_TitulosDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.TipoAtributoDaoImp;
import pe.edu.upeu.sprintemplate.entity.Leg;
import pe.edu.upeu.sprintemplate.entity.Leg2;
import pe.edu.upeu.sprintemplate.entity.Leg3;
import pe.edu.upeu.sprintemplate.entity.Leg_Grados_Titulos;
import pe.edu.upeu.sprintemplate.entity.Usuario; 
  
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
	@Autowired
	private Leg_Grados_TitulosDaoImp leggradosDao;
	@Autowired                
	private LegDao legDao;
	@Autowired
	private Leg2DaoImp leg2Dao; 
	@Autowired
	private Leg3DaoImp leg3Dao;                   
	         
  
	//recuerda que los nombres de las clases tiene que ser iguales a las del beans
	
	
	
	//      
	
	
	@GetMapping("/")
	public String index() {
		return "index";     
	}
	

	//metodo del login
	/*@PostMapping("/")
	public String main2() {
		return "main";
	}*/  
	//metodo del login
	 
	/*
	@PostMapping("/validar")  
	public String ValidarUsuario(HttpServletRequest HttpServletRequest,Usuario user) {
		HttpSession httpSession = HttpServletRequest.getSession();
		ModelAndView a= new ModelAndView();
		try {
			
		}catch(Exception e){
			  
		}
		return "main";
	}
	*/    
	/*
	@PostMapping("/crearLegGrados")
	public String crearLegGrados2(Model model, Leg_Grados_Titulos l) throws SQLException {
		l.setEstado("completado");
		l.setDocente(1);  
		System.out.println(l.toString());
		leggradosDao.create(l);              
		//usp.create(user);
		return "redirect:/gra";        
	} 
	
	@PostMapping("/crearLegExperienciaProfe")
	public String crearLegExperienciaProfe2(Model model, Leg l) throws SQLException {
		l.setEstado("completado");
		l.setDocente(1);    
		l.setTipo("E. profesional");        
		System.out.println(l.toString());
		legDao.create(l);  
		return "redirect:/gra";        
	}
	 
	@PostMapping("/crearLegExperienciaAcademicoAdnimin")
	public String crearLegAcademicoAdministrativa(Model model, Leg l) throws SQLException {
		l.setEstado("completado");
		l.setDocente(1);      
		l.setTipo("E. AcademicoAdministrativa");        
		System.out.println(l.toString());
		legDao.create(l);     
		return "redirect:/gra";        
	}
	                  
   */ 
	
@RequestMapping(path="/guardar_grados_titulos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void crearGradosEstudios(HttpServletRequest request) {
	int g=Integer.parseInt(request.getParameter("g"));
	int e=Integer.parseInt(request.getParameter("e"));
	int i=Integer.parseInt(request.getParameter("i"));
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String ft=request.getParameter("ft");
	String u1=request.getParameter("u1");
	String t=request.getParameter("t");
	String u2=request.getParameter("u2");
	String es="completado"; 
	System.out.println("si trajo el id en el metodo crear: " + idprofesor);
	//int d=1;  
	Leg_Grados_Titulos lg=new Leg_Grados_Titulos(ft,es,t,u1,u2,i,g,e,idprofesor);
	leggradosDao.create(lg); 
	   	
}   
      
@RequestMapping(path="/listarLeg_Grados", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarLeg_Grado(HttpServletRequest request) {
	Gson g = new Gson();
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor);
	return g.toJson(leggradosDao.readAll(idprofesor));
}
	





 


@RequestMapping(path="/guardar_experiencia_profesional", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_experiencia_profesional2(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	String c=request.getParameter("c");
	int td=Integer.parseInt(request.getParameter("td"));
	String fi=request.getParameter("fi");
	String ft=request.getParameter("ft");
	int a=Integer.parseInt(request.getParameter("a"));
	int m=Integer.parseInt(request.getParameter("m"));
	int d=Integer.parseInt(request.getParameter("d"));
	String l=request.getParameter("l");
	String a2=request.getParameter("a2");
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	System.out.println(i);
	System.out.println(c);
	System.out.println(td);
	System.out.println(fi);
	System.out.println(ft);
	System.out.println(a);
	  
	String es="completado";
	String tipo="E. profesional";  
	System.out.println("si trajo el id: " + idprofesor+" pjajajajaj");
	//int d=1;       
	Leg lg=new Leg(c,fi,ft,a,m,d,l,es,a2,i,idprofesor,tipo,td);
	legDao.create(lg);  
	                  
} 
   

@RequestMapping(path="/listarExProfe", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarExperienciaProfesional2(HttpServletRequest request) {
	Gson g = new Gson();
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor);
	return g.toJson(legDao.readAllExperienciaProfesional(idprofesor));
}  
	











   
@RequestMapping(path="/guardar_experiencia_academico", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_experiencia_academico2(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	String c=request.getParameter("c");
	int r=Integer.parseInt(request.getParameter("r"));
	String fi=request.getParameter("fi");
	String ft=request.getParameter("ft");   
	String re=request.getParameter("re");
	String l=request.getParameter("l"); 
	String u3=request.getParameter("u3");   
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";
	String tipo="E. AcademicoAdministrativa";   
	System.out.println("si trajo el id: " + idprofesor+"pes owen jajajajaj xd");
	//int d=1;
	Leg lg=new Leg(c,fi,ft,l,re,es,u3,i,idprofesor,tipo,r); 
	legDao.create(lg);
	//return "si trajo el id: " + idprofesor+" en el metodo que devuelve guardar_expe";   
	   	  
} 


//listarExperienciaAcademico
	
@RequestMapping(path="/listarExperienciaAcademico", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarExperienciaAcademico2(HttpServletRequest request) {
	Gson g = new Gson();
	
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar experiencia academico");              
	return g.toJson(legDao.readAllExperienciaAcademicoAdministrativa(idprofesor));
}
	
	
	




//guardar_categoriadocente
	

@RequestMapping(path="/guardar_categoriadocente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_categoriadocente2(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	int c=Integer.parseInt(request.getParameter("c"));
	String fi=request.getParameter("fi");
	String ft=request.getParameter("ft");
	int a=Integer.parseInt(request.getParameter("a"));
	int m=Integer.parseInt(request.getParameter("m"));
	int d=Integer.parseInt(request.getParameter("d"));
	String l=request.getParameter("l"); 
	String u4=request.getParameter("u4"); 
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";  
	String tipo="Cate Docente";              
	System.out.println("si trajo el id: " + idprofesor+"pes owen jajajajaj xd");
	//int d=1;
	System.out.println(i);
	System.out.println(c);
	System.out.println(fi);
	System.out.println(ft);         
	Leg2 lgg=new Leg2(fi,ft,a,m,d,l,es,tipo,u4,c,i,idprofesor);
	leg2Dao.create(lgg);    
	//leg2Dao.create(lg);                            
	      	  
}
//listarCategoriaDocente

@RequestMapping(path="/listarCategoriaDoo", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarCategoriaDoo2(HttpServletRequest request) {
	Gson g = new Gson();
	
	
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar categoria docente");              
	return g.toJson(leg2Dao.readAllCategoriaDocente(idprofesor));   
}
	
		
	
	
	     
	
// tabla  ED  En presenciales

@RequestMapping(path="/guardar_EDrpesenciales", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_EDrpesenciales2(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	int c=Integer.parseInt(request.getParameter("c"));
	String fi=request.getParameter("fi");      
	String ft=request.getParameter("ft");
	int a=Integer.parseInt(request.getParameter("a"));
	int m=Integer.parseInt(request.getParameter("m"));
	int d=Integer.parseInt(request.getParameter("d"));
	String l=request.getParameter("l"); 
	String u4=request.getParameter("u4"); 
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";  
	String tipo="EDU en Presencial";                
	System.out.println("si trajo el id: " + idprofesor+"pes owen presenciales jajajajaj xd");
	//int d=1;
	System.out.println(i);
	System.out.println(c);
	System.out.println(fi);   
	System.out.println(ft);         
	Leg2 lgg=new Leg2(fi,ft,a,m,d,l,es,tipo,u4,c,i,idprofesor);
	leg2Dao.create(lgg);           
	//leg2Dao.create(lg);                            
	      	  
}  
	
@RequestMapping(path="/listarpresen", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarpresen2(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en presenciales");                 
	return g.toJson(leg2Dao.readAllCategoriaDocente(idprofesor));   
}	   

	
	
	
// tabla Ed en Entornos Virtuales   

@RequestMapping(path="/guardar_EDentornosVirtuales", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_EDentornosVirtuales2(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	String fi=request.getParameter("fi");      
	String ft=request.getParameter("ft");
	int a=Integer.parseInt(request.getParameter("a"));
	int m=Integer.parseInt(request.getParameter("m"));
	int d=Integer.parseInt(request.getParameter("d"));
	String l=request.getParameter("l"); 
	String u4=request.getParameter("u4"); 
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";  
	String tipo="EDU en Entornos Virtuales";                
	System.out.println("si trajo el id: " + idprofesor+"pes owen entornos virtuales jajajajaj xd");
	//int d=1;
	System.out.println(i);
	System.out.println(fi);     
	System.out.println(ft);         
	Leg3 lgg=new Leg3(fi,ft,a,m,d,l,es,tipo,u4,i,idprofesor);
	leg3Dao.create(lgg);                            
	//leg2Dao.create(lg);                            
	      	  
} 

@RequestMapping(path="/listarvirtuales", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarvirtuales2(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en entornos virtuales");                    
	return g.toJson(leg3Dao.readAllEDUEnEntornosVirtuales(idprofesor));   
}
	



// tabla docente complementaria

   
@RequestMapping(path="/guardar_Docentecomplementaria", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_Docentecomplementaria2(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	String c=request.getParameter("c");   
	String fi=request.getParameter("fi");      
	String ft=request.getParameter("ft");  
	String l=request.getParameter("l"); 
	String u4=request.getParameter("u4"); 
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";    
	String tipo="EDU en Complementaria";                  
	System.out.println("si trajo el id: " + idprofesor+"pes owen en complemenataria jajajajaj xd");
	//int d=1;
	System.out.println(i);
	System.out.println(fi);     
	System.out.println(ft);                   
	Leg3 lgd=new Leg3(fi,ft,l,c,es,tipo,u4,i,idprofesor);
	leg3Dao.create(lgd);                                 
	//leg2Dao.create(lg);                            
	      	     
} 

@RequestMapping(path="/listarcomplementaria", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarcomplementaria3(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en docente complementaria");                    
	return g.toJson(leg3Dao.readAllEDUEnComplementarias(idprofesor));   
}   
 






















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//para llevar datos a las vista de los selects 

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
		gi.addObject("lista_especialidad",especialidadDao.readAll());
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
