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
import pe.edu.upeu.sprintemplate.dao.Leg_FiloDao;
import pe.edu.upeu.sprintemplate.daoImp.CategoriaDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.EspecialidadDaoImp;  
import pe.edu.upeu.sprintemplate.daoImp.GradosDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.InstitucionDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg2DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg3DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg4DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg5DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg5_1DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg7DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.LegDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_Asesora_Tesis_DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_Grados_TitulosDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_InvestiDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_PubliDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_ReconociDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.TipoAtributoDaoImp;
import pe.edu.upeu.sprintemplate.entity.Leg;
import pe.edu.upeu.sprintemplate.entity.Leg2;
import pe.edu.upeu.sprintemplate.entity.Leg3;
import pe.edu.upeu.sprintemplate.entity.Leg4;
import pe.edu.upeu.sprintemplate.entity.Leg5;
import pe.edu.upeu.sprintemplate.entity.Leg5_1;
import pe.edu.upeu.sprintemplate.entity.Leg7;
import pe.edu.upeu.sprintemplate.entity.Leg_Asesora_Tesis;
import pe.edu.upeu.sprintemplate.entity.Leg_Filosofia_Mision;
import pe.edu.upeu.sprintemplate.entity.Leg_Grados_Titulos;
import pe.edu.upeu.sprintemplate.entity.Leg_Investi;
import pe.edu.upeu.sprintemplate.entity.Leg_Publi;
import pe.edu.upeu.sprintemplate.entity.Leg_Reconocimientos;
import pe.edu.upeu.sprintemplate.entity.Usuario;
import pe.edu.upeu.sprintemplate.serviceImp.LegServiceImp; 
  
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
	private LegDaoImp legDao; 
	@Autowired
	private Leg2DaoImp leg2Dao; 
	@Autowired
	private Leg3DaoImp leg3Dao; 
	@Autowired
	private Leg4DaoImp leg4Dao;
	@Autowired
	private Leg5DaoImp leg5Dao;
	@Autowired
	private Leg5_1DaoImp leg5_1Dao;
	@Autowired
	private Leg_InvestiDaoImp legInvestiDao;
	@Autowired
	private Leg_PubliDaoImp legPubliDao;
	@Autowired
	private Leg_Asesora_Tesis_DaoImp legAsesotaTesisDao;
	@Autowired
	private Leg7DaoImp legExtensionCulturalDao;
	@Autowired
	private Leg_ReconociDaoImp leg_ReconciDao;
	@Autowired
	private Leg_FiloDao leg_FilosoDao;
	       
  
	//recuerda que los nombres de las clases tiene que ser iguales a las del beans
	
	
	 
	//      
	    
	
	@GetMapping("/")
	public String index() {
		return "index";     
	}
	
	@GetMapping("/home") 
	public String home4() {
		return "main";       
	}    
	/*
	@RequestMapping(path="/cargarmodulos", method = RequestMethod.GET)
	public String cargarmodulos2() {
		return "main";         
	}*/ 
	

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
	
	
	
	
//tabla grados y titulos   
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
	System.out.println("si trajo el id en el metodo crear en grados  titulos pe : " + idprofesor);
	//int d=1;  
	Leg_Grados_Titulos lg=new Leg_Grados_Titulos(ft,es,t,u1,u2,i,g,e,idprofesor);
	leggradosDao.create(lg); 
	   	
}   
      
@RequestMapping(path="/listarLeg_Grados", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarLeg_Grado(HttpServletRequest request) {
	Gson g = new Gson();
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id en grados y titulos: " + idprofesor);
	return g.toJson(leggradosDao.readAll(idprofesor));
}
	

//tabla experiencia profesional
     
  
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
	System.out.println("esto es : "+a2);
	
	System.out.println(td);
	System.out.println(fi);
	System.out.println(ft);
	   
	String es="completado";
	String tipo="E. profesional";  
	//System.out.println("si trajo el id: " + idprofesor+" pjajajajaj");
	//int d=1;       
	//Leg lg=new Leg(c,fi,ft,a,m,d,l,es,a2,i,idprofesor,tipo,td);   
	System.out.println("si entra en el controlador de crear experiencia profesional");        
	Leg lg=new Leg(c,fi,ft,a,m,d,l,es,a2,i,idprofesor,tipo,td);
	legDao.create(lg);      
	              System.out.println("loocooo");    
} 
   
            
@RequestMapping(path="/listarExProfe", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarExperienciaProfesional2(HttpServletRequest request) {
	Gson g = new Gson();    
	System.out.println("si entra en la lista de experiencia profesional");
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor);
	return g.toJson(legDao.readAllExperienciaProfesional(idprofesor));
}     



