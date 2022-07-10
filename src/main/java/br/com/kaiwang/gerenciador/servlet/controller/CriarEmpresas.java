package br.com.kaiwang.gerenciador.servlet.controller;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CriarEmpresas {
	public static String acction(HttpServletRequest request, HttpServletResponse response) {
		try {
			String nome = request.getParameter("nome");
			Empresa empresa = new Empresa(nome);
			
			DataBase.add(empresa);
			
			request.setAttribute("empresa", empresa.getNome());
			
			return "Forward:/novaEmpresa.jsp";
			
		}catch(Exception err) {
			return "Forward:/Error.jsp";
		}
	}
}
