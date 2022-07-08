package br.com.kaiwang.gerenciador.servlet.controller;

import java.io.IOException;

import br.com.kaiwang.gerenciador.servlet.models.DataBase;
import br.com.kaiwang.gerenciador.servlet.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login {
	public static String acction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		String login = request.getParameter("login");
		String senha = request.getParameter("password");
		
		DataBase array = new DataBase();
		User usuario = array.existUser(login, senha);
		
		if(usuario != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acction=listarEmpresas";
		}
		else {
			return "redirect:entrada?acction=formNovoUser";
		}
		
	}
}
