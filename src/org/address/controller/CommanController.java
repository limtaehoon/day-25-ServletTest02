package org.address.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommanController
 */
@WebServlet("*.ad")
public class CommanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command 
		    = RequestURI.substring(contextPath.length());
	
		if(command.equals("/insert.ad")) {
			new AddrInsertAction().execute(request, response);
		}if(command.equals("/insertForm.ad")) {
			new AddrInsertFormAction().execute(request, response);
		}else if(command.equals("/list.ad")) {
			new AddrListAction().execute(request, response);
		}else if(command.equals("/detail.ad")) {
			new AddrDetailAction().execute(request, response);
		}else if(command.equals("/delete.ad ")) {
			new AddrDeleteAction().execute(request, response);
		}else if(command.equals("/update.ad")) {
			new AddrUpdateAction().execute(request, response);
		}else if(command.equals("/search.ad.ad")) {
			new AddrSearchAction().execute(request, response);
		}else if(command.equals("/zipform.ad")) {
			new AddrZipFormAction().execute(request, response);
		}else if(command.equals("/zip.ad")) {
			new AddrZipCodeAction().execute(request, response);
		}
		
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
