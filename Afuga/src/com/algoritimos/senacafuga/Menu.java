package com.algoritimos.senacafuga;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class Menu {

	private static Scanner input = new Scanner(System.in);

	/**
	 * @throws Exception
	 */
	public static void menuInicial() throws Exception {

		int acao;

		do {

			System.out.println("\nEscolha uma opcao numerica\n"
					+ "\n1 - NOVO JOGO\n"
					+ "2 - CONTINUAR \n"
					+ "3 - RANKING \n"
					+ "4 - SAIR \n");

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

				// adicionar o salvar arquivo

				// Aqui se inicia a contagem de tempo
				Long tempoInicio = System.currentTimeMillis();

				DesafioUm.parteUm(personagem.getNome());
				DesafioDois.desafioDois(personagem.getNome());
				DesafioTres.desafioTres(personagem.getNome());

				DesafioQuatro.historiaDesafioQuatro();
				


				// Aqui finaliza a contagem de tempo
				Long tempoFim = System.currentTimeMillis();
				long tempoExecucao = (tempoFim - tempoInicio);
				System.out.println("Voce finalizou o jogo em " + tempoExecucao / 1000 + " segundos");

				File file = new File("Novo Diretorio");
				file.mkdir();

				File arquivo = new File("Novo Diretorio/Arquivo.txt");
				try {
					arquivo.createNewFile();

				} catch (IOException e) {

					e.printStackTrace();
				}

				FileWriter salvar = new FileWriter(arquivo);

				// BufferedWriter escrever = new BufferedWriter(salvar);
				// escrever.write((int) tempoExecucao, StandardCharsets.ISO_8859_1).toString();

				Files.writeString(null, null, null, null)

				escrever.close();
				salvar.close();


			} else if (acao == 2) {

				// adicionar leitura de arquivo salvo
				// se tudo der errado o continuar vai ser a partir de alguma fase

			} else if (acao == 3) {

				// Adicionar ranking

			} else if (acao == 4) {

				System.out.println("Muito obrigado!");
				System.exit(0);

			}

		} while (acao == 3);

	}

}
