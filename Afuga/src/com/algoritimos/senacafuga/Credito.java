package com.algoritimos.senacafuga;

public class Credito {
	
public static String credito(boolean conquista) throws Exception {
		String resposta =  null;
		if (conquista == true) {
			Arquivo.lerArquivo("Afuga\\src\\falas\\Creditos\\Creditostrue.txt");
		} 
		if (conquista == false){
			Arquivo.lerArquivo("Afuga\\src\\falas\\Creditos\\Creditosfalse.txt");
		}
		return resposta;
	}
}
