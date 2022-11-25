package com.algoritimos.senacafuga;

public class Credito {
	
public static String credito(boolean conquista, String user) throws Exception {
		String resposta =  null;
		if (conquista == true) {
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\com\\algoritimos\\senacafuga\\Creditos\\Creditostrue.txt");
		} 
		if (conquista == false){
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\com\\algoritimos\\senacafuga\\Creditos\\Creditosfalse.txt");
		}
		return resposta;
	}
}
