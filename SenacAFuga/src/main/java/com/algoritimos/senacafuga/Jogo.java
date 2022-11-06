package com.algoritimos.senacafuga;

import static com.algoritimos.senacafuga.DesafioTres.desafioTres;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Jogo {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String resposta, ver, escolha;
		List<String> bolsa = new ArrayList<String>();
		
		/* Inicio do Jogo */
		resposta = Historia.historiaInicial();
		SalvarArquivo.gerarArquivo(resposta);
		System.out.println("História gravada no arquivo");
		
		System.out.println(resposta);
		
		
		/* Descrição e escolha dos personagens */	
		resposta = Personagens.descricao();
		System.out.println(resposta);

		System.out.println("Escolha a sua classe: ");
		String personagem = input.next().toUpperCase();
		
		resposta = Personagens.classe(personagem);
		System.out.println(resposta);
				
		ver = input.next().toUpperCase();
		bolsa = Bolsa.bolsa(personagem, ver, null);
		System.out.println(bolsa);
		
		
		
		  // Desafios
		  
			/*
			 * DesafioUm.desafioUm(personagem); DesafioDois.desafioDois(personagem);
			 * DesafioTres.desafioTres(personagem); DesafioQuatro.desafioQuatro(personagem);
			 */
			/* Desafio Cinco */
		
		
		
		
		
		DesafioUm desafioUm = new DesafioUm();
		
		resposta = Historia.historiaDesafioUm();
		System.out.println(resposta);
		
		desafioUm.parteUm();
		desafioUm.parteDois(personagem);
		desafioUm.parteTres();
		
                
                
                DesafioTres desafioTres = new DesafioTres();
                
		resposta = Historia.historiaDesafioTres();
                
                desafioTres(personagem);
                desafioTres.alojamento();
                desafioTres.escolha();
                desafioTres.cozinha();
                desafioTres.fim();
                
                
		resposta = Historia.historiaDesafioQuatro(personagem);
		SalvarArquivo.gerarArquivo(resposta);
		escolha = input.next().toUpperCase();
		
		resposta = DesafioQuatro.primeiraParte(personagem, escolha);
		System.out.println(resposta);
		escolha = input.next().toUpperCase();
		
		
		
		resposta = DesafioQuatro.segundaParte(escolha);
		System.out.println(resposta);
		escolha = input.next().toUpperCase();
		
		System.out.println("Digite \"ver\" para olhar os itens da sua bolsa");
		ver = input.next().toUpperCase();
		
		resposta = DesafioQuatro.terceiraParteFicar();
		escolha = input.next().toUpperCase();
		
		DesafioQuatro.retaFinal(escolha);
		
		String subir;
		do {
			resposta = "Digite \"Subir\" para subir na jangada e ir para o mar ";
			subir = input.next().toUpperCase();

			resposta = "Parabéns você conseguiu passar por todas as fases e se tornou O PATRULHEIRO DO MAR !!!";
			Credito.credito(true);

		} while (subir != "SUBIR");
	}
}
