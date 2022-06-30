package br.com.kaiwang.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			String nome = req.getParameter("nome");
			
			Empresa empresa = new Empresa(nome);
			
			ArrayEmpresas empresas = new ArrayEmpresas();
			empresas.add(empresa);
			
			RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresa.jsp");
			req.setAttribute("empresa", empresa.getNome());
			rd.forward(req, res);
			
		}catch(Exception err) {
			System.out.println("error: 1 " + err);
		}
	}
}
