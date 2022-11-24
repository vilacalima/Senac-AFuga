package com.algoritimos.senacafuga;

import java.util.Scanner;

public class DesafioQuatro {
	private static String resposta;
//	 private static String user = "\\robso\\workspace\\";
//	private static String user = "\\isabe\\OneDrive\\Documentos\\";
	private static String user = "\\robson.vlima3\\workspace\\";
	private static Scanner input = new Scanner(System.in);
	
	public static void historiaDesafioQuatro() throws Exception {
		Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\historia.txt");
		String opcao = input.next().toUpperCase();
		primeiraParte(opcao);
	}
	
	public static String primeiraParte(String opcao) throws Exception {
		
		do {
			switch (opcao) {
			case "CORRER":
				String subir;
				do {
					Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\primeiraParteCorrer.txt");
					subir = input.next().toUpperCase();
					if(subir.equals("SUBIR")) {
						segundaParte(subir);
					}
				} while(!subir.equals("SUBIR"));
				break;
				
			case "FICAR":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\primeiraParteFicar.txt");
				verBolsa();
				segundaParte("FICAR");
				break;
			default:
				resposta = "Opção errada";
			}
		} while (!opcao.equals("CORRER") || !opcao.equals("FICAR"));
		return resposta;
	}
	
	public static void segundaParte(String opcao) throws Exception {
		
		if(opcao.equals("SUBIR")) {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteCorrer.txt");
			verBolsa();
			terceiraParteVerBolsa("CORRER", "SUBIR");
				
			
			
		} else if (opcao.equals("FICAR")) {
			verBolsa();
			terceiraParteVerBolsa(opcao, null);
			
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteFicar2.txt");
			String ultimaFase = input.next().toUpperCase();
			retaFinal(ultimaFase);
		}
	}

	public static void terceiraParteVerBolsa(String opcao, String ver) throws Exception {
		
		if (opcao.equals("CORRER") && ver.equals("SUBIR")) {
			
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\terceiraParteVerBolsaCorrer.txt");
			Credito.credito(false);
			
		} else if(opcao.equals("FICAR") || ver.equals("VER")){
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\terceiraParteverBolsaFicar.txt");
		}
	}
	
	public static void retaFinal(String opcao) throws Exception {

		switch (opcao) {
		case "COMBATE":
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\retaFinalCombate.txt");
			segundaParte("CORRER");
			break;

			//chamar Credito
		case "CONFIAR":
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\retaFinalConfiar.txt");
			break;
			
			//chamar Credito
		}
	}
	
	public static void verBolsa() throws Exception {
		String ver;
		
		do {
			
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\verBolsa.txt");
			ver = input.next().toUpperCase();
			
			//chamar bolsa
			
		} while(!ver.equals("VER"));
	}
}

