package com.algoritimos.senacafuga;

import java.util.Scanner;

public class DesafioQuatro {

	private static Scanner input = new Scanner(System.in);
	
	public static void historiaDesafioQuatro(String user, String personagem) throws Exception {
		Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\historia.txt");
		String opcao = input.next().toUpperCase();
		primeiraParte(opcao, personagem, user);
	}
	
	public static void primeiraParte(String opcao, String personagem, String user) throws Exception {
		
			String subir;
			if(opcao.equals("CORRER")) {
				Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\primeiraParteCorrer.txt");
				subir = input.next().toUpperCase();
				if(subir.equals("SUBIR")) {
					segundaParte(subir, personagem, user);
				}
			} else if(opcao.equals("FICAR")) {
				Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\primeiraParteFicar.txt");
				verBolsa(personagem, user);
				segundaParte("FICAR", personagem, user);
			}
	}
	
	public static void segundaParte(String opcao, String personagem, String user) throws Exception {
		
		if(opcao.equals("SUBIR")) {
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteCorrer.txt");
			
			terceiraParteVerBolsa("CORRER", "SUBIR", user);

		} else if (opcao.equals("FICAR")) {
			terceiraParteVerBolsa(opcao, null, user);
			
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\segundaParteFicar2.txt");
			String ultimaFase = input.next().toUpperCase();
			retaFinal(ultimaFase, personagem, user);
		}
	}

	public static void terceiraParteVerBolsa(String opcao, String ver, String user) throws Exception {
		
		if (opcao.equals("CORRER") && ver.equals("SUBIR")) {
			
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\terceiraParteVerBolsaCorrer.txt");
			Credito.credito(false, user);
			
		} else if(opcao.equals("FICAR") || ver.equals("VER")){
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\terceiraParteverBolsaFicar.txt");
		}
	}
	
	public static void retaFinal(String opcao, String persoangem, String user) throws Exception {

		switch (opcao) {
		case "COMBATE":
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\retaFinalCombate.txt");
			segundaParte("SUBIR", persoangem, user);
			break;

		case "CONFIAR":
			Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\retaFinalConfiar.txt");
			Credito.credito(true, user);
			break;		
		}
	}
	
	public static void verBolsa(String personagem, String user) throws Exception {
		String ver;
		
		Arquivo.lerArquivo("C:\\Users\\" + user + "\\Senac-AFuga\\Afuga\\src\\falas\\DesafioQuatro\\verBolsa.txt");
		ver = input.next().toUpperCase();
		
			if(ver.equals("VER")) {
				Bolsa.bolsa(personagem, ver, null);
			}else {
				System.out.println("Opcao errada, tente novamente");
			}
	}
}

