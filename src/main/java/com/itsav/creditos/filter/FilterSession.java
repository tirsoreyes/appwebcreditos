package com.itsav.creditos.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FilterSession
 */
@WebFilter("/menu")
public class FilterSession implements Filter {

    /**
     * Default constructor. 
     */
    public FilterSession() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		HttpSession httpSession = httpServletRequest.getSession();
		String urlRequest = httpServletRequest.getRequestURI().toString();
		if (!urlRequest.endsWith("ServletUsuarioLogin") && httpSession.getAttribute("usuario") == null) {
			httpServletResponse.sendRedirect("ServletUsuarioLogin");
		} else {
			//httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
			//httpServletResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		//	httpServletResponse.setDateHeader("Expires", 0); // Proxies.
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
