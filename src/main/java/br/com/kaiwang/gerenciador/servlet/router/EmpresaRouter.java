package br.com.kaiwang.gerenciador.servlet.router;

import br.com.kaiwang.gerenciador.servlet.controller.CriarEmpresas;
import br.com.kaiwang.gerenciador.servlet.controller.EditarPegarDados;
import br.com.kaiwang.gerenciador.servlet.controller.ListarEmpresas;
import br.com.kaiwang.gerenciador.servlet.controller.RemoverEmpresas;
import jakarta.servlet.RequestDispatcher;
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
			
			String ROTASJSP = null;
			
			System.out.println("ENTROU NA ROTA ENTRADA >>>");
			String acction = request.getParameter("acction");
			
			if(acction.equals("listarEmpresas")) {
				
				ROTASJSP = ListarEmpresas.acction(request, response);
				
			}else if(acction.equals("listarEmpresaId")) {
				
			}else if(acction.equals("criarEmpresa")) {
				
				ROTASJSP = CriarEmpresas.acction(request, response);
				
			}else if(acction.equals("editarEmpresa")) {
				
				ROTASJSP = EditarPegarDados.acction(request, response);
				
			}else if(acction.equals("removerEmpresa")) {
				System.out.println("ENTROU EM REMOVER EMPRESA");
				ROTASJSP = RemoverEmpresas.acction(request, response);
			}
			
			String[] ForwardERedirect = ROTASJSP.split(":");
			if(ForwardERedirect[0].equals("Forward")) {
				RequestDispatcher rd = request.getRequestDispatcher(ForwardERedirect[1]);
				rd.forward(request, response);

			}
			else {
				response.sendRedirect(ForwardERedirect[1]);
			}
			
		}catch(Exception err) {
			System.out.println("ERR MESSAGEM: " + err.getMessage());
		}
	}
}
