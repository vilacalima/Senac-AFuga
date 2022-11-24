package com.algoritimos.senacafuga;

import java.util.Scanner;

public class DesafioQuatro {
	private static String resposta;

	private static Scanner input = new Scanner(System.in);
	
	public static void historiaDesafioQuatro(String user) throws Exception {
		Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\historia.txt");
		String opcao = input.next().toUpperCase();
		primeiraParte(opcao, user);
	}
	
	public static String primeiraParte(String opcao, String user) throws Exception {
		
		do {
			switch (opcao) {
			case "CORRER":
				String subir;
				do {
					Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\primeiraParteCorrer.txt");
					subir = input.next().toUpperCase();
					if(subir.equals("SUBIR")) {
						segundaParte(subir, user);
					}
				} while(!subir.equals("SUBIR"));
				break;
				
			case "FICAR":
				Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\primeiraParteFicar.txt");
				verBolsa(user);
				segundaParte("FICAR", user);
				break;
			default:
				resposta = "Opção errada";
			}
		} while (!opcao.equals("CORRER") || !opcao.equals("FICAR"));
		return resposta;
	}
	
	public static void segundaParte(String opcao, String user) throws Exception {
		
		if(opcao.equals("SUBIR")) {
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteCorrer.txt");
			verBolsa(user);
			terceiraParteVerBolsa("CORRER", "SUBIR", user);
				
			
			
		} else if (opcao.equals("FICAR")) {
			verBolsa(user);
			terceiraParteVerBolsa(opcao, null, user);
			
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteFicar2.txt");
			String ultimaFase = input.next().toUpperCase();
			retaFinal(ultimaFase, user);
		}
	}

	public static void terceiraParteVerBolsa(String opcao, String ver, String user) throws Exception {
		
		if (opcao.equals("CORRER") && ver.equals("SUBIR")) {
			
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\terceiraParteVerBolsaCorrer.txt");
			Credito.credito(false);
			
		} else if(opcao.equals("FICAR") || ver.equals("VER")){
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\terceiraParteverBolsaFicar.txt");
		}
	}
	
	public static void retaFinal(String opcao, String user) throws Exception {

		switch (opcao) {
		case "COMBATE":
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\retaFinalCombate.txt");
			segundaParte("CORRER", user);
			break;

			//chamar Credito
		case "CONFIAR":
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\retaFinalConfiar.txt");
			break;
			
			//chamar Credito
		}
	}
	
	public static void verBolsa(String user) throws Exception {
		String ver;
		
		do {
			
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\verBolsa.txt");
			ver = input.next().toUpperCase();
			
			//chamar bolsa
			
		} while(!ver.equals("VER"));
	}
}

