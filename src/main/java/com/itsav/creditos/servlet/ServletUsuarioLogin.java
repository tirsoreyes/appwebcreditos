package com.itsav.creditos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;

import com.itsav.creditos.appwebcreditos.TicketHelper;
import com.itsav.creditos.ejb.EjbUsuario;
import com.itsav.creditos.ejbinterface.IEjbUsuario;
import com.itsav.creditos.jb.Sesion;


/**
 * Servlet implementation class ServletUsuarioLogin
 */
@WebServlet("/ServletUsuarioLogin")
public class ServletUsuarioLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEjbUsuario iEjbUsuario;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuarioLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("usuario/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/x-json");
		iEjbUsuario = new EjbUsuario();
		
		TicketHelper th = new TicketHelper();
		iEjbUsuario.getByUsuario(request.getParameter("txtUsuarioLogin"));
		Map<String, String> returnMap = iEjbUsuario.login(request.getParameter("txtContrasenaLogin"));
		
		if("true".equals(returnMap.get("correcto"))){
			HttpSession httpsession = request.getSession();
			Sesion jbSesion = new Sesion();
			
			jbSesion.setApellidoMaterno(iEjbUsuario.getUsuario().getApellidoMaterno());
			jbSesion.setApellidoPaterno(iEjbUsuario.getUsuario().getApellidoPaterno());
			jbSesion.setEmail(iEjbUsuario.getUsuario().getEmail());
			jbSesion.setFechaAlta(th.DatetoString(iEjbUsuario.getUsuario().getFechaAlta()));
			jbSesion.setGrupo(iEjbUsuario.getUsuario().getTGrupo().getTipo());
			jbSesion.setIdUsuario(iEjbUsuario.getUsuario().getIdUsuario());
			jbSesion.setNombre(iEjbUsuario.getUsuario().getNombre());
			jbSesion.setSiglas(iEjbUsuario.getUsuario().getSiglas());
			jbSesion.setUsuario(iEjbUsuario.getUsuario().getUsuario());
			
			httpsession.setAttribute("session", jbSesion);
		
		}
		try(PrintWriter out = response.getWriter()){
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(returnMap);
			System.out.println(jsonInString);
			out.print(jsonInString);
		}
	}

}
