package br.com.kaiwang.gerenciador.servlet.controller;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/editarEmpresa")
public class EditarEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			DataBase empresas = new DataBase();
		
			String nome = request.getParameter("nome");
			String reqID = request.getParameter("id");
			Integer id = Integer.parseInt(reqID);
			
			Empresa empresa = empresas.getEmpresa(id);
			empresa.setNome(nome);
			
			response.sendRedirect("entrada?acction=listarEmpresas");
		}catch(Exception err) {
			System.out.println("ERROR: " + err.getMessage());
		}
	}
}
