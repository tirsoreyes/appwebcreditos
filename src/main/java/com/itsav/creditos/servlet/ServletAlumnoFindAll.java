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
import com.itsav.creditos.ejb.EjbUsuario;
import com.itsav.creditos.ejbinterface.IEjbAlumno;
import com.itsav.creditos.ejbinterface.IEjbUsuario;
import com.itsav.creditos.entity.TAlumno;
import com.itsav.creditos.jb.JbTAlumno;
import com.itsav.creditos.jb.Sesion;


/**
 * Servlet implementation class ServletUsuarioFindAll
 */
@WebServlet("/ServletUsuarioFindAll")
public class ServletAlumnoFindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEjbAlumno iEjbAlumno;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlumnoFindAll() {
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
	
		iEjbAlumno = new EjbAlumno();
		// control de sesion
		 
		 HttpSession session = request.getSession();
		 Sesion jbSesion= (Sesion) session.getAttribute("session");
		 //
		
		
	
		List<TAlumno> listaAlumnos = iEjbAlumno.findAll();
		List <JbTAlumno> jbAlumnos = new ArrayList<JbTAlumno>();
		
		if(jbSesion!=null && listaAlumnos!=null){
			
			for(TAlumno tAlumno:listaAlumnos){
				JbTAlumno jbAlumno=new JbTAlumno();
				
				// falta agregar datos
				
				jbAlumnos.add(jbAlumno);
			}
			
			
		}
		try(PrintWriter out = response.getWriter()){
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(returnMap);
			System.out.println(jsonInString);
			out.print(jsonInString);
		}
	}

}
