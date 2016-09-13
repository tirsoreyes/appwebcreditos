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

import com.itsav.creditos.appwebcreditos.TicketHelper;
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
 * Servlet implementation class ServletAlumnoByCarrera
 */
@WebServlet("/ServletAlumnoByCarrera")
public class ServletAlumnoByCarrera extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEjbAlumno iEjbAlumno;
	private IEjbCarrera iEjbCarrera;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlumnoByCarrera() {
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
		iEjbCarrera = new EjbCarrera();
		
		TicketHelper th = new TicketHelper();
		// control de sesion
		 
		 HttpSession session = request.getSession();
		 Sesion jbSesion= (Sesion) session.getAttribute("session");
		 //
		
		 TCarrera tCarrera = iEjbCarrera.findById(request.getParameter("idCarrera"));
		 
		
		List<JbTAlumno> jbAlumnos=new ArrayList<JbTAlumno>();
		
		if(jbSesion!=null && tCarrera!=null){
			List<TAlumno> tAlumnos = tCarrera.getTAlumnos();
			
			 for(TAlumno tAlumno:tAlumnos){
				 
				 JbTCarrera jbCarrera = new JbTCarrera();
				 JbTAlumno jbAlumno = new JbTAlumno();
					
					jbCarrera.setIdCarrera(tAlumno.getTCarrera().getIdCarrera());
					jbCarrera.setNombre(tAlumno.getTCarrera().getNombre());
					
					jbAlumno.setTCarrera(jbCarrera);
					jbAlumno.setSistema(tAlumno.getSistema());
					jbAlumno.setMatricula(tAlumno.getMatricula());
					jbAlumno.setApellidoPaterno(tAlumno.getApellidoPaterno());
					jbAlumno.setApellidoMaterno(tAlumno.getApellidoMaterno());
					jbAlumno.setNombre(tAlumno.getNombre());
					jbAlumno.setEmail(tAlumno.getEmail());
					jbAlumno.setEstatus(tAlumno.getEstatus());
					jbAlumno.setSexo(tAlumno.getSexo());
					jbAlumno.setLiberado(tAlumno.getLiberado());
					if(tAlumno.getFechaLiberacion()!=null)
					jbAlumno.setFechaLiberacion(th.DatetoString(tAlumno.getFechaLiberacion()));
			 
				 
				 jbAlumnos.add(jbAlumno);
			 }
			
					
			
		}else if (jbSesion==null){
			JbTAlumno jbAlumno = new JbTAlumno();
			jbAlumno.setMatricula("-1");
			jbAlumnos.add(jbAlumno);
			
		}
		
		
		try(PrintWriter out = response.getWriter()){
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(jbAlumnos);
			System.out.println(jsonInString);
			out.print(jsonInString);
		}
	}

}
