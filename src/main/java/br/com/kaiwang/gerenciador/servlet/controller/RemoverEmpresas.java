package br.com.kaiwang.gerenciador.servlet.controller;

import br.com.kaiwang.gerenciador.servlet.models.ArrayEmpresas;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoverEmpresas {
	public static String acction(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("ENTROU NESSA ROTA DE REMOVER EMPRESA");
		try {
			
			System.out.println("ENTROU NESSA ROTA DE TRY");
			String getId = request.getParameter("id");
			Integer id = Integer.parseInt(getId);
			System.out.println("O id informado e: " + id);
			
			ArrayEmpresas empresa = new ArrayEmpresas();
			empresa.removeById(id);
			
			return "Redirect:entrada?acction=listarEmpresas";
			
		}catch(Exception err) {
			System.out.println("ERROR MESSAGE: " + err.getMessage());
			System.out.println("ERROR MESSAGE: " + err.hashCode());
			System.out.println("ERROR MESSAGE: " + err.getCause());
			System.out.println("ERROR MESSAGE: " + err.getStackTrace());
			System.out.println("ERROR MESSAGE: " + err.getSuppressed());
			return "Forward:/Error.jsp";
		}
		
		
	}
}
