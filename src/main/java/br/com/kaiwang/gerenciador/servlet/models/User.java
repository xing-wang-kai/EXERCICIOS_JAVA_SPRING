package br.com.kaiwang.gerenciador.servlet.models;

import java.util.Locale;

public class User {
	private String login;
	private String senha;
	public User(String login, String senha) {
		this.setLogin(login);
		this.setSenha(senha);
	}
	public String getLogin() {
		return this.login;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setLogin(String valor) {
		this.login = valor;
	}
	public void setSenha(String valor) {
		this.senha = valor;
	}
	public Boolean ehIgual(String login, String senha) {
		if(this.senha.equals(senha) && this.login.equals(login)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return String.format(new Locale("pt", "BR"), "{/n LOGIN: %s /n SENHA: %s /n }", this.login, this.senha);
	}
}
