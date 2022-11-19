package com.algoritimos.senacafuga;

import java.util.Scanner;

public class DesafioQuatro {
	private static String resposta;
	// private static String user = "\\robso\\workspace\\";
	private static String user = "\\isabe\\OneDrive\\Documentos\\";
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
						
					}
				} while(!subir.equals("SUBIR"));
					
				
				
				break;
			case "FICAR":
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\primeiraParteFicar.txt");
				break;
			default:
				resposta = "Opção errada";
			}
		} while (!opcao.equals("CORRER") || !opcao.equals("FICAR"));
		return resposta;
	}
	
	public static void segundaParte(String opcao) throws Exception {
		
		if (opcao.equals("CORRER")) {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteCorrer.txt");
			String resposta = input.next().toUpperCase();
			if(resposta.equals("SUBIR")) {
				Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteCorrer2.txt");
			}

		} else if (opcao.equals("FICAR")) {
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteFicar.txt");
			String ver = input.next().toUpperCase();
			//adicionar metodo verbolsa
			terceiraParteVerBolsa(opcao, ver);
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteFicar.txt");
			String ultimaFase = input.next().toUpperCase();
			retaFinal(ultimaFase);
		}
	}

	public static void terceiraParteVerBolsa(String opcao, String ver) throws Exception {
		if (opcao.equals("CORRER") || ver.equals("VER")) {
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

		case "CONFIAR":
			Arquivo.lerArquivo("C:\\Users" + user + "Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\retaFinalConfiar.txt");
			break;
		}
	}
}
