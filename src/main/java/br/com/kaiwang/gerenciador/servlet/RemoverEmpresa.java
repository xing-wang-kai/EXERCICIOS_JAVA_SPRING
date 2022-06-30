package br.com.kaiwang.gerenciador.servlet;

import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/removerEmpresa")
public class RemoverEmpresa extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			String IDString = request.getParameter("id");
			int id = Integer.parseInt(IDString);
			System.out.println("id: " + id);
			
			ArrayEmpresas empresas = new ArrayEmpresas();
			empresas.removeById(id);
			response.sendRedirect("listempresas");
			
		}catch(Exception err) {
			System.out.println("ERRO: " + err);
		}
	}
}
