package pe.edu.upeu.sprintemplate.controller;



import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.apache.commons.io.FilenameUtils; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
import pe.edu.upeu.sprintemplate.daoImp.LegExtraDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_Asesora_Tesis_DaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_Grados_TitulosDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_InvestiDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_PubliDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.Leg_ReconociDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.TipoAtributoDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.UsuarioDaoImp;
import pe.edu.upeu.sprintemplate.entity.Institucion;
import pe.edu.upeu.sprintemplate.entity.Leg;
import pe.edu.upeu.sprintemplate.entity.Leg2;
import pe.edu.upeu.sprintemplate.entity.Leg3;
import pe.edu.upeu.sprintemplate.entity.Leg4;
import pe.edu.upeu.sprintemplate.entity.Leg5;
import pe.edu.upeu.sprintemplate.entity.Leg5_1;
import pe.edu.upeu.sprintemplate.entity.Leg7;
import pe.edu.upeu.sprintemplate.entity.Leg_Asesora_Tesis;
import pe.edu.upeu.sprintemplate.entity.Leg_Extras;
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
	private UsuarioDaoImp usuarioDao;
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
	@Autowired
	private LegExtraDaoImp leg_extraDao; 
	       
  
	//recuerda que los nombres de las clases tiene que ser iguales a las del beans
	
	
	 
	//      
	    
	
	@GetMapping("/")
	public String index() {
		return "index";     
	}
	/*
	@GetMapping("/home") 
	public String home4() {
		return "main";       
	}
	*/ 
	
	// metodos para el login
	@RequestMapping(path="/home",method=RequestMethod.POST) 
	public String home4(HttpSession session, @RequestParam("nom_user") String nom_user, @RequestParam("clave") String clave) {
		System.out.println("si llega al controlador del login pues owen");
		 
		 String retornar= ""; 
		 Usuario usuuuuu=new Usuario(nom_user,clave);
		 List<Map<String,Object>> lista = (usuarioDao.readAllLogin(usuuuuu));
		 System.out.println(lista);
		 if(lista.size()==0) {
			 System.out.println("Usuario/Contraseña incorrecto");
			 retornar="redirect:/";   
		 }else {     
			 System.out.println("si entra en el controlador");
			 	for (Map<String,Object> mm :lista) { 
			 		System.out.println("llego al ciclo for");
			 		session.setAttribute("nombre", mm.get("NOMBRE"));
			 		session.setAttribute("apellido", mm.get("APELLIDO"));
			 		session.setAttribute("nu", mm.get("NOM_USER")); 
			 		session.setAttribute("cl", mm.get("CLAVE")); 
			 		String a= (String) mm.get("NOMBRE");      
			 		System.out.println(a);          
			 		String b= mm.get("IDROL").toString();  
			 		String c= mm.get("IDDOCON").toString(); 
			 		 int idroll=Integer.parseInt(b); 
			 		int iddoceconvo=Integer.parseInt(c); 
			 		 System.out.println(idroll); 
			 		 System.out.println(iddoceconvo);      
			 		session.setAttribute("roles", idroll);   
			 		session.setAttribute("iddocenteconvocatoria", iddoceconvo);
			 		 //Usuario usucontructor=new Usuario(numero);
			 		//List<Map<String,Object>> listamodulos=(usuarioDao.readAllModulos(usucontructor));
			 		//System.out.println(listamodulos);     
			 		//int numero=Integer.parseInt(b);       
			 		//int numero=Integer.valueOf(((Integer) mm.get("IDROL")).intValue()); 
			 		//System.out.println("El numero que trae del idro es:"+numero);
			 		//System.out.println(a);     
			 		//String num= (String) mm.get("IDROL");
			 		//int nnn=Integer.parseInt(num);
			 		//System.out.println("El id del rol es:"+nnn);          
			 	}
			 retornar="main";
			 
		 }
		return retornar;         
	}  
  
	//metodo para listar los modulos por rol
	@RequestMapping(path="/listar_modulos_rol", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String ListarModulos(HttpServletRequest request) {
		int b=Integer.parseInt(request.getParameter("b")); 
		System.out.println("si trajo el id del rol: " + b);
		Usuario u= new Usuario(b);
		Gson g= new Gson();      
		List<Map<String,Object>> listamodulos=(usuarioDao.readAllModulos(u));
		System.out.println(listamodulos);    
		return 	g.toJson(listamodulos);      
	} 
	   
	@RequestMapping(value="/enviarelidmodulopepepe", method = RequestMethod.POST)
    
	public String Idmofulosjah(@RequestParam("valormo") String id, 
			HttpServletResponse response,  HttpServletRequest request,HttpSession
			sesion) throws IOException {
		ServletContext cntx = request.getServletContext();
		System.out.println("si entra en el controlador de el id del modulo "+id);
		int r=Integer.parseInt(id);
		String retor="";
		if(r>0) {
			System.out.println("el id es mayor que cero");   
			sesion.setAttribute("idmodulo_menu", r);  
			retor="main_jsp";    
		}else {
			System.out.println("el id es menor que cero");
			retor="/";         
		}
		return retor;       
	} 
	
	
	@RequestMapping(path="/listar_menu_modulo", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String listar_menu_modulo(HttpServletRequest request) {
		int x=Integer.parseInt(request.getParameter("x")); 
		System.out.println("si trajo el id del modulo para el menu: " + x);
		//Usuario u= new Usuario(x); 
		Institucion i= new Institucion(x);     
		Gson g= new Gson();        
		List<Map<String,Object>> listamenus=(institucionDao.readAllPrivilegios(i));
		System.out.println(listamenus);     
		return 	g.toJson(listamenus);      
	}   
	  
	
	
	
	
	/*
	//enviar a la vista de menu
	@RequestMapping(path="/enviar_vista_menu", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String enviar_vista_menu(HttpServletRequest request) { 
		System.out.println("si entra en el controlador jaj  de la vista del menu: "); 
		Gson g= new Gson();
		String a="main_jsp.jsp";  
		return 	g.toJson(a);                   
	}*/ 
	
	 
	 
	
	
////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////7
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////7
	//////////////////////////////////////////////////////////////////////////////77  
	
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


//tabla de organizacion de eventos academicos 
    
@RequestMapping(path="/guardar_eventosacademicos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_eventosacademicos5(HttpServletRequest request) {
	int a=Integer.parseInt(request.getParameter("a"));
	Gson g = new Gson();
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
	          
	return g.toJson(leg5Dao.create(lhy));
}  
 
@RequestMapping(path="/listareventosSAcademicos", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listareventosSAcademicos3(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en eventos academicos");                    
	return g.toJson(leg5Dao.readAllCyPOrganizaciondeEventos(idprofesor));      
}  



@RequestMapping(value="/guardar_img_eventosacademicos", method = RequestMethod.POST)

public String EventosAcademicos_PE_Imagenes(@RequestParam("archi14") List<MultipartFile> file, @RequestParam("id14") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de eventos academicos pe jjajajaxd tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
         
		try {    
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGEVEACA_"+id.replace(" ","");      
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);      
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre); 
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				//Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				//legAsesotaTesisDao.update(leg);  
				//Leg_Publi leg=new Leg_Publi(idint,nombre);
				//legPubliDao.update(leg);    
				//Leg_Investi leg= new Leg_Investi(idint,nombre);
				//legInvestiDao.update(leg);   
				
				Leg5 leg= new Leg5(idint,nombre);   
				leg5Dao.update(leg);       
				
				//Leg7 leg= new Leg7(idint,nombre);       
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/actua";                                 
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();     
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}









//TABLA CAPACITACION EN LA DOCENCIA EN LOS ULTIMOS
                
@RequestMapping(path="/guardar_capacitaciones_aca", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_capacitacion5(HttpServletRequest request) {
	int i=Integer.parseInt(request.getParameter("i"));
	System.out.println("si funciona el controlador :" +i);  
	Gson g = new Gson();    
	     
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
	           
	return g.toJson(leg5Dao.create(lhy));                                                    
} 


@RequestMapping(path="/listarcapacitacionDocencia", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarcapacitacionDocencia4(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en capacitaciones en la docencia");                    
	return g.toJson(leg5Dao.readAllCapacitacionenlaDocencia(idprofesor));            
} 



@RequestMapping(value="/guardar_img_capcitaciondocenciasjdn", method = RequestMethod.POST)

public String CapacitacionDocenciapjaja_PE_Imagenes(@RequestParam("archi15") List<MultipartFile> file, @RequestParam("id15") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;          
	System.out.println("si entra en el controlador de capcitaciones en la docencia pe jjajajaxd tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
           
		try {           
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGCAPACI_"+id.replace(" ","");      
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);      
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre); 
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				//Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				//legAsesotaTesisDao.update(leg);  
				//Leg_Publi leg=new Leg_Publi(idint,nombre);
				//legPubliDao.update(leg);    
				//Leg_Investi leg= new Leg_Investi(idint,nombre);
				//legInvestiDao.update(leg);   
				  
				Leg5 leg= new Leg5(idint,nombre);    
				leg5Dao.update(leg);       
				
				//Leg7 leg= new Leg7(idint,nombre);       
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/capadocencia";                                 
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();     
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}









//tabla ponencias en congresos

@RequestMapping(path="/guardar_ponenecias_congresos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_ponenecias_congresos5(HttpServletRequest request) {
	 
	System.out.println("si funciona el controlador de ponencias y congresos :");    
	Gson g = new Gson();  
	 
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
	       
	//leg5Dao.create(lhy);             
	return  g.toJson(leg5_1Dao.create(lhy));                               
}  


@RequestMapping(path="/listarponenciaaaaa", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarponenciaaaaa6(HttpServletRequest request) {
	Gson g = new Gson();
	
	   
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en ponencias jajajajja poneneicas");                    
	return g.toJson(leg5_1Dao.readAllCyPPonenciasCongresos(idprofesor));             
} 



@RequestMapping(value="/guardar_img_ponenciascongresos", method = RequestMethod.POST)

public String Ponenciasencongrsso_PE_Imagenes(@RequestParam("archi18") List<MultipartFile> file, @RequestParam("id18") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;          
	System.out.println("si entra en el controlador de ponencia pipipipi pe jjajajaxd tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0; 
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
           
		try {           
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGPONEN_"+id.replace(" ","");      
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);      
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre); 
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				//Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				//legAsesotaTesisDao.update(leg);  
				//Leg_Publi leg=new Leg_Publi(idint,nombre);
				//legPubliDao.update(leg);    
				//Leg_Investi leg= new Leg_Investi(idint,nombre);
				//legInvestiDao.update(leg);   
				  
				//Leg5 leg= new Leg5(idint,nombre);    
				//leg5Dao.update(leg);       
				Leg5_1 leg=new Leg5_1(idint,nombre);
				leg5_1Dao.update(leg);          
				//Leg7 leg= new Leg7(idint,nombre);       
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/actua";                                    
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();     
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}





// tabla en formal certificada



@RequestMapping(path="/guardar_formar_certificadas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_formar_certificadas7(HttpServletRequest request) {
	 
	System.out.println("si funciona el controlador de formal certificada :");    
	      
	Gson g = new Gson(); 
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
	         
	//leg5Dao.create(lhy);
	
	return g.toJson(leg5_1Dao.create(lhy));    
	                                              
} 


@RequestMapping(path="/listarforcertificada", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarforcertificada34(HttpServletRequest request) {
	Gson g = new Gson();
	
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en for certificadass jajajajja ");                    
	return g.toJson(leg5_1Dao.readAllCyPCapacitacionFormalCertificada(idprofesor));                
} 
      

@RequestMapping(value="/guardar_img_formalcertifi", method = RequestMethod.POST)

public String ormalCertificada_PE_Imagenes(@RequestParam("archi20") List<MultipartFile> file, @RequestParam("id20") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;          
	System.out.println("si entra en el controlador de FORMAL CERTIFICADA pipipipi pe jjajajaxd tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;  
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
           
		try {           
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGFORMAL_"+id.replace(" ","");      
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);      
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre); 
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				//Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				//legAsesotaTesisDao.update(leg);  
				//Leg_Publi leg=new Leg_Publi(idint,nombre);
				//legPubliDao.update(leg);    
				//Leg_Investi leg= new Leg_Investi(idint,nombre);
				//legInvestiDao.update(leg);   
				  
				//Leg5 leg= new Leg5(idint,nombre);    
				//leg5Dao.update(leg);       
				Leg5_1 leg=new Leg5_1(idint,nombre);
				leg5_1Dao.update(leg);          
				//Leg7 leg= new Leg7(idint,nombre);       
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/actua";                                    
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();     
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
} 






// tabla investigacione en los ultimos 5 anios

@RequestMapping(path="/guardar_investigaciones_aniossssss", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_investigaciones_aniossssss8(HttpServletRequest request) {
	 
	System.out.println("si funciona el controlador de investigaciones por anio :");    
	Gson g = new Gson();      
	    
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
	     
	//leg5Dao.create(lhy);             
	 return g.toJson(legInvestiDao.create(leg));                                              
} 

@RequestMapping(path="/listarcinevstigaaaa", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarcinevstigaaaa8(HttpServletRequest request) {
	Gson g = new Gson();
	  
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en investigaciones en los utlimos 5 anios jajajajja ");                    
	return g.toJson(legInvestiDao.readAllLegInvestigaciones(idprofesor));                      
}

 
@RequestMapping(value="/guardar_img_investiiiirgt", method = RequestMethod.POST)

public String Inevtaigacioens_PE_Imagenes(@RequestParam("archi13") List<MultipartFile> file, @RequestParam("id13") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de investigaciones pe jjajajaxd tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
         
		try {    
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGINVESTI_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				//Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				//legAsesotaTesisDao.update(leg);  
				//Leg_Publi leg=new Leg_Publi(idint,nombre);
				//legPubliDao.update(leg);    
				Leg_Investi leg= new Leg_Investi(idint,nombre);
				legInvestiDao.update(leg);   
				
				//Leg7 leg= new Leg7(idint,nombre);    
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/investi";          
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();     
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}





  
// tabla articulos

@RequestMapping(path="/guardar_articulos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_articulos7(HttpServletRequest request) {
	 
	System.out.println("si funciona el articuloss");    
	Gson g = new Gson();     
	    
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
	  
	//leg5Dao.create(lhy);
	      
	return g.toJson(legPubliDao.create(leg));
	                                              
} 

@RequestMapping(path="/listararticulos", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listararticulos9(HttpServletRequest request) {
	Gson g = new Gson();
	   
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar <rticulos jajajajja ");                    
	return g.toJson(legPubliDao.readAllLeg_Publi_Articulos(idprofesor));                         
}


@RequestMapping(value="/guardar_img_articuloo", method = RequestMethod.POST)

public String ARticulossos_Imagenes(@RequestParam("archi15") List<MultipartFile> file, @RequestParam("id15") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de articulos tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
         
		try {    
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGARTICU_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				//Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				//legAsesotaTesisDao.update(leg);  
				Leg_Publi leg=new Leg_Publi(idint,nombre);
				legPubliDao.update(leg);    
				//Leg7 leg= new Leg7(idint,nombre);    
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/publiii";     
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();     
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}









// tabla libros

@RequestMapping(path="/guardar_libros", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_libros9(HttpServletRequest request) {
	 
	System.out.println("si funciona el libros");     
	Gson g = new Gson();        
	    
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
	  
	//leg5Dao.create(lhy);               
	return g.toJson(legPubliDao.create(leg));                                              
} 
  
@RequestMapping(path="/listarlibrosss", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarlibrosss9(HttpServletRequest request) {
	Gson g = new Gson();
	   
	     
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar libros jajajajja ");                    
	return g.toJson(legPubliDao.readAllLeg_Publi_Libros(idprofesor));                           
}



@RequestMapping(value="/guardar_img_libros", method = RequestMethod.POST)

public String Librososos_Imagenes(@RequestParam("archi20") List<MultipartFile> file, @RequestParam("id20") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de libros tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
            
	int res = 0;
	System.out.println(file + " , " + id);    
	if (!file.isEmpty()) {
         
		try {    
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGLIBRO_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				//Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				//legAsesotaTesisDao.update(leg);  
				Leg_Publi leg=new Leg_Publi(idint,nombre);
				legPubliDao.update(leg);            
				//Leg7 leg= new Leg7(idint,nombre);    
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/publiii";     
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();     
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}











	
// tabla asesoramiento tesis

	
@RequestMapping(path="/guardar_asesoramiento", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_asesoramiento9(HttpServletRequest request) {
	 
	System.out.println("si funciona asesoramiento tesis");     
	Gson g = new Gson();          
	    
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
	 
	    
	          
	return g.toJson(legAsesotaTesisDao.create(leg));                                                 
} 


@RequestMapping(path="/listarasesoramiento", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarasesoramiento999(HttpServletRequest request) {
	Gson g = new Gson();
	      
	      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar asesoramiento jajajajja ");                    
	return g.toJson(legAsesotaTesisDao.readAllLegAsesoraTesisss(idprofesor));                             
}


@RequestMapping(value="/guardar_img_asesoriatesis", method = RequestMethod.POST)

public String AsesoramientoTesis_Imagenes(@RequestParam("archi21") List<MultipartFile> file, @RequestParam("id21") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de asesoramiento tesis de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
         
		try {    
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGASESO_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				Leg_Asesora_Tesis leg= new Leg_Asesora_Tesis(idint,nombre); 
				legAsesotaTesisDao.update(leg);  
				
				//Leg7 leg= new Leg7(idint,nombre);   
				//legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/asesoratesis";    
			}              
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}







// tabla proyectos de proyeccion social

            
@RequestMapping(path="/guardar_tiposdeproyeccionsocial", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_tiposdeproyeccionsocial987(HttpServletRequest request) {
	 
	System.out.println("si funciona tipos de proyeccion social");        
	Gson g = new Gson();        
	    
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
	
	 
	return g.toJson(legExtensionCulturalDao.create(leg));            
	                                                 
}
	
@RequestMapping(path="/listartiposproyeccion", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listartiposproyeccion222(HttpServletRequest request) {
	Gson g = new Gson();
	      
	      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar tipos de proyeccion social jajajajja ");                    
	return g.toJson(legExtensionCulturalDao.readAllLeg7ExtensionCultural(idprofesor));                              
}



@RequestMapping(value="/guardar_img_proyeccionsocial", method = RequestMethod.POST)

public String ProyeccionSocial_Imagenes(@RequestParam("archi22") List<MultipartFile> file, @RequestParam("id22") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de proyeccion social de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
         
		try {    
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGPROYEC_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				//Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				Leg7 leg= new Leg7(idint,nombre);  
				legExtensionCulturalDao.update(leg);   
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/exten";    
			}            
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();
		}
		
     
		System.out.println(res);

	}
	        
 
	//System.out.println(result);
	return result;
}









	

//tabla de reconocimientos



@RequestMapping(path="/guardar_reconocimientos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_reconocimientosdsd(HttpServletRequest request) {
	 
	System.out.println("si funciona reconocimientos");        
	Gson g = new Gson();       
	    
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
	   
	 
	          
	return g.toJson(leg_ReconciDao.create(leg));                                                         
}

@RequestMapping(path="/listarreconooo", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarreconooo986(HttpServletRequest request) {
	Gson g = new Gson();
	      
	      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar en reconocimeintos pe jajajajja ");                    
	return g.toJson(leg_ReconciDao.readAllLeg_Reconocimientos(idprofesor));                                  
}

@RequestMapping(value="/guardar_img_premiosrecnco", method = RequestMethod.POST)

public String Reconocmimeintos_Imagenes(@RequestParam("archi24") List<MultipartFile> file, @RequestParam("id24") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {  
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de reconocimientos de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
         
		try {    
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGRECONO_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				Leg_Reconocimientos leg=new Leg_Reconocimientos(idint,nombre);
				leg_ReconciDao.update(leg);      
				//Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				//leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/premios";    
			}            
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();
		}
		
     
		System.out.println(res);

	}
	  
 
	//System.out.println(result);
	return result;
}






// tabla de cosmovision

@RequestMapping(path="/guardar_cosmovision", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_cosmovision654(HttpServletRequest request) {
	                                     
	System.out.println("si funciona cosmovision");         
	Gson g = new Gson();            
	 
	   
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
	
	   
	System.out.println("Si llega al final del controlador sin acciones");
	                     
	return g.toJson(leg_FilosoDao.create(leg));                                                               
}

@RequestMapping(path="/listarcosmovision", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarcosmovision345(HttpServletRequest request) {
	Gson g = new Gson();
	      
	        
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar cosmovisionjajajja ");                    
	return g.toJson(leg_FilosoDao.readAllLeg_Cosmovision(idprofesor));                                    
} 

@RequestMapping(value="/guardar_img_cosmovision_2", method = RequestMethod.POST)

public String Cosmovision_Imagenes(@RequestParam("archi33") List<MultipartFile> file, @RequestParam("id33") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {
	ServletContext cntx = request.getServletContext();
	String result = null;         
	System.out.println("si entra en el controlador de cosmovision de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
         
		try {  
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGFILO_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/filo";   
			}            
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();
		}
		
     
		System.out.println(res);

	}
	  
 
	//System.out.println(result);
	return result;
}





// tabla fe integracion enseñanza


@RequestMapping(path="/guardar_ife", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_ife87(HttpServletRequest request) {
	 
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
	    
	Gson g = new Gson(); 
	           
	return g.toJson(leg_FilosoDao.create(leg));                                                   
}

@RequestMapping(path="/listarife", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarife4534(HttpServletRequest request) {
	Gson g = new Gson();
	         
	                      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar ifeeeeeeee jajajja ");                    
	return g.toJson(leg_FilosoDao.readAllLeg_IntegracionEnseñanza(idprofesor));                                    
}

@RequestMapping(value="/guardar_img_feintegracion", method = RequestMethod.POST)

public String FeINtegracion_Imagenes(@RequestParam("archi45") List<MultipartFile> file, @RequestParam("id45") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {
	ServletContext cntx = request.getServletContext();
	String result = null;     
	System.out.println("si entra en el controlador de fe integracion de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id); 
	if (!file.isEmpty()) {
     
		try {  
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGFILO_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);    
				result = "redirect:/integraaa";   
			}        
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();
		}
		
     
		System.out.println(res);

	}
	  
 
	//System.out.println(result);
	return result;
}






// tabla servicio aprendizaje


@RequestMapping(path="/guardar_servicio", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_servicio9976(HttpServletRequest request) {
	 
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
	    
	Gson g = new Gson(); 
	 return g.toJson(leg_FilosoDao.create(leg));          
	                                                  
}

@RequestMapping(path="/listarserviii", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarserviii5656(HttpServletRequest request) {
	Gson g = new Gson();
	         
	                      
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar servicio jajajja ");                    
	return g.toJson(leg_FilosoDao.readAllLeg_ServicioApredizaje(idprofesor));                                      
}

@RequestMapping(value="/guardar_img_cosmovision", method = RequestMethod.POST)
 
public String Servi_Imagenes(@RequestParam("archi98") List<MultipartFile> file, @RequestParam("id98") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {
	ServletContext cntx = request.getServletContext();
	String result = null;    
	System.out.println("si entra en el controlador de servisss de imagenes pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
           
	int res = 0;
	System.out.println(file + " , " + id);
	if (!file.isEmpty()) {
     
		try {  
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGFILO_"+id.replace(" ","");     
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(idint,nombre); 
				leg_FilosoDao.update(leg); 
				/*Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);*/                   
				System.out.println("respuesta de update" + res);
				result = "redirect:/serviii";
			}        
 
		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();
		}
		
     
		System.out.println(res);

	}
	  
 
	//System.out.println(result);
	return result;
} 

@RequestMapping(path = "/cambiarestado_servicio", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void ELiminarServicio(HttpServletRequest request) {
    int id = Integer.parseInt(request.getParameter("id"));
	Gson g = new Gson(); 
	System.out.println("si entra el id en el controlador servicio: "+id);
	String es="incompleto";
	Leg_Filosofia_Mision leg=new Leg_Filosofia_Mision(es,id);  
	System.out.println(leg.toString());
	leg_FilosoDao.delete(leg);            
	//leg_FilosoDao.update(leg);    
	//Leg_Extras l=new Leg_Extras(es, id);           
	//System.out.println(l.toString());        
	//leg_extraDao.delete(l); 
	//return g.toJson();   
}



// tabla extrasssss

/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////
@RequestMapping(path="/guardar_extras", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String guardar_extras898989(HttpServletRequest request) {
	 
	System.out.println("si funciona logros extras");         
	String docu=request.getParameter("docu");
	System.out.println(docu); 
	
	String archi=request.getParameter("archi"); 
	System.out.println(archi);  
	     
	int idprofesor=Integer.parseInt(request.getParameter("x"));  
	System.out.println(idprofesor);                           	
	String es="completado";                                     
	System.out.println("si trajo el id: " + idprofesor+"pes owen logros extras jajajajaj xd");
    
	System.out.println(es);  
	Leg_Extras leg= new Leg_Extras(docu,archi,idprofesor,es);
	  
	Gson g = new Gson(); 
	           
	return g.toJson(leg_extraDao.create(leg));                                                     
}

@RequestMapping(path="/listarextrasssssssssssssssssss", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String listarextrasssssssssssssssssss44(HttpServletRequest request) {
	Gson g = new Gson();
	         
	                        
	int idprofesor = Integer.parseInt(request.getParameter("idprofe"));
	System.out.println("si trajo el id: " + idprofesor+"listar extras pe señor pero con estado jajaj controadorjajajja ");                    
	return g.toJson(leg_extraDao.readAllLeg_Extras(idprofesor));                                             
}
 
 
   
@RequestMapping(value="/guardar_img_logrosextras", method = RequestMethod.POST)
    
public String LogrosExtras_Imagenes(@RequestParam("archi") List<MultipartFile> file, @RequestParam("id") String id,
		HttpServletResponse response,  HttpServletRequest request) throws IOException {
	ServletContext cntx = request.getServletContext();
	String result = null;    
	System.out.println("si entra en el controlador de ajax pues owen" + file);
	//System.out.println("entro en el controlador de ajax:"+id);         
          
	int res = 0;
	System.out.println(file + " , " + id);
	if (!file.isEmpty()) {
 
		try {  
			for (MultipartFile fi : file) {
				System.out.println(file);
				String path = cntx.getRealPath("/WEB-INF/") + File.separator + fi.getOriginalFilename();
				String nome= fi.getOriginalFilename();
				nome="LGEXTRA_"+id.replace(" ","");
				FilenameUtils fich = new FilenameUtils(); 
				path = cntx.getRealPath("/recursos/files/" + nome+"."+FilenameUtils.getExtension(path));
				System.out.println("ruta del archivo: " + path);  
				File destFile = new File(path);
				fi.transferTo(destFile);
				String nombre = destFile.getName();
				String url = destFile.getPath();  
				System.out.println("controller: " +id);
				 int idint=Integer.parseInt(id);
				 System.out.println("Si convirtio el id que es: "+idint);
				System.out.println(nombre);
				//res = vd.subirDocumento("", "", nombre, idvac);
				Leg_Extras leg= new Leg_Extras(idint,nombre);
				leg_extraDao.update(leg);                   
				System.out.println("respuesta de update" + res);
				result = "redirect:/ex";
			}        

		} catch (IOException | IllegalStateException ec) {
			ec.getMessage();
			ec.printStackTrace();
		}
		
     
		System.out.println(res);

	}
	  
 
	//System.out.println(result);
	return result;
}       

 
@RequestMapping(path = "/cambiarestado_extra", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody void eliminarDocente(HttpServletRequest request) {
    int id = Integer.parseInt(request.getParameter("id"));
	Gson g = new Gson();
	System.out.println("si entra el id en el controlador: "+id);
	String es="incompleto";  
	Leg_Extras l=new Leg_Extras(es, id);           
	System.out.println(l.toString());        
	leg_extraDao.delete(l); 
	//return g.toJson();   
} 










///////////////probando jpa en cosmovision




/////////////////////////////////////////////////////////////////////////////////////7
////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////











   










	
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
	
	@GetMapping("/capadocencia")
	public ModelAndView capadocencia345() {
		ModelAndView c= new ModelAndView();    
		c.setViewName("Legajo_capacitaciondocenciape");
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
	
	@GetMapping("/publiii")
	public ModelAndView publiii987() {
		ModelAndView gi= new ModelAndView();       
		gi.setViewName("Legajo_todopublicaciones");       
		gi.addObject("lista_tipopublicaciones",tipoatributoDao.readAll_tipopublicaciones());
		gi.addObject("lista_tipopublicaciones_espe",tipoatributoDao.readAll_tipopublicaciones_espe());
		gi.addObject("lista_nivelasesoria",tipoatributoDao.readAll_nivelasesoria());
		gi.addObject("lista_especialidad",especialidadDao.readAll());
		return gi;     
	}
	@GetMapping("/asesoratesis")
	public ModelAndView asesoratesis987() {
		ModelAndView gi= new ModelAndView();        
		gi.setViewName("Legajo_asesoriadetesis");        
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
	
	@GetMapping("/premios")
	public ModelAndView premios345() {
		ModelAndView gg= new ModelAndView();
		gg.setViewName("Legajo_premiosoreconocimientos");        
		gg.addObject("lista_institucion",institucionDao.readAll());
		return gg; 
	}

	@GetMapping("/filo")
	public String filsofia123() { 

		return "Legajo_filosofia";
	}
	
	@GetMapping("/integraaa")
	public String integraaa987() {
   
		return "Legajo_feintegracion";
	}
	
	@GetMapping("/serviii")
	public String serviii657() {
   
		return "Legajo_servicioaprendizaje";   
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

 

  


