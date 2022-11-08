package com.algoritimos.senacafuga;
import java.util.Scanner;

public class DesafioDois {

	private static Scanner input = new Scanner(System.in);
	public static void desafioDois(String personagem) {
		String opcoes;
		int num = 0;
		boolean menu = false;

		do {
			opcoes = input.next().toUpperCase();

			switch (opcoes) {
			case "DICA":
				System.out.println("Some o numero 130 por ele mesmo que voce saber� o numero do container");
				num = input.nextInt();
				break;

			case "NAO":
				System.out.println("Digite sua resposta:");
				num = input.nextInt();
				break;

			case "AJUDA":
				System.out.println("\n Como dito no enunciado do desafio, o n�mero do seu container � 260. Divida o mesmo por 2 e some mais 3!");
				System.out.println("Talvez a fome tenha te deixado confuso, n�o e t�o dif�cil assim");
				System.out.println("Digite sua resposta: \n");
				num = input.nextInt();
				break;
			}

			switch (num) {
			case 133:
				System.out.println("Resposta correta!");
				menu = true;
				acertou(personagem);
				break;
			default:
				System.out.println("Tente novamente");
				break;
			}

		} while (!menu);
	}
	
	public static void acertou(String personagem) {
		String ver, desatar;

		do {

			System.out.println("\n Pronto! Giovanni foi localizado com um n� em seus pulsos."
					+ "Para desatar esse n�, pegue o canivete que est� na sua mochila e corte o n�. \n");
			System.out.println("Digite \"ver\" para ver a bolsa e pegar o canivete na mochila"); 
			ver = input.next().toUpperCase();
                        
                       
			if (ver.equals("VER")) {
				Bolsa.bolsa(personagem, ver, null);
				System.out.println("\n Agora voce esta com o canivete na mao");	
			}
		} while (ver.equals("null"));
		 
		do {
			System.out.println("Digite \"DESATAR\" para desatar o no");
			desatar = input.next().toUpperCase();
			if (desatar.equals("DESATAR")) {
				System.out.println("Pronto! No desatado. Parabens!");
			}

		} while (!desatar.equals("DESATAR"));               
	}
}
