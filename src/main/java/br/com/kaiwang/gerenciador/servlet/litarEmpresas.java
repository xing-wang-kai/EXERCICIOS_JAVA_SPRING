package br.com.kaiwang.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(urlPatterns="/listempresas")
public class litarEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res){
		try {
			
			ArrayEmpresas empresas = new ArrayEmpresas();
			
			ArrayList<Empresa> todasEmpresas =  (ArrayList<Empresa>) empresas.getEmpresas();
			
			RequestDispatcher rd = req.getRequestDispatcher("/ListarEmpresa.jsp");
			req.setAttribute("empresas", todasEmpresas);
			rd.forward(req, res);
			
		}catch(Exception err) {
			System.out.println("err: " + err);
		}
		
	}


}
