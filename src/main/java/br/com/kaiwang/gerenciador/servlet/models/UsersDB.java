package br.com.kaiwang.gerenciador.servlet.models;

import java.util.Locale;

public class UsersDB {
	private String nome;
	private String login;
	private String password;
	
	public UsersDB(String nome, String login, String password) {
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getLogin() {
		return this.login;
	}
	public String getPassword() {
		return this.password;
	}
	
	public void getNome(String valor) {
		this.nome = valor;
	}
	public void getLogin(String valor) {
		this.login = valor;
	}
	public void getPassword(String valor) {
		this.password = valor;
	}
	
	public Boolean logar(String login, String password) {
		
		if(this.login.equals(login) && this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return String.format(new Locale("pt", "BR"), "{ nome: %s, login: %s, password: %s }", this.getNome(), this.getLogin(), this.getPassword());
	}
}
