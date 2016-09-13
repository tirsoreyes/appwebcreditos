package com.itsav.creditos.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.persistence.services.jboss.JBossRuntimeServices;

import com.itsav.creditos.ejb.EjbAlumno;
import com.itsav.creditos.ejb.EjbCarrera;
import com.itsav.creditos.ejb.EjbUsuario;
import com.itsav.creditos.ejbinterface.IEjbAlumno;
import com.itsav.creditos.ejbinterface.IEjbCarrera;
import com.itsav.creditos.ejbinterface.IEjbUsuario;
import com.itsav.creditos.entity.TAlumno;
import com.itsav.creditos.entity.TCarrera;
import com.itsav.creditos.jb.JbTAlumno;
import com.itsav.creditos.jb.JbTCarrera;
import com.itsav.creditos.jb.Sesion;


/**
 * Servlet implementation class ServletUsuarioFindAll
 */
@WebServlet("/ServletCarreraFindAll")
public class ServletCarreraFindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEjbCarrera iEjbCarrera;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCarreraFindAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/x-json");
	
		iEjbCarrera = new EjbCarrera();
		// control de sesion
		 
		 HttpSession session = request.getSession();
		 Sesion jbSesion= (Sesion) session.getAttribute("session");
		 //
		
		List<TCarrera> listaCarreras = iEjbCarrera.findAll();
		List <JbTCarrera> jbCarreras = new ArrayList<JbTCarrera>();
		
		try(PrintWriter out = response.getWriter()){
		
		if(jbSesion!=null && listaCarreras!=null){
			
			for(TCarrera tCarrera:listaCarreras){
				JbTCarrera jbCarrera=new JbTCarrera();
				jbCarrera.setIdCarrera(tCarrera.getIdCarrera());
				jbCarrera.setNombre(tCarrera.getNombre());
				
				jbCarreras.add(jbCarrera);
			}
			
			
		}else if(jbSesion==null){
			JbTCarrera jbCarrera = new JbTCarrera();
			jbCarrera.setIdCarrera(-1);
			jbCarreras.add(jbCarrera);
			
		}
		
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(jbCarreras);
			System.out.println(jsonInString);
			out.print(jsonInString);
		}
	}

}
