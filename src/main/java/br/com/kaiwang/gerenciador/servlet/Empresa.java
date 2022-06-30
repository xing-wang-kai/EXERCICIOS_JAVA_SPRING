package br.com.kaiwang.gerenciador.servlet;

public class Empresa {
	private int id;
	private String nome;
	private static int idValor = 1;
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
	public int getTotal() {
		return Empresa.idValor;
	}
	private void setId(int valor) {
		this.id = valor;
	}
	public void setNome(String valor) {
		this.nome = valor;
	}
	@Override
	public String toString() {
		return "[Empresa: id) " + this.id + ", nome) " + this.nome + " ]";
	}
}
