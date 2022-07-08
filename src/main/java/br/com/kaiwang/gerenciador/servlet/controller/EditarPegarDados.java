package br.com.kaiwang.gerenciador.servlet.controller;

import java.util.List;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditarPegarDados {
	public static String acction(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ENTROU NA ROTA EDITAR");
		try {
			
			String reqID = request.getParameter("id");
			Integer id = Integer.parseInt(reqID);
			
			DataBase empresas = new DataBase();
			List<Empresa> empress = empresas.getEmpresas();
			empress.forEach(empresa->{
				System.out.println("EMPRESA: " + empresa);
			});
			System.out.println("TENTOU LOCALIZAR EMPRESA");
			Empresa empresa = empresas.getEmpresa(id);
			System.out.println("Empresa Localizada: " + empresa);
			
			request.setAttribute("empresa", empresa);
			
			return "Forward:/editarEmpresas.jsp";
			
		}catch(Exception err) {
			System.out.println("ERROR: " + err.getMessage());
			return "Forward:/Error.jsp";
		}
		
		
	}
}
