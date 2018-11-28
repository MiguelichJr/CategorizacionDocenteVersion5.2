package pe.edu.upeu.sprintemplate.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.sprintemplate.daoImp.CategoriaDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.PersonaDaoImpl;
import pe.edu.upeu.sprintemplate.daoImp.convocatoriaDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.designar_EvaluadoresDaImp;
import pe.edu.upeu.sprintemplate.daoImp.docente_convocatoriaDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.instrumentoDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.preguntasDaoImp;
import pe.edu.upeu.sprintemplate.daoImp.seccionesDaoImp;
import pe.edu.upeu.sprintemplate.entity.Convocatoria;
import pe.edu.upeu.sprintemplate.entity.designar_evaluacion;
import pe.edu.upeu.sprintemplate.entity.docente_convocatoria;
import pe.edu.upeu.sprintemplate.entity.instrumento;
import pe.edu.upeu.sprintemplate.entity.secciones;
import pe.edu.upeu.sprintemplate.entity.preguntas;


@Controller
public class HomeControllerConvocatoria {
	
	@Autowired
	private seccionesDaoImp sd;
	@Autowired
	private preguntasDaoImp pres;
	
	@Autowired
	private designar_EvaluadoresDaImp deed;
	
	@Autowired
	private docente_convocatoriaDaoImp ds;
	@Autowired
	private CategoriaDaoImp categoriaDao;
	@Autowired
	private instrumentoDaoImp ip;
	@Autowired
	private convocatoriaDaoImp cdp;
	
	@Autowired
	private PersonaDaoImpl personaS;
	
	@GetMapping("/Crear_Convocatoria")       	
	public ModelAndView act() {	
	ModelAndView nw=new ModelAndView();
	nw.addObject("list",cdp.mostrarTodo());
	nw.setViewName("Crear_Convocatoria");
	return nw;
	}
	
	
//	@GetMapping("/designar_evaluadores")
//	public ModelAndView designar_eva() {
//		ModelAndView ma = new ModelAndView();
//		ma.addObject("esta",ds.readl());
//		ma.addObject("lista",ip.readAll());
//		ma.addObject("oooo",deed.read());
//		ma.addObject("evalua",personaS.buscarDocenEvalua());
//		return ma;
//	}
	
