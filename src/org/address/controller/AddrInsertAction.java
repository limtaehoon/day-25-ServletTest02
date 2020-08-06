package org.address.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.address.model.SAddressDAO;
import org.address.model.SAddressDTO;



public class AddrInsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		SAddressDTO dto = new SAddressDTO();
		dto.setAddr(request.getParameter("addr"));
		dto.setName(request.getParameter("name"));
		dto.setTel(request.getParameter("tel"));
		dto.setZipcode(request.getParameter("zipcode"));
		SAddressDAO dao = SAddressDAO.getInstance();
		dao.insertAddress(dto);
		response.sendRedirect("list.ad");
		
	}
}
