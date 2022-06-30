package br.com.kaiwang.gerenciador.servlet.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayEmpresas {
	
	private static List<Empresa> empresa = new ArrayList<>();
	
	public ArrayEmpresas() {
		
	}
	public static void add(Empresa empresa)
	{
		ArrayEmpresas.empresa.add(empresa);
	}
	public List<Empresa> getEmpresas() {
		return ArrayEmpresas.empresa;
	}
	public Empresa getEmpresa(Integer valor) {
		return empresa.get(valor);
	}
	public void removeById(int id) {
		for(Empresa empresas: empresa) {
			if( empresas.getId() == id) {
				ArrayEmpresas.empresa.remove(empresas);
			}
		}
		
	}
}
