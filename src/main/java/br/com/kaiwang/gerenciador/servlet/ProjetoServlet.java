package br.com.kaiwang.gerenciador.servlet;

import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/user")
public class ProjetoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			PrintWriter out = res.getWriter();
			
			String nome = req.getParameter("nome");
			
			out.println("<html>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<body>");
			out.println("<h1>");
			out.println("Imprimindo " + nome + " conteúdo web");
			out.println("</h1>");
			out.println("</body>");
			out.println("</html>");
		}catch(Exception Err) {
			System.out.println(Err);
		}
		
		
	}
}
