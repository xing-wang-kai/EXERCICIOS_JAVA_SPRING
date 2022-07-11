package br.com.kaiwang.gerenciador.servlet.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CriarEmpresas {
	public static String acction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String date = request.getParameter("data");
		
			System.out.println("data: " + date);
			
			//Date Simpledate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(date);
			//String dataAbertura = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Simpledate);
			
			//System.out.println(Simpledate);
			//System.out.println(dataAbertura);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date data = sdf.parse(date);
			
			Empresa empresa = new Empresa(nome);
			empresa.setData(data);
			
			DataBase.add(empresa);
			
			request.setAttribute("empresa", empresa.getNome());
			
			return "Forward:/novaEmpresa.jsp";
			
		}catch(Exception err) {
			
			request.setAttribute("error", err);
			return "Forward:/Error.jsp";
		}
	}
}
