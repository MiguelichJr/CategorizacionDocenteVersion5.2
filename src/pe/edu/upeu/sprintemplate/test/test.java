package pe.edu.upeu.sprintemplate.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upeu.sprintemplate.dao.EspecialidadDao;
import pe.edu.upeu.sprintemplate.dao.GradosDao;
//import pe.edu.upeu.sprintemplate.dao.EspecialidadDao;
//import pe.edu.upeu.sprintemplate.dao.GradosDao;
import pe.edu.upeu.sprintemplate.dao.InstitucionDao;
import pe.edu.upeu.sprintemplate.dao.UsuarioDao;
import pe.edu.upeu.sprintemplate.daoImp.UsuarioDaoImp;
//import pe.edu.upeu.sprintemplate.dao.UsuarioDao;
   
public class test {
  
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bd/root-context.xml");
		System.out.println(context);
		/*RolDao dao = (RolDao)context.getBean("rolDaoImp");*/
		//UsuarioDao dao=(UsuarioDao)context.getBean("usuarioDao", UsuarioDaoImp.class);                     
		//InstitucionDao dao=(InstitucionDao)context.getBean("institucionDao");
		//GradosDao dao=(GradosDao)context.getBean("gradoDao");   
		//EspecialidadDao dao=(EspecialidadDao)context.getBean("especialidadDao");
		//System.out.println(dao.update(new Rol(13, "camote")));   
		        
       //List<Map<String, Object>> lista = dao.readAll();

       // for(Map<String,Object> map:lista) {
        	//System.out.println(map.get("iduser")+"/"+map.get("nom_user")+"/"+map.get("clave")+"/"+map.get("persona_idpers"));
        //	System.out.println(map.get("idint")+"/"+map.get("nombre_institucion")); 
        //}                            
        //Rol rr = dao.read(14);
        //System.out.println("Error: "+rr.getNomrol());  
        //  dao.delete(3);     
		//System.out.println(dao.readAll());        
        context.close();    
	}     	   
	      
	
		
}
 