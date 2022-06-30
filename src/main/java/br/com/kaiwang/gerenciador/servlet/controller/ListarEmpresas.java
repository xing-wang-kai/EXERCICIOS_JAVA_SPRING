package br.com.kaiwang.gerenciador.servlet.controller;

import java.util.List;

import br.com.kaiwang.gerenciador.servlet.models.ArrayEmpresas;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListarEmpresas {
	public static void acction(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			ArrayEmpresas empresas = new ArrayEmpresas();
			List<Empresa> todasEmpresas = empresas.getEmpresas();
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListarEmpresa.jsp");
			request.setAttribute("empresas", todasEmpresas);
			rd.forward(request, response);
			
		}catch(Exception err) {
			System.out.println("{");
			System.out.println("ERROR MESSAGE: " + err.getMessage());
			System.out.println("ERROR CAUSE: " + err.getCause());
			System.out.println("}");
			
		}
	}
}
