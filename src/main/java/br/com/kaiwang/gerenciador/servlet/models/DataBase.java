package br.com.kaiwang.gerenciador.servlet.models;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	private static List<Empresa> empresa = new ArrayList<>();
	private static List<User> user = new ArrayList<>();
	
	public DataBase() {
		Empresa e1 = new Empresa("SamSung");
		Empresa e2 = new Empresa("Motorola");
		Empresa e3 = new Empresa("Apple");
		
		empresa.add(e1);
		empresa.add(e3);
		empresa.add(e2);
		
		User u1 = new User("teste", "123456");
		User u2 = new User("teste2", "123456");
		User u3 = new User("kaiwang", "123456");
		user.add(u1);
		user.add(u2);
		user.add(u3);
		
	}
	public static void add(Empresa empresa)
	{
		DataBase.empresa.add(empresa);
	}
	public List<Empresa> getEmpresas() {
		return DataBase.empresa;
	}
	public Empresa getEmpresa(int valor) {
		
		List<Empresa> empresas = this.getEmpresas();
		for(Empresa empresa: empresas){
			if(empresa.getId() == valor) {
				return empresa;
			}
		}
		return null;
	}
	public void removeById(int id) {
		
		List<Empresa> empresas = this.getEmpresas();
		empresas.forEach((empresa) -> {
			if(empresa.getId() == id) {
				empresas.remove(empresa);
			}
		});		
	}
	public User existUser(String login, String senha) {
		for(User use: user) {
			if(use.ehIgual(login, senha)) {
				return use;
			}
			else {
				return null;
			}
		}
		return null;
	}
}
