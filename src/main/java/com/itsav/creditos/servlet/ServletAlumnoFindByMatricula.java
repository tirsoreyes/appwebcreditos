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
import com.itsav.creditos.ejb.EjbUsuario;
import com.itsav.creditos.ejbinterface.IEjbAlumno;
import com.itsav.creditos.ejbinterface.IEjbUsuario;
import com.itsav.creditos.entity.TAlumno;
import com.itsav.creditos.jb.JbTAlumno;
import com.itsav.creditos.jb.JbTCarrera;
import com.itsav.creditos.jb.Sesion;


/**
 * Servlet implementation class ServletAlumnoFindByMatricula
 */
@WebServlet("/ServletAlumnoFindByMatricula")
public class ServletAlumnoFindByMatricula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEjbAlumno iEjbAlumno;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlumnoFindByMatricula() {
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
		TicketHelper th = new TicketHelper();
		// control de sesion
		 
		 HttpSession session = request.getSession();
		 Sesion jbSesion= (Sesion) session.getAttribute("session");
		 //
		
		
	
		TAlumno tAlumno = iEjbAlumno.findByMatricula(request.getParameter("Matricula"));
		
		JbTAlumno jbAlumno=new JbTAlumno();
		
		if(jbSesion!=null && tAlumno!=null){
			
				JbTCarrera jbCarrera = new JbTCarrera();
			
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
			
			
		}else if (jbSesion==null){
			jbAlumno.setMatricula("-1");
			
		}
		
		
		try(PrintWriter out = response.getWriter()){
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(jbAlumno);
			System.out.println(jsonInString);
			out.print(jsonInString);
		}
	}

}
