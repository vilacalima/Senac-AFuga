package com.algoritimos.senacafuga;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Menu {

	private static Scanner input = new Scanner(System.in);

	/**
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public static void menuInicial() throws Exception {

		int acao;

		String fases =  Arquivo.lerArquivoSemPrint("Afuga\\fases.txt");
		
//		String fases =  Arquivo.lerArquivoSemPrint(".\fases.txt");
		
		do {

			System.out.println("\nEscolha uma opcao numerica\n"
					+ "\n1 - NOVO JOGO\n"
					+ "2 - RANKING \n"
					+ "3 - SAIR \n");

			acao = input.nextInt();

			if (acao == 1) {

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

					switch (classe) {
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

				} while (classe != 1 && classe != 2 && classe != 3);

				// Aqui se inicia a contagem de tempo
				Long tempoInicio = System.currentTimeMillis();

				DesafioUm.parteUm(personagem.getNome());
				DesafioDois.desafioDois(personagem.getNome());
				DesafioTres.desafioTres(personagem.getNome());
				DesafioQuatro.historiaDesafioQuatro(personagem.getClass().toString());
				
				// Aqui finaliza a contagem de tempo
				Long tempoFim = System.currentTimeMillis();
				long tempoExecucao = (tempoFim - tempoInicio);
				int tempoExecucaoFinal = (int) (tempoExecucao / 1000);
				System.out.println("Voce finalizou o jogo em " + tempoExecucao / 1000 + " segundos");
				
				Arquivo.gerarArquivo();
				
				File arquivo = new File("Afuga/fases.txt");
				FileWriter salvar = new FileWriter(arquivo);
				BufferedWriter escrever = new BufferedWriter(salvar);
								
				escrever.write(fases + "\n" + Integer.toString(tempoExecucaoFinal));
				escrever.close();
				salvar.close();
				
			} else if (acao == 2) {

				System.out.println("Confira o Nosso Ranking, voce consegue finalizar em menos segundo ?");
								
				FileReader fr = new FileReader("Afuga\\fases.txt");
				BufferedReader br = new BufferedReader(fr);
				
				ArrayList<Integer> ranking = new ArrayList();
				
				//Não conseguimos ordenar o arquivo dentro de um vetor e com o array não funcionava
				// então usamos o sort para ordenar
				while (br.ready()) {
					//lê a proxima linha
					int linha = Integer.parseInt(br.readLine());
					ranking.add(linha);
				}
				
				ranking.sort(null);
				
				System.out.println(ranking);
				
				br.close();
				fr.close();
				

			} else if (acao == 3) {

				System.out.println("Muito obrigado!");
				System.exit(0);

			}

		} while (acao == 2);

	}

}
