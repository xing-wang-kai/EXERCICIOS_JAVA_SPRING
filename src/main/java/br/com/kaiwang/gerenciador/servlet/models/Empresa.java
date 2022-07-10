package br.com.kaiwang.gerenciador.servlet.models;

import java.util.Date;
import java.util.Locale;

public class Empresa {
	private int id;
	private String nome;
	private static int idValor;
	private Date data = new Date();
	
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
	public Date getData() {
		return this.data;
	}
	
	private void setId(int valor) {
		this.id = valor;
	}
	
	public void setNome(String valor) {
		this.nome = valor;
	}
	
	public void setData(Date valor) {
		this.data = valor;
	}
	
	@Override
	public String toString() {
		return String.format(new Locale("pt", "BR"), "{ \n Empresas: {\n    id: %d \n    nome: %s \n } \n", this.id, this.nome);
	}
}
