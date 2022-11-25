package com.algoritimos.senacafuga;
import java.util.ArrayList;
import java.util.List;

public class Bolsa {

	public static List<String> bolsa(String classe, String ver, String obj) {

		//refatorar bolsa tbm
		List<String> bolsa = new ArrayList<String>();
		bolsa.add("\n Canivete");
		bolsa.add("\n Sinalizador");
		bolsa.add("\n Lanterna");
		bolsa.add("\n Kit Primeiros Socorros");

		if (ver.equals("VER") && classe.equals("GUERREIRO")) {
			bolsa.add("\n Espada");
			System.out.println(bolsa);
		} else if (ver.equals("VER") && classe.equals("MAGICO")) {
			bolsa.add("\n Livro de magia");
			System.out.println(bolsa);
		} else if (ver.equals("VER") && classe.equals("ASSASSINO")) {
			bolsa.add("\n Espada");
			System.out.println(bolsa);
		}
		
		if (ver.equals("ADICIONAR"))
			bolsa.add(obj);
		
		return bolsa;
	}
}