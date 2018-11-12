package pe.edu.upeu.sprintemplate.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
  
//import pe.edu.upeu.sprintemplate.daoImp.EspecialidadDaoImp;
//import pe.edu.upeu.sprintemplate.daoImp.GradosDaoImp;
//import pe.edu.upeu.sprintemplate.daoImp.InstitucionDaoImp;    

@Controller            
public class HomeControllerExpediente {
	   
	
	                          
	
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
	public String actualizacion() {

		return "Legajo_actua";
	}

	@GetMapping("/docpersonal")
	public String dospersonall() {

		return "Legajo_docpersonal";
	}

	@GetMapping("/gra")  
	public String gradosytitulos() {
		return "Legajo_gradostitulos";     
	}
 
	@GetMapping("/investi")
	public String investigaciones() {

		return "Legajo_investigacion";
	}
   
	@GetMapping("/exten")
	public String extensiones123() {

		return "Legajo_extension";
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