// tabla experiencia academico administrativa
@RequestMapping(path="/guardar_experiencia_academico", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_experiencia_academico2(HttpServletRequest request) {
System.out.println("lloooooo");
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
System.out.println("si trajo el id: " + idprofesor+"pes owen en expereincia acaedemico administrativa jajajajaj xd");
//int d=1;
Leg lg=new Leg(c,fi,ft,l,re,es,u3,i,idprofesor,tipo,r); 
legDao.create(lg);
//return "si trajo el id: " + idprofesor+" en el metodo que devuelve guardar_expe";   
   	  
} 



@RequestMapping(path="/listarExperienciaAcademico", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarExperienciaAcademico2(HttpServletRequest request) {
Gson g = new Gson();

int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
System.out.println("si trajo el id: " + idprofesor+"listar experiencia academico");              
return g.toJson(legDao.readAllExperienciaAcademicoAdministrativa(idprofesor));
}



 

// tabla categoriadocente
	
  
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
	return g.toJson(leg2Dao.readAllExpeDocen_EnPresencial(idprofesor));    
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
 


   

// tabla idiomas

@RequestMapping(path="/guardar_Idiomas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_Idiomas3(HttpServletRequest request) {
	int idiomas=Integer.parseInt(request.getParameter("idiomas"));
	int nivel=Integer.parseInt(request.getParameter("nivel"));
	int dominio=Integer.parseInt(request.getParameter("dominio"));
	int insti=Integer.parseInt(request.getParameter("insti"));
	int anio=Integer.parseInt(request.getParameter("anio")); 
	String u4=request.getParameter("u4"); 
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";    
	String tipo="IDIOMA";                    
	System.out.println("si trajo el id: " + idprofesor+"pes owen en idiomas jajajajaj xd");
	//int d=1;
	System.out.println(anio);
	System.out.println(dominio);     
	System.out.println(idiomas);
	System.out.println(es);   
	Leg4 lgd=new Leg4(anio,es,tipo,u4,insti,idprofesor,idiomas,nivel,dominio);  
	leg4Dao.create(lgd);                            
		   
}






//tabla dominios en la tecnologia de la informacion y comunicacion para la educacion univesitaria

@RequestMapping(path="/guardar_DominiosTecnologia", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_DominiosTecnologia5(HttpServletRequest request) {
	int curso=Integer.parseInt(request.getParameter("curso"));
	int nivel=Integer.parseInt(request.getParameter("nivel"));
	int modalidad=Integer.parseInt(request.getParameter("modalidad"));
	int insti=Integer.parseInt(request.getParameter("insti")); 
	String u4=request.getParameter("u4");       
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";   
	String tipo="DOMINIOS TECNOLOGIA";                      
	System.out.println("si trajo el id: " + idprofesor+"pes owen en dominios en la tecnologia  jajajajaj xd");
	//int d=1;
	System.out.println(curso);
	System.out.println(modalidad);     
	System.out.println(nivel);
	System.out.println(es);     
	Leg4 lgeed=new Leg4(es,tipo,u4,insti,idprofesor,curso,nivel,modalidad);     
	leg4Dao.create(lgeed);                               
		   
}   


//tabla de organizacion de eventos  
    
@RequestMapping(path="/guardar_eventosacademicos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_eventosacademicos5(HttpServletRequest request) {
	int a=Integer.parseInt(request.getParameter("a"));
	String f=request.getParameter("f");
	String n=request.getParameter("n"); 
	int i=Integer.parseInt(request.getParameter("i"));
	int h=Integer.parseInt(request.getParameter("h")); 
	int c=Integer.parseInt(request.getParameter("c")); 
	String l=request.getParameter("l");
	String u4=request.getParameter("u4");     
	int idprofesor=Integer.parseInt(request.getParameter("x"));
	String es="completado";   
	String tipo="C y P OrgaEventos";                        
	System.out.println("si trajo el id: " + idprofesor+"pes owen en eventos academicos  jajajajaj xd");
	
	System.out.println(a);
	System.out.println(f);     
	System.out.println(n);
	System.out.println(es);
	System.out.println(tipo);    
	Leg5 lhy=new Leg5(a,f,n,h,c,l,es,tipo,u4,i,idprofesor);
	leg5Dao.create(lhy);         
	
}  
 
@RequestMapping(path="/listareventosSAcademicos", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listareventosSAcademicos3(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en eventos academicos");                    
	return g.toJson(leg5Dao.readAllCyPOrganizaciondeEventos(idprofesor));      
}  



//TABLA CAPACITACION EN LA DOCENCIA EN LOS ULTIMOS
                
@RequestMapping(path="/guardar_capacitaciones_aca", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_capacitacion5(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	System.out.println("si funciona el controlador :" +i);  
	    
	     
	String ne=request.getParameter("ne15");
	System.out.println(ne);           
	
	String fi=request.getParameter("fi");
	System.out.println(fi);    
	   
	String ff=request.getParameter("ff");
	System.out.println(ff); 
	
	 
	int h=Integer.parseInt(request.getParameter("h"));
	System.out.println(h);   
	
	int c=Integer.parseInt(request.getParameter("c"));
	System.out.println(c);   
 
	String l=request.getParameter("l"); 
	System.out.println(l);    
	    
	String a=request.getParameter("a15");
	System.out.println(a);
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	
	String es="completado";   
	String tipo="Capa en la Docencia";                              
	System.out.println("si trajo el id: " + idprofesor+"pes owen capacitacione en la docencia en los ultimos 5 anios   jajajajaj xd");
	   
	System.out.println(fi);
	System.out.println(ff);     
	System.out.println(es);         
	System.out.println(tipo);         
	Leg5 lhy=new Leg5(fi,ne,h,c,l,es,ff,tipo,a,i,idprofesor);        
	leg5Dao.create(lhy);             
	                                              
} 


@RequestMapping(path="/listarcapacitacionDocencia", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarcapacitacionDocencia4(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en capacitaciones en la docencia");                    
	return g.toJson(leg5Dao.readAllCapacitacionenlaDocencia(idprofesor));            
} 



//tabla ponencias en congresos

@RequestMapping(path="/guardar_ponenecias_congresos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_ponenecias_congresos5(HttpServletRequest request) {
	 
	System.out.println("si funciona el controlador de ponencias y congresos :");    
	    
	 
	int a=Integer.parseInt(request.getParameter("a"));
	System.out.println(a);
	
	int c=Integer.parseInt(request.getParameter("c"));
	System.out.println(c);          
	
	String ne=request.getParameter("ne");
	System.out.println(ne);    
	    
	int i=Integer.parseInt(request.getParameter("i"));
	System.out.println(i);
	
	int h=Integer.parseInt(request.getParameter("h"));
	System.out.println(h); 
	
	int credi=Integer.parseInt(request.getParameter("credi"));
	System.out.println(credi); 
	 
	String l=request.getParameter("l"); 
	System.out.println(l);    
	    
	String u=request.getParameter("u");
	System.out.println(u);     
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	
	String es="completado";   
	String tipo="Ponencia Congreso";                                
	System.out.println("si trajo el id: " + idprofesor+"pes owen ponencias en congreso   jajajajaj xd");
	   
       
	System.out.println(es);         
	System.out.println(tipo);         
	Leg5_1 lhy=new Leg5_1(a,ne,h,credi,l,i,idprofesor,c,es,tipo,u);        
	leg5_1Dao.create(lhy);         
	//leg5Dao.create(lhy);             
	                                              
}  


@RequestMapping(path="/listarponenciaaaaa", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarponenciaaaaa6(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en ponencias jajajajja poneneicas");                    
	return g.toJson(leg5_1Dao.readAllCyPPonenciasCongresos(idprofesor));             
} 

// tabla en formal certificada



@RequestMapping(path="/guardar_formar_certificadas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_formar_certificadas7(HttpServletRequest request) {
	 
	System.out.println("si funciona el controlador de formal certificada :");    
	      
	 
	int a=Integer.parseInt(request.getParameter("a"));
	System.out.println(a);
	
	int c=Integer.parseInt(request.getParameter("c"));
	System.out.println(c);          
	
	String ne=request.getParameter("ne");
	System.out.println(ne);    
	    
	int i=Integer.parseInt(request.getParameter("i"));
	System.out.println(i);
	
	int h=Integer.parseInt(request.getParameter("h"));
	System.out.println(h); 
	
	int credi=Integer.parseInt(request.getParameter("credi"));
	System.out.println(credi); 
	 
	String l=request.getParameter("l"); 
	System.out.println(l);    
	    
	String u=request.getParameter("u");
	System.out.println(u);     
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	
	String es="completado";   
	String tipo="Capa Formal Certifi";                                   
	System.out.println("si trajo el id: " + idprofesor+"pes owen capacitacion fromal certificada   jajajajaj xd");
	   
       
	System.out.println(es);         
	System.out.println(tipo);              
	Leg5_1 lhy=new Leg5_1(a,ne,h,credi,l,i,idprofesor,c,es,tipo,u);        
	leg5_1Dao.create(lhy);         
	//leg5Dao.create(lhy);             
	                                              
} 


@RequestMapping(path="/listarforcertificada", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarforcertificada34(HttpServletRequest request) {
	Gson g = new Gson();
	
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en for certificadass jajajajja ");                    
	return g.toJson(leg5_1Dao.readAllCyPCapacitacionFormalCertificada(idprofesor));                
} 
      

// tabla investigacione en los ultimos 5 anios

@RequestMapping(path="/guardar_investigaciones_aniossssss", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_investigaciones_aniossssss8(HttpServletRequest request) {
	 
	System.out.println("si funciona el controlador de investigaciones por anio :");    
	        
	    
	int a=Integer.parseInt(request.getParameter("anios"));
	System.out.println(a);
	         
	
	String t=request.getParameter("t");
	System.out.println(t);    
	    
	int re=Integer.parseInt(request.getParameter("resolu"));
	System.out.println(re);
		 
	String u=request.getParameter("u4"); 
	System.out.println(u);    
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	
	String es="completado";                                    
	System.out.println("si trajo el id: " + idprofesor+"pes oweninvestigacoines en ls ultimos    jajajajaj xd");
	   
       
	System.out.println(es);                 
	Leg_Investi leg= new Leg_Investi(a,t,re,es,u,idprofesor);
	legInvestiDao.create(leg);     
	//leg5Dao.create(lhy);             
	                                              
} 

@RequestMapping(path="/listarcinevstigaaaa", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarcinevstigaaaa8(HttpServletRequest request) {
	Gson g = new Gson();
	  
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en investigaciones en los utlimos 5 anios jajajajja ");                    
	return g.toJson(legInvestiDao.readAllLegInvestigaciones(idprofesor));                      
}


  
// tabla articulos

@RequestMapping(path="/guardar_articulos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_articulos7(HttpServletRequest request) {
	 
	System.out.println("si funciona el articuloss");    
	        
	    
	int a=Integer.parseInt(request.getParameter("anio"));
	System.out.println(a);
	
	int c=Integer.parseInt(request.getParameter("cate"));
	System.out.println(c);
	         
	
	String t=request.getParameter("titulo");
	System.out.println(t);
	
	String nm=request.getParameter("nombremedio");
	System.out.println(nm);
	
	String edito=request.getParameter("edito");
	System.out.println(edito);
	
	String isbn=request.getParameter("isbn");
	System.out.println(isbn);
	    
	int npa=Integer.parseInt(request.getParameter("npagi"));
	System.out.println(npa);
		 
	String l=request.getParameter("lugar"); 
	System.out.println(l);
	
	String archi=request.getParameter("archi"); 
	System.out.println(archi);
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	String tipo="ARTICULOS";  
	String es="completado";                                    
	System.out.println("si trajo el id: " + idprofesor+"pes owen artitculos  jajajajaj xd");
	   
    System.out.println(tipo); 
	System.out.println(es);                 
	Leg_Publi leg=new Leg_Publi(a,t,nm,edito,isbn,npa,l,es,tipo,archi,idprofesor,c);
	legPubliDao.create(leg);   
	//leg5Dao.create(lhy);             
	                                              
} 

@RequestMapping(path="/listararticulos", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listararticulos9(HttpServletRequest request) {
	Gson g = new Gson();
	   
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar <rticulos jajajajja ");                    
	return g.toJson(legPubliDao.readAllLeg_Publi_Articulos(idprofesor));                         
}

// tabla libros

@RequestMapping(path="/guardar_libros", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_libros9(HttpServletRequest request) {
	 
	System.out.println("si funciona el libros");     
	        
	    
	int a=Integer.parseInt(request.getParameter("anio"));
	System.out.println(a);
	
	int c=Integer.parseInt(request.getParameter("cate"));
	System.out.println(c);
	         
	
	String t=request.getParameter("titulo");
	System.out.println(t);
		
	String edito=request.getParameter("edito");
	System.out.println(edito);
	
	String isbn=request.getParameter("isbn");
	System.out.println(isbn);
	    
	int npa=Integer.parseInt(request.getParameter("npagi"));
	System.out.println(npa);
	
	String archi=request.getParameter("archi"); 
	System.out.println(archi);
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	String tipo="LIBROS";   
	String es="completado";                                    
	System.out.println("si trajo el id: " + idprofesor+"pes owen libros  jajajajaj xd");
	   
    System.out.println(tipo); 
	System.out.println(es);                           
	Leg_Publi leg=new Leg_Publi(a,t,edito,isbn,npa,es,tipo,archi,idprofesor,c);
	legPubliDao.create(leg);   
	//leg5Dao.create(lhy);             
	                                              
} 
  
@RequestMapping(path="/listarlibrosss", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarlibrosss9(HttpServletRequest request) {
	Gson g = new Gson();
	   
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar libros jajajajja ");                    
	return g.toJson(legPubliDao.readAllLeg_Publi_Libros(idprofesor));                           
}
	
	
// tabla asesoramiento tesis

	
@RequestMapping(path="/guardar_asesoramiento", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_asesoramiento9(HttpServletRequest request) {
	 
	System.out.println("si funciona asesoramiento tesis");     
	        
	    
	int a=Integer.parseInt(request.getParameter("anio"));
	System.out.println(a);
	
	int c=Integer.parseInt(request.getParameter("cate"));
	System.out.println(c);
	
	int a2=Integer.parseInt(request.getParameter("anio2"));
	System.out.println(a2);
	
	int espe=Integer.parseInt(request.getParameter("espe"));
	System.out.println(espe);
	         
	
	String t=request.getParameter("titulo");
	System.out.println(t);
		
	String autor=request.getParameter("autor");
	System.out.println(autor);
	
	String reso=request.getParameter("reso");
	System.out.println(reso);    
	
	String archi=request.getParameter("archi"); 
	System.out.println(archi);
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);     
	String es="completado";                                    
	System.out.println("si trajo el id: " + idprofesor+"pes owen asesorameitno tesis  jajajajaj xd");
	   
    
	System.out.println(es);          
	Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(a,t,autor,a2,reso,es,archi,espe,idprofesor,c);  
	 
	legAsesotaTesisDao.create(leg); 
	          
	                                                 
} 


@RequestMapping(path="/listarasesoramiento", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarasesoramiento999(HttpServletRequest request) {
	Gson g = new Gson();
	      
	      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar asesoramiento jajajajja ");                    
	return g.toJson(legAsesotaTesisDao.readAllLegAsesoraTesisss(idprofesor));                             
}
	

// tabla proyectos de proyeccion social


@RequestMapping(path="/guardar_tiposdeproyeccionsocial", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_tiposdeproyeccionsocial987(HttpServletRequest request) {
	 
	System.out.println("si funciona tipos de proyeccion social");        
	        
	    
	int a=Integer.parseInt(request.getParameter("anio"));
	System.out.println(a);
	
	int nparticipantes=Integer.parseInt(request.getParameter("nparticipantes"));
	System.out.println(nparticipantes);
	      
	String po=request.getParameter("po");
	System.out.println(po); 
	         
	String t=request.getParameter("t");
	System.out.println(t);    
	
	String tp=request.getParameter("tp");
	System.out.println(tp);
		
	String l=request.getParameter("l");
	System.out.println(l);    
	
	String u4=request.getParameter("u4"); 
	System.out.println(u4);
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);     
	String es="completado";                                     
	System.out.println("si trajo el id: " + idprofesor+"pes owen tipo de proyeccion social jajajajaj xd");
    
	System.out.println(es);  
	
	Leg7 leg= new Leg7(a,t,po,l,nparticipantes,es,tp,u4,idprofesor);  
	legExtensionCulturalDao.create(leg);
	 
	          
	                                                 
}
	
@RequestMapping(path="/listartiposproyeccion", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listartiposproyeccion222(HttpServletRequest request) {
	Gson g = new Gson();
	      
	      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar tipos de proyeccion social jajajajja ");                    
	return g.toJson(legExtensionCulturalDao.readAllLeg7ExtensionCultural(idprofesor));                              
}
	

//tabla de reconocimientos



@RequestMapping(path="/guardar_reconocimientos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_reconocimientosdsd(HttpServletRequest request) {
	 
	System.out.println("si funciona reconocimientos");        
	        
	    
	int a=Integer.parseInt(request.getParameter("a"));
	System.out.println(a);
	      
	int i=Integer.parseInt(request.getParameter("i")); 
	System.out.println(i); 
	         
	String t=request.getParameter("t");
	System.out.println(t);    
	
	String f=request.getParameter("f");
	System.out.println(f);
		
	String c=request.getParameter("c");
	System.out.println(c);
	String r=request.getParameter("r");
	System.out.println(r);
	String l=request.getParameter("l");
	System.out.println(l); 
	
	String u4=request.getParameter("u4"); 
	System.out.println(u4); 
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);     
	String es="completado";                                     
	System.out.println("si trajo el id: " + idprofesor+"pes owen reconocimientos jajajajaj xd");
    
	System.out.println(es);  
	Leg_Reconocimientos leg= new Leg_Reconocimientos(f,a,c,r,l,es,t,u4,i,idprofesor);  
	leg_ReconciDao.create(leg);   
	 
	          
	                                                 
}

@RequestMapping(path="/listarreconooo", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarreconooo986(HttpServletRequest request) {
	Gson g = new Gson();
	      
	      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en reconocimeintos pe jajajajja ");                    
	return g.toJson(leg_ReconciDao.readAllLeg_Reconocimientos(idprofesor));                                  
}

// tabla de cosmovision

@RequestMapping(path="/guardar_cosmovision", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_cosmovision654(HttpServletRequest request) {
	 
	System.out.println("si funciona cosmovision");         
	        
	 
	   
	String decla=request.getParameter("decla");
	System.out.println(decla);
	
	String docu=request.getParameter("docu");
	System.out.println(docu);
	
	String archi=request.getParameter("archi"); 
	System.out.println(archi);  
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	String tipo="Cosmovision"; 
	String es="completado";                                     
	System.out.println("si trajo el id: " + idprofesor+"pes owen cosmovision jajajajaj xd");
    
	System.out.println(es);  
	Leg_Filosofia_Mision leg= new Leg_Filosofia_Mision(decla,tipo,archi,docu,es,idprofesor);
	leg_FilosoDao.create(leg);     
	 
	           
	                                                 
}

@RequestMapping(path="/listarcosmovision", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarcosmovision345(HttpServletRequest request) {
	Gson g = new Gson();
	      
	        
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar cosmovisionjajajja ");                    
	return g.toJson(leg_FilosoDao.readAllLeg_Cosmovision(idprofesor));                                    
}

// tabla fe integracion enseñanza


@RequestMapping(path="/guardar_ife", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_ife87(HttpServletRequest request) {
	 
	System.out.println("si funciona ifeeeeee");         
	        
	 
	   
	String decla=request.getParameter("decla");
	System.out.println(decla);
	
	String docu=request.getParameter("docu");
	System.out.println(docu);
	
	String archi=request.getParameter("archi"); 
	System.out.println(archi);  
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	String tipo="Integracion Fe";                   	
	String es="completado";                                     
	System.out.println("si trajo el id: " + idprofesor+"pes owen ifeeeee jajajajaj xd");
    
	System.out.println(es);  
	Leg_Filosofia_Mision leg= new Leg_Filosofia_Mision(decla,tipo,archi,docu,es,idprofesor);
	leg_FilosoDao.create(leg);     
	 
	           
	                                                 
}

@RequestMapping(path="/listarife", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarife4534(HttpServletRequest request) {
	Gson g = new Gson();
	         
	                      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar ifeeeeeeee jajajja ");                    
	return g.toJson(leg_FilosoDao.readAllLeg_IntegracionEnseñanza(idprofesor));                                    
}

// tabla servicio aprendizaje


@RequestMapping(path="/guardar_servicio", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void guardar_servicio9976(HttpServletRequest request) {
	 
	System.out.println("si funciona servicio aprendizaje");         
	        
	 
	   
	String decla=request.getParameter("decla");
	System.out.println(decla);
	
	String docu=request.getParameter("docu");
	System.out.println(docu); 
	
	String archi=request.getParameter("archi"); 
	System.out.println(archi);  
	    
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);
	String tipo="Servicio Aprendizaje";                         	
	String es="completado";                                     
	System.out.println("si trajo el id: " + idprofesor+"pes owen servicios jajajajaj xd");
    
	System.out.println(es);  
	Leg_Filosofia_Mision leg= new Leg_Filosofia_Mision(decla,tipo,archi,docu,es,idprofesor);
	leg_FilosoDao.create(leg);     
	 
	           
	                                                 
}

@RequestMapping(path="/listarserviii", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarserviii5656(HttpServletRequest request) {
	Gson g = new Gson();
	         
	                      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar servicio jajajja ");                    
	return g.toJson(leg_FilosoDao.readAllLeg_ServicioApredizaje(idprofesor));                                      
} 

















	   
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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

 

  


