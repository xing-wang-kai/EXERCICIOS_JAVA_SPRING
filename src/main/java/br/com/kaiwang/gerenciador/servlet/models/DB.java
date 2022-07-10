package br.com.kaiwang.gerenciador.servlet.models;

import java.util.ArrayList;
import java.util.List;

public class DB {
	private static List<EmpresaDb> empresasDb = new ArrayList<>();
	private static List<UsersDB> usersDB = new ArrayList<>();
	
	public DB() {
		EmpresaDb e1 = new EmpresaDb("SamSung");
		EmpresaDb e2 = new EmpresaDb("motorola");
		empresasDb.add(e1);
		empresasDb.add(e2);
		
		UsersDB u1 = new UsersDB("Gabriel", "Gabriel", "123456");
		UsersDB u2 = new UsersDB("carolina", "Carolina", "123456");
		usersDB.add(u1);
		usersDB.add(u2);
	}
}
