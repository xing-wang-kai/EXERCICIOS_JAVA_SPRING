package br.com.kaiwang.gerenciador.servlet.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormNovoUser {

	public static String acction(HttpServletRequest request, HttpServletResponse Response)
			throws ServletException, IOException {
		return "Forward:/formLogin.jsp";
	}
}
