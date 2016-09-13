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
import com.itsav.creditos.jb.JbTAlumno;
import com.itsav.creditos.jb.JbTCarrera;
import com.itsav.creditos.jb.Sesion;


/**
 * Servlet implementation class ServletAlumnoInsert
 */
@WebServlet("/ServletAlumnoUpdate")
public class ServletAlumnoUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEjbAlumno iEjbAlumno;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlumnoUpdate() {
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
		Map<String,String> resultMap = new HashMap<String,String>();
		
		// control de sesion
		 
		 HttpSession session = request.getSession();
		 Sesion jbSesion= (Sesion) session.getAttribute("session");
		
		 //
		 try(PrintWriter out = response.getWriter()){
	
		TAlumno tAlumno = iEjbAlumno.findByMatricula(request.getParameter("txtMatricula"));
		
		
		if(jbSesion!=null && tAlumno!=null){
			
			
			
			
			iEjbAlumno.getAlumno().setApellidoPaterno(request.getParameter("txtPaterno"));
			iEjbAlumno.getAlumno().setApellidoMaterno(request.getParameter("txtMaterno"));
			iEjbAlumno.getAlumno().setNombre(request.getParameter("txtNombre"));
			iEjbAlumno.getAlumno().setSistema(request.getParameter("txtSistema"));
			iEjbAlumno.getAlumno().setEmail(request.getParameter("txtEmail"));
			iEjbAlumno.getAlumno().setEstatus(request.getParameter("txtStatus"));
			iEjbAlumno.getAlumno().setSexo(request.getParameter("txtSexo"));
			resultMap = iEjbAlumno.update();
			
			
		}else if (jbSesion==null){
			resultMap.put("resultado", "false");
			resultMap.put("mensaje", "-1");
		}else if(tAlumno==null){
			resultMap.put("resultado", "false");
			resultMap.put("mensaje", "Error en la matrícula");
			
		}
		
		
		
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(resultMap);
			System.out.println(jsonInString);
			out.print(jsonInString);
		}
	}

}