	// Convocatoria
	@RequestMapping(path = "/guardarConvocatoria", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String guardarDocente(HttpServletRequest request){
		String fecha_inicio=request.getParameter("fecha_inicio");
		String fecha_fin=request.getParameter("fecha_fin");
		String perido=request.getParameter("perido");
		String nombre=request.getParameter("nombre");
		String Fecha_inici_legajo=request.getParameter("Fecha_inici_legajo");
		String fecha_fin_legajo=request.getParameter("fecha_fin_legajo");
		Convocatoria d=new Convocatoria(fecha_inicio,fecha_fin,perido,nombre,Fecha_inici_legajo,fecha_fin_legajo);
		Gson g = new Gson();
		return g.toJson(cdp.create(d));
	}
	
	
	
	//Seleccionar Docentes
	
	@GetMapping("/selec_docente")
	public ModelAndView Listar_Docente() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("selec_docente");
		ma.addObject("entra",personaS.buscarDocenEvalua());
		ma.addObject("esta",cdp.readid());
		ma.addObject("cate",categoriaDao.list());
		ma.addObject("lista",ds.readl());
	return ma;
	}
	
	
	//Listar Docentes
		@RequestMapping(path = "/ListarDocentes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		@GetMapping("/selec_docente")
		public @ResponseBody String Listar_Docente_json() {
			Gson g = new Gson();
			
		return g.toJson(ds.readl());
		}
	
		
		@RequestMapping(path ="/guardarDocen_Convoca", method= RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody String guardarSelecDoce(HttpServletRequest request) {
			String Regimen_Docente = request.getParameter("regimen_docen");
			int idconvocatoria=Integer.parseInt(request.getParameter("idconvocatoeri"));
			int idcategoria=Integer.parseInt(request.getParameter("idcategoria"));
			int idpersona=Integer.parseInt(request.getParameter("idPersona"));
			docente_convocatoria ns=new docente_convocatoria(Regimen_Docente,idconvocatoria,idcategoria,idpersona);
			System.out.println("Controller:");
			Gson g=new Gson();
			return g.toJson(ds.create(ns));
		}
		
		//Eliminar evaluador	
				@RequestMapping(path = "/eliminarDoncetes", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
				public @ResponseBody String eliminarSelecion(HttpServletRequest request) {
			        int idn = Integer.parseInt(request.getParameter("id_secciones"));
			        System.out.println(idn);
					Gson g = new Gson();
					return g.toJson(ds.delete(idn));
				}
		
//Designar Evaluadores
		
		
	@GetMapping("/designar_evaluadores")
	public ModelAndView designar_eva() {
		ModelAndView ma = new ModelAndView();
		ma.addObject("esta",ds.readl());
		ma.addObject("lista",ip.readAll());
		ma.addObject("oooo",deed.read());
		ma.addObject("evalua",personaS.buscarDocenEvalua());
		return ma;
	}
	@RequestMapping(path ="/guardarEvaluadores", method= RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String Asignarconvo(HttpServletRequest request) {
		String puntaje = request.getParameter("");
		int iddocente=Integer.parseInt(request.getParameter("iddocente"));
		int Nombre_evaludor=Integer.parseInt(request.getParameter("Nombre_evaludor"));
		int Nombre_plan=Integer.parseInt(request.getParameter("Nombre_plan"));
		designar_evaluacion ns=new designar_evaluacion(puntaje,iddocente,Nombre_evaludor,Nombre_plan);
		System.out.println("Controller:");
		Gson g=new Gson();
		return g.toJson(deed.create(ns));
	}
	
	@RequestMapping(path = "/listarDesignadores", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/designar_evaluadores")
	public @ResponseBody String Listar_designar_json() {
		Gson g = new Gson();
		
	return g.toJson(deed.read());
	}
	
	//Eliminar evaluador	
	@RequestMapping(path = "/eliminarevaluador", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String eliminarevaludor(HttpServletRequest request) {
        int idn = Integer.parseInt(request.getParameter("id_secciones"));
        System.out.println(idn);
		Gson g = new Gson();
		return g.toJson(deed.delete(idn));
	}
	
	
	//Instrumentos
	
	@GetMapping("/instrumento")
	public ModelAndView Listar_Instrumento() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("instrumento");
		ma.addObject("esta",cdp.readid());
		ma.addObject("lista",ip.readAll());
		ma.addObject("lista_areglar", ip.readAll());
		return ma;
	}
	
	@RequestMapping(path = "/guardarIntrumentos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String guardarInstrumento(HttpServletRequest request){
		String nombre_plantilla=request.getParameter("nombre_plantilla");
		String tipo=request.getParameter("tipo");
		String porcentaje=request.getParameter("porcentaje");
		int idconvoca=Integer.parseInt(request.getParameter("idconvoca"));
		instrumento nu=new instrumento(nombre_plantilla,tipo,porcentaje,idconvoca);
		Gson g = new Gson();
		return g.toJson(ip.create(nu));
	}
	
	@RequestMapping(path = "/listarInstrumento", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/instrumento")
	public @ResponseBody String Listar_instrumento_json() {
		Gson g = new Gson();
	return g.toJson(ip.readAll());
	}
	
	@GetMapping("/buscar/{idinstrumento}")
	public ModelAndView BuscarSecciones(Model model, @PathVariable("idinstrumento") int idinstr) {
		System.out.println("Entraste a secciones");
		System.out.println(idinstr);
		instrumento u=new instrumento();
		//		instrumento u=ip.read(idinstr);
		u=ip.read(idinstr);
		ModelAndView ma = new ModelAndView("Secciones","command",u);
		ma.addObject("lista",sd.readl(idinstr));
		System.out.println(u);
		return  ma;
	}
	@GetMapping("editarSumill/{idinstrumento}")
	public ModelAndView instrumento_as(Model model, @PathVariable("idinstrumento") int idinstrumento) {
		System.out.println("Entraste a editar");
		System.out.println(idinstrumento);
		System.out.println("");
		instrumento in=new instrumento();
		in=ip.read(idinstrumento);
		ModelAndView ma = new ModelAndView("editInstrumento","command",in);
	return ma;
	}
	@PostMapping("/editarSumill/GuardarEditarInstrumento")
	public ModelAndView updateInstrumento(HttpServletRequest s) {
		System.out.println("update isntrumento");
		instrumento op=new instrumento();
		op.setNombre_plantilla(s.getParameter("nombre_plantilla"));
		op.setTipo(s.getParameter("tipo"));
		op.setPorcentaje(s.getParameter("porcentaje"));
		op.setIdinstrumento(Integer.parseInt(s.getParameter("idinstrumento")));
		ModelAndView vd=new ModelAndView("redirect:/instrumento");
		ip.update(op);
		return vd;
		
	}
	
	//Eliminar evaluador	
		@RequestMapping(path = "/eliminarinstrumento", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody String eliminarIntrumento(HttpServletRequest request) {
	        int idn = Integer.parseInt(request.getParameter("id_secciones"));
	        System.out.println(idn);
			Gson g = new Gson();
			return g.toJson(ip.delete(idn));
		}

	
	//Secciones
	@PostMapping("/buscar/guardarSecciones")
	public ModelAndView  vista(HttpServletRequest r) {
		secciones op=new secciones();
		op.setIdinstrumento(Integer.parseInt(r.getParameter("idinstrumento")));
		op.setNombre(r.getParameter("nombre"));
		op.setPorcentaje(r.getParameter("porcentaje"));
		op.setTipo(r.getParameter("tipo"));
		op.setValor_maximo(r.getParameter("valor_maximo"));
		System.out.println("entraste otra");
		int as=op.getIdinstrumento();
		System.out.println("Es el idinstrumento: "+as);
		ModelAndView modelAndView =  new ModelAndView("redirect:/buscar/"+as);
		modelAndView.addObject("secciones",op);
		sd.create(op);
		return modelAndView;
	}

	//Eliminar Secciones	
		@RequestMapping(path = "/eliminar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody void eliminarSecciones(HttpServletRequest request) {
			System.out.println("si llega");      
	        //int idn = Integer.parseInt(request.getParameter("id_secciones"));
	        //System.out.println(idn);
			//Gson g = new Gson();     
			//return g.toJson(sd.delete(idn));
			
		}    
	
	@GetMapping("buscar/updatesec/{idseccion}")
	public ModelAndView updateSeccion(Model model, @PathVariable("idseccion") int idseccion) {
		System.out.println("update secciones");
		secciones u=new secciones();
		u=sd.read(idseccion);
		System.out.println(u);
		ModelAndView ma = new ModelAndView("editSecciones","command",u);
		return ma;
	}
	
	@PostMapping("/buscar/updatesec/GurdarSecc")
		public ModelAndView updateSecci(HttpServletRequest s) {
		System.out.println("guardar el upadate");
		secciones u=new secciones();
		u.setNombre(s.getParameter("nombre"));
		u.setPorcentaje(s.getParameter("porcentaje"));
		u.setTipo(s.getParameter("tipo"));
		u.setValor_maximo(s.getParameter("valor_maximo"));
		u.setIdinstrumento(Integer.parseInt(s.getParameter("idinstrumento")));
		u.setIdsc(Integer.parseInt(s.getParameter("idsc")));
		int idinstru =u.getIdinstrumento();
		sd.update(u);
		ModelAndView ma = new ModelAndView("redirect:/buscar/"+idinstru);
		return ma;	
	}
	@GetMapping("/Secciones")
	public String viguia() {
		
		return "Secciones";
	}
	
	
	
	//Preguntas
	
	@GetMapping("buscar/buscarPreg/updatepreguntas/{idpreguntas}")
	public ModelAndView readpreguna(Model model, @PathVariable("idpreguntas") int idpreguntas) {
		System.out.println("ENTRAR A PREGUNTAS");
		preguntas p=new preguntas();
		p=pres.read(idpreguntas);
		System.out.println(p);		
		ModelAndView os=new ModelAndView("editItems","command",p);
		return os;
	
	}
	
	@PostMapping("/buscar/buscarPreg/updatepreguntas/updatepr")
	public ModelAndView updatePreguntas(HttpServletRequest s) {
		System.out.println("Entraste al update preguntas");
		preguntas n=new preguntas();
		n.setIdpreguntas(Integer.parseInt(s.getParameter("idpreguntas")));
		n.setDescripcion(s.getParameter("descripcion"));
		n.setValor_maximo(s.getParameter("valor_maximo"));
		n.setIdsecciones(Integer.parseInt(s.getParameter("idsecciones")));
		int p=n.getIdsecciones();
		pres.update(n);
		ModelAndView ma=new ModelAndView("redirect:/buscar/buscarPreg/"+p);
		return ma;
	}
	
	
	@GetMapping("/buscar/buscarPreg/{idseccion}")
	public ModelAndView preguntas(Model model, @PathVariable("idseccion") int ideseccion) {
		System.out.println("Entraste a preguntas");
		System.out.println(ideseccion);
		secciones se=new secciones();
		se=sd.read(ideseccion);
		System.out.println(se);
		ModelAndView ma = new ModelAndView("Item","command",se);
		ma.addObject("lista",pres.readlist(ideseccion));
		System.out.println(pres.readlist(ideseccion));
		return ma;
	}
	
	@PostMapping("/buscar/buscarPreg/GuardarPreguntas")
	public ModelAndView  preguntas_s(HttpServletRequest rs) {
		System.out.println("Enntrastes preguntas .|.");
		preguntas op=new preguntas();
		op.setIdsecciones(Integer.parseInt(rs.getParameter("idsc")));
		op.setDescripcion(rs.getParameter("descripcion"));
		op.setValor_maximo(rs.getParameter("valor_maximo"));
		System.out.println("entraste otra");
		int as=op.getIdsecciones();
		System.out.println(op.getDescripcion());
		System.out.println(op.getValor_maximo());
		System.out.println(as);
		System.out.println("----------------------------------------------------");
		ModelAndView modelAndView =  new ModelAndView("redirect:/buscar/buscarPreg/"+as);
		modelAndView.addObject("item",op);
		pres.create(op);
		return modelAndView;
	}
	
	
	@GetMapping("/Item")
	public String preguns() {
		return "Item";
	}
	       
}    
