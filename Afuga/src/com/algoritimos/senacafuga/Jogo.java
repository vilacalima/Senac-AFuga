package com.algoritimos.senacafuga;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo a nossa aventura \n" 
						+ "Voce esta no nosso menu");
		
		System.out.println("Insira a pasta onde esta salvo o jogo");
		String user = input.next();
	
//		isabe\\OneDrive\\Documentos
//		robso\\workspace
//		robson.vlima3\\workspace
//		nicolas.cmarques\\Desktop
//		acer\\Desktop
		Menu.menuInicial(user);
		Menu.menuInicial(user);
		
		
	}
}
