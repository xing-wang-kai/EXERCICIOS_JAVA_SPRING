package br.com.kaiwang.gerenciador.servlet.router;

import br.com.kaiwang.gerenciador.servlet.controller.CriarEmpresas;
import br.com.kaiwang.gerenciador.servlet.controller.EditarPegarDados;
import br.com.kaiwang.gerenciador.servlet.controller.ListarEmpresas;
import br.com.kaiwang.gerenciador.servlet.controller.RemoverEmpresas;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/entrada")
public class EmpresaRouter extends HttpServlet {
	/**
	 * METODO ROUTER DO MVC - ESTE METODO É RESPONSÁVEL POR COLETAR OS DADOS
	 * E REDIRECIONAR AS ROTAS PARA O CONTROLLER DA APLICAÇÃO.
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println("ENTROU NA ROTA ENTRADA >>>");
			String acction = request.getParameter("acction");
			
			if(acction.equals("listarEmpresas")) {
				
				ListarEmpresas.acction(request, response);
				
			}else if(acction.equals("listarEmpresaId")) {
				
			}else if(acction.equals("criarEmpresa")) {
				
				CriarEmpresas.acction(request, response);
				
			}else if(acction.equals("editarEmpresa")) {
				
				EditarPegarDados.acction(request, response);
				
			}else if(acction.equals("removerEmpresa")) {
		
				RemoverEmpresas.acction(request, response);
			}
			
		}catch(Exception err) {
			System.out.println("ERR MESSAGEM: " + err.getMessage());
		}
	}
}
