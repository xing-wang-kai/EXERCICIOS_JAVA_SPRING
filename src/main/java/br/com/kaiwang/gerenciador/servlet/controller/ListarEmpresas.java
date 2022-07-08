package br.com.kaiwang.gerenciador.servlet.controller;

import java.io.IOException;
import java.util.List;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListarEmpresas {
	public static String acction(HttpServletRequest request, HttpServletResponse response) 
								throws ServletException, IOException 
	{
		try {
			
			DataBase empresas = new DataBase();
			List<Empresa> todasEmpresas = empresas.getEmpresas();
			request.setAttribute("empresas", todasEmpresas);
			
			return "Forward:/ListarEmpresa.jsp";
			
		}catch(Exception err) {
			request.setAttribute("error", err);
			
			return "Forward:/Error.jsp";
			
		}
	}
}
