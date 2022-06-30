package br.com.kaiwang.gerenciador.servlet.controller;

import br.com.kaiwang.gerenciador.servlet.models.ArrayEmpresas;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditarPegarDados {
	public static void acction(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ENTROU NA ROTA EDITAR");
		try {
			
			String reqID = request.getParameter("id");
			Integer id = Integer.parseInt(reqID);
			
			ArrayEmpresas empresas = new ArrayEmpresas();
			
			Empresa empresa = empresas.getEmpresa(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("/editarEmpresas.jsp");
			request.setAttribute("empresa", empresa);
			rd.forward(request, response);
			
		}catch(Exception err) {
			System.out.println("ERROR: " + err.getMessage());
		}
		
		
	}
}
