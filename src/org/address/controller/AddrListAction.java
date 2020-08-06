package org.address.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.address.model.SAddressDAO;
import org.address.model.SAddressDTO;



public class AddrListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		SAddressDAO dao = SAddressDAO.getInstance();
		int count = dao.addressCount();
	  ArrayList<SAddressDTO> arr =dao.addressList();
	  request.setAttribute("listArr", arr);
	  request.setAttribute("count", count);
	  
	  
	  RequestDispatcher rd 
	          = request.getRequestDispatcher("list.jsp");
	  rd.forward(request, response);
		
	}

}
