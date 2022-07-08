package br.com.kaiwang.gerenciador.servlet.controller;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/entrada")
public class ControllerFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain next)
			throws IOException, ServletException {
		Long antes = System.currentTimeMillis();
		
		String acction = request.getParameter("acction");
		
		next.doFilter(request, response);
		
		Long depois = System.currentTimeMillis();
		
		System.out.println("ROTA: " + acction +  " TEMPO EXECUÇÃO: " + (depois - antes));
		
	}

}
