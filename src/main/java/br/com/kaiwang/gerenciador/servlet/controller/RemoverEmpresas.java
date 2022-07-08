package br.com.kaiwang.gerenciador.servlet.controller;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoverEmpresas {
	public static String acction(HttpServletRequest request, HttpServletResponse response) {

		try {
			
			String getId = request.getParameter("id");
			Integer id = Integer.parseInt(getId);
			DataBase empresa = new DataBase();
			
			empresa.removeById(id);
	
			return "Forward:/ListarEmpresa.jsp";
			
		}catch(Exception err) {
			request.setAttribute("error", err);
			return "Forward:/Error.jsp";
		}
		
		
	}
}
