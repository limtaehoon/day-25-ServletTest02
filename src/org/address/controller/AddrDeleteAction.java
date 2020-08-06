package org.address.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.address.model.SAddressDAO;



public class AddrDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(request.getParameter("num"));
		SAddressDAO dao = SAddressDAO.getInstance();
		dao.addressDelete(num);
		response.sendRedirect("list.do");
		
	}

}
