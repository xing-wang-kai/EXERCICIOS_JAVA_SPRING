package br.com.kaiwang.gerenciador.servlet;

import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/userstest")
public class TestedeClass extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void getPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			pw.println("");
			String nome = req.getParameter("nome");
			RequestDispatcher rd = req.getRequestDispatcher("./.jsp");
			rd.forward(req, res);
			
		}catch(Exception err) {
			System.out.println("error: " + err);
		}
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			
		}catch(Exception err) {
			System.out.println("error: " + err);
		}
	}
}
