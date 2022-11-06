package com.algoritimos.senacafuga;
import java.util.Scanner;

public class DesafioTres {
	private static Scanner input = new Scanner(System.in);
	public static void desafioTres(String personagem) {
		String iniciar;
		do {
			
			iniciar = input.next().toUpperCase();

			switch (iniciar) {
			case "INICIAR":
				System.out.println(
						" \n \n Voc� est� no conv�s e devido ao estado do navio ap�s colis�o, algumas madeiras se soltaram de algumas partes do navio e outras s�o partes do outro navio.");
				System.out.println(
						" \n \n Olhe em sua volta para localizar o primeiro item que o possibilite construir uma pequena jangada. \n \n  Voc� poder� olhar para direita, esquerda, para cima e para baixo. \n \n");
				escolha();
				break;

			case "SAIR":
				System.out.println("\n Voc� pulou do navio! \n \n Todo seu progresso foi perdido. \n \n Volte em outra oportunidade para salvar Geovanni !");
				Credito.credito(false);
				break;

			default:
				System.out.println("Op��o errada");
				break;
			}
		} while (!iniciar.equals("INICIAR"));
	}
	public static void alojamento() {
		String pegar, ir, olhar;

		do {
			System.out.println("\n Digite:\"IR\" Para ir ao alojamento. \n ");
			ir = input.next().toUpperCase();
			;

			if (ir.equals("IR")) {
				System.out.println(
						"\n \n Voc� est� no alojamento! \n \n Colete itens para seguir at� o pr�ximo ponto de busca. ");
			}

		} while (!ir.equals("IR"));

		do {
			System.out.println(" \n \n Digite \"OLHAR\" para localizar os itens no alojamento !");
			olhar = input.next().toUpperCase();

			if (olhar.equals("OLHAR")) {
				System.out.println(
						" \n \n No local tem alguns tecidos sobre as camas, no arm�rio cont�m uma corda, parafusos, martelo e um serrote. Esses itens podem auxilia-lo na montagem de uma jangada..");
			}

		} while (!olhar.equals("OLHAR"));

		do {
			System.out.println(" \n \n Digite \"PEGAR\" para pegar os itens ! \n");
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				System.out.println(
						"\n \n �timo! \n \n Voc� coletou tudo que tinha no alojamento. V� at� a cozinha para buscar itens que possam flutuar. \n");
				cozinha();
			}

		} while (!pegar.equals("PEGAR"));
	}

	public static void escolha() {
		Scanner input = new Scanner(System.in); 
		String resposta, pegar;
		boolean RespostaCerta = false;

		do {
			System.out.println("\n Escolha os pr�ximos passos:\n");
			System.out.println(" \n Digite \"DIREITA\" para olhar para a Direita.");
			System.out.println(" \n Digite \"ESQUERDA\" para olhar para a Esquerda.");
			System.out.println(" \n Digite \"CIMA\" para olhar para  Cima.");
			System.out.println(" \n Digite \"BAIXO\" para olhar para  Baixo. \n ");
			resposta = input.next().toUpperCase();

			switch (resposta) {
			case "DIREITA":
				System.out.println("\n Voc� encontrou Madeira!\n ");
				RespostaCerta = true;
				break;

			case "ESQUERDA":
				System.out.println("\n N�o est� aqui");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "CIMA":
				System.out.println(" \n C�u e p�ssaros ! \n");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "BAIXO":
				System.out.println("Olhou para os p�s");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			default:
				System.out.println("Op��o errada");
				break;
			}

		} while (!RespostaCerta);

		do {
			System.out.println("\n Digite:\"PEGAR\" Para coleta-las. \n  ");
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				System.out.println(
						" \n Voc� coletou as madeiras ! \n \n V� at� o alojamento para localizar novos itens !!");
				alojamento();
			}

		} while (!pegar.equals("PEGAR"));

	}
	
	public static void cozinha() {
		String pegar, ir, resposta;
		boolean RespostaCerta = false;

		do {
			System.out.println("\n Digite:\"IR\" Para ir at� a cozinha. \n ");
			ir = input.next().toUpperCase();

			if (ir.equals("IR")) {
				System.out.println(" \n Voc� est� na cozinha! \n \n O local est� uma bagun�a, procure por materiais pl�sticos que possam fazer com que a jangada flutue melhor em alto mar.");
			}
		} while (!ir.equals("IR"));

		do {

			System.out.println("\n Escolha os pr�ximos passos:\n");
			System.out.println(" \n Digite \"DIREITA\" para olhar para a Direita.");
			System.out.println(" \n Digite \"ESQUERDA\" para olhar para a Esquerda.");
			System.out.println(" \n Digite \"CIMA\" para olhar para  Cima.");
			System.out.println(" \n Digite \"BAIXO\" para olhar para  Baixo. \n ");
			resposta = input.next().toUpperCase();

			switch (resposta) {
			case "DIREITA":
				System.out.println("\n N�o est� aqui!\n ");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "ESQUERDA":
				System.out.println("\n Voc� encontrou garrafas pl�sticas ! ");
				RespostaCerta = true;
				break;

			case "CIMA":
				System.out.println(" \n C�u e p�ssaros ! \n");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "BAIXO":
				System.out.println("Olhou para os p�s");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			default:
				System.out.println("Op��o errada");
				break;
			}
		} while (!RespostaCerta);

		do {
			System.out.println(" \n \n Digite \"PEGAR\" para pegar os itens ! \n");
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				System.out.println("\n \n Parab�ns! \n \n Voc� coletou o �ltimo item necess�rio ! \n"
						+ "\n Com isso voc� desbloqueou uma nova habilidade. \n "
						+ "\n Habilidade e aprimoramento: Agilidade e teve sua For�a aprimorada para o n�vel III. \n"
						+ "\n Volte at� o conv�s para descobrir o novo desafio ! \n ");
				fim();
			}

		} while (!pegar.equals("PEGAR"));
	}

	public static void fim() {

		String ir;

		do {
			System.out.println("\n Digite:\"IR\"Para voltar ao Conv�s. \n ");
			System.out.println(" Digite \"SAIR\" Para pular do Navio. \n");
			ir = input.next().toUpperCase();

			switch (ir) {
			case "IR":
				System.out.println(" \n \n Voc� voltou ao conv�s ! \n ");
				System.out.println(" \n \n Boa Sorte em seu novo desafio ! \n ");
				break;

			case "SAIR":
				System.out.println("\n Voc� pulou do navio! \n \n Todo seu progresso foi perdido. \n \n Volte em outra oportunidade para salvar Geovanni !");
				Credito.credito(false);
				break;

			default:
				System.out.println("Op��o errada");
				break;
			}
		} while (!ir.equals("IR"));
	}
}
