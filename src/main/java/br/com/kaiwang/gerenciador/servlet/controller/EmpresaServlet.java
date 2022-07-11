package br.com.kaiwang.gerenciador.servlet.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import br.com.kaiwang.gerenciador.servlet.models.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/empresasjson")
public class EmpresaServlet extends HttpServlet{
	@Override
	public void service( HttpServletRequest Request, HttpServletResponse response) throws ServletException, IOException{
		try {
			
			ArrayList<Empresa> empresas = (ArrayList<Empresa>) new DataBase().getEmpresas();
			Gson gson = new Gson();
			String json = gson.toJson(empresas);
			
			response.setContentType("application/json");			
			response.getWriter().print(json);
			
		}catch(Exception error) {
			
		}
	}
}
