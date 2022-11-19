package com.algoritimos.senacafuga;

import java.util.Scanner;

public class Menu {

	private static Scanner input = new Scanner(System.in);
	public static void menuInicial() throws Exception {
		
		int acao;
		
		do {
			
			System.out.println( "\nEscolha uma opcao numerica\n"
								+ "\n1 - NOVO JOGO\n"
								+ "2 - CONTINUAR \n"
								+ "3 - RANKING \n"
								+ "4 - SAIR \n");
			
			acao = input.nextInt();
			
			if(acao == 1) {
				
				Personagem personagem = new Personagem();
				System.out.println("Digite o seu nome");
				String nome = input.next();
				personagem.setNome(nome);
				
				System.out.println("Escolha a sua classe\n");
				
				System.out.println("1 - Guerreiro\n"
				          + "2 - Assassino\n"
						  + "3 - Magico");
				int classe = input.nextInt();
				do {
					
					switch(classe) {
					case 1:
						personagem.setClasse("GUERREIRO");
						personagem.setPontoForte("Armamento");
						System.out.println("Adicionamos a sua opcao\n");
						break;
					case 2:
						personagem.setClasse("ASSASSINO");
						personagem.setPontoForte("Facas");
						System.out.println("Adicionamos a sua opcao\n");
						break;
					case 3:
						personagem.setClasse("MAGICO");
						personagem.setPontoForte("Magia");
						System.out.println("Adicionamos a sua opcao\n");
						break;
					default:
						System.out.println("tente novamente");
					}
					
				} while(classe != 1 && classe != 2 && classe != 3);
								
				//adicionar o salvar arquivo
				
				DesafioUm.parteUm(personagem.getNome());
				DesafioDois.desafioDois(personagem.getNome());
				
				
			} else if(acao == 2) {
				
				//adicionar leitura de arquivo salvo
				//se tudo der errado o continuar vai ser a partir de alguma fase
				
			} else if(acao == 3) {
				
				//Adicionar ranking
				
			} else if(acao == 4) {
				
				System.out.println("Muito obrigado!");
				System.exit(0);
				
			} 
			
		} while(acao == 3);
		
	}
}
