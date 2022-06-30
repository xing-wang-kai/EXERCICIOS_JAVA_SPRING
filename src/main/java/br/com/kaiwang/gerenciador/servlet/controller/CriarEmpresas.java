package br.com.kaiwang.gerenciador.servlet.controller;

import br.com.kaiwang.gerenciador.servlet.models.ArrayEmpresas;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CriarEmpresas {
	public static void acction(HttpServletRequest request, HttpServletResponse response) {
		try {
			String nome = request.getParameter("nome");
			Empresa empresa = new Empresa(nome);
			
			ArrayEmpresas.add(empresa);
			
			RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresa.jsp");
			request.setAttribute("empresa", empresa.getNome());
			rd.forward(request, response);
			
		}catch(Exception err) {
			System.out.println("MESSAGE: " + err.getMessage());
		}
		
		
	}
}
