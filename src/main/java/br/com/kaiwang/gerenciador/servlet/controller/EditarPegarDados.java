package br.com.kaiwang.gerenciador.servlet.controller;

import br.com.kaiwang.gerenciador.servlet.models.ArrayEmpresas;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditarPegarDados {
	public static String acction(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ENTROU NA ROTA EDITAR");
		try {
			
			String reqID = request.getParameter("id");
			Integer id = Integer.parseInt(reqID);
			
			ArrayEmpresas empresas = new ArrayEmpresas();
			
			Empresa empresa = empresas.getEmpresa(id);
			
			request.setAttribute("empresa", empresa);
			
			return "Forward:/editarEmpresas.jsp";
			
		}catch(Exception err) {
			System.out.println("ERROR: " + err.getMessage());
			return "Forward:/Error.jsp";
		}
		
		
	}
}
