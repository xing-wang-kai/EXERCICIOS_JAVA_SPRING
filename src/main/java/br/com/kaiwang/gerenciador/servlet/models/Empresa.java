package br.com.kaiwang.gerenciador.servlet.models;

import java.util.Locale;

public class Empresa {
	private int id;
	private String nome;
	private static int idValor;
	
	public Empresa(String nome) {
		this.setId(idValor);
		this.setNome(nome);
		idValor++;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	private void setId(int valor) {
		this.id = valor;
	}
	
	public void setNome(String valor) {
		this.nome = valor;
	}
	
	@Override
	public String toString() {
		return String.format(new Locale("pt", "BR"), "{ \n Empresas: {\n    id: %d \n    nome: %s \n } \n", this.id, this.nome);
	}
}
