
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		Inicio do Jogo
		inicioJogo();

		System.out.println("Escolha a sua classe: ");
		String personagem = input.next().toUpperCase();
		classe(personagem);

//		Desafios
		desafioUm(personagem);
		desafioDois(personagem);
		desafioTres(personagem);
		desafioQuatro(personagem);
		
	}

//  Continue
	public static void proximo() {
		String continuar;
		do {
			System.out.println("Digite \"Continue\" para ver a pr�xima tela");
			continuar = input.next().toUpperCase();

		} while (!continuar.equals("CONTINUE"));
	}

//	 introdu��o do jogo
	public static void inicioJogo() {

		System.out.println("***CONTAINER 260***");
		System.out.println("");
		System.out.println(
				"Ap�s vender carga roubada por engano Giovanni teve que fugir da cidade de santos para n�o ser pego pela pol�cia.\r\n"
						+ "Como n�o tinha dinheiro pediu ajuda a amigos que trabalhavam em um navio mercante que o esconderam no Container 260" 
						+ "de um navio cargueiro que estava em dire��o ao Rio de Janeiro.\r\n"
						+ "Mas durante a viagem o inesperado aconteceu, o navio que Giovanni estava colidiu com outro de menor porte, causando um naufr�gio.\r\n"
						+ "E agora Giovanni?\r\n" + "Junte for�as, colete itens, entre nessa briga e sobreviva!\r\n"
						+ "\r\n" + "Boa Sorte!\r\n" + "");
		proximo();

//		Descri��o das classes
		System.out.println("Descri��o de Classes do jogo \n");
		System.out.println(
				"ASSASINO - PEDRO \n" + "PONTOS FORTES: \n" + "Habilidades com faca \n" + "Experi�ncia no Mar \n");
		System.out.println();
		System.out.println("ILUSIONISTA - THIAGO \n" + "PONTOS FORTES \n" + "M�gico");
		System.out.println();
		System.out.println("GUERREIRO - MATHEUS \n" + "PONTOS FORTES: \n" + "Atirador \n" + "Forte Fisicamente \n");
		System.out.println();
		System.out.println("CURANDEIRO - JONAS \n" + "PONTOS FORTES: \n" + "Mestre da Medicina \n" + "Racioc�nio R�pido \n");
		System.out.println();

	}

//	Cr�dito
	public static void credito(boolean conquista) {
		
		if (conquista == true) {
			System.out.println("Mas e o que aconteceu com Giovanni ?");
			System.out.println("Calma, calma isso � assunto para outro jogo...");
			System.out.println("Voc� ganhou!!!");
			System.out.println("CR�DITOS");
			System.out.println("Isabela Midori");
			System.out.println("Nathalia Aldinar");
			System.out.println("Nicolas Marques");
			System.out.println("P�mera Natali");
			System.out.println("Robson Vila�a");
			System.out.println("END!");
			System.exit(0);
		} 
		if (conquista == false){
			System.out.println("voc� perdeu o jogo! Mas n�o desista de se tornar um grande patrulheiro do mar, na pr�xima voc� conseguir�!");
			System.out.println("Digite \"EU CONSIGO\" para come�ar o jogo de novo");
			String recomeco = input.next().toUpperCase();
			if(recomeco.equals("EU CONSIGO")) {
				inicioJogo();
			}
		}
		
	}


	
//	Escohendo Classes
	public static void classe(String personagem) {
		String ver = null;

		if (personagem.equals("PEDRO")) {
			System.out.println("Boa Escolha \n");
			System.out.println("Cada jogador possui uma bolsa com itens \n");
			System.out.println("Digite \"ver\" para acessar a bolsa ");
			ver = input.next().toUpperCase();
		} else if (personagem.equals("MATHEUS")) {
			System.out.println("Boa Escolha \n");
			System.out.println("Cada jogador possui uma bolsa com itens \n");
			System.out.println("Digite \"ver\" para acessar a bolsa ");
			ver = input.next().toUpperCase();
		} else if (personagem.equals("THIAGO")) {
			System.out.println("Boa Escolha \n");
			System.out.println("Cada jogador possui uma bolsa com itens \n");
			System.out.println("Digite \"ver\" para acessar a bolsa ");
			ver = input.next().toUpperCase();
		} else if (personagem.equals("JONAS")) {
			System.out.println("Boa Escolha \n");
			System.out.println("Cada jogador possui uma bolsa com itens \n");
			System.out.println("Digite \"ver\" para acessar a bolsa ");
			ver = input.next().toUpperCase();
		} else {
			System.out.println("Op��o errada isso vai te complicar no futuro");
		}

		if (ver.equals("VER")) {
			bolsa(personagem, ver, null);
		}
	}

//	bolsa
	public static void bolsa(String personagem, String adicionar, String obj) {

		List<String> bolsa = new ArrayList<String>();
		bolsa.add("\n Canivete");
		bolsa.add("\n Sinalizador");
		bolsa.add("\n Lanterna");
		bolsa.add("\n Kit Primeiros Socorros");

		

		if (adicionar.equals("VER") && personagem.equals("PEDRO")) {
			bolsa.add("\n Espada");
			System.out.println(bolsa);
		} else if (adicionar.equals("VER") && personagem.equals("THIAGO")) {
			bolsa.add("\n Livro");
			System.out.println(bolsa);
		} else if (adicionar.equals("VER") && personagem.equals("MATHEUS")) {
			bolsa.add("\n Arma de Fogo");
			System.out.println(bolsa);
		} else if (adicionar.equals("VER") && personagem.equals("JONAS")) {
			bolsa.add("\n Tranquilizante");
			System.out.println(bolsa);
		}
		
		if (adicionar.equals("ADICIONAR")) {
			bolsa.add(obj);
		}
		proximo();
	}

//	Desafio Um
	public static void desafioUm(String personagem) {

		String comando1 = null;
		String comando2 = null;
		String comando3 = null;
		String comando4 = null;
		String comando5 = null;
		int tentativa = 0;

		do {

			System.out.println("\n \n Ap�s a forte tempestade, voc� acorda e se d� conta do acontecido. "
					+ "\n Ainda deitado na cama, abre os olhos. Olha ao redor e v� o dormit�rio todo revirado. "
					+ "\n Voc� tenta se mover, mas instantaneamente sente uma dor intensa. \n Para olhar ao seu redor, digite OLHAR");
			System.out.println("Digite OLHAR para olhar ao redor \n");
			comando1 = input.next().toUpperCase();

		}

		while (!comando1.equals("OLHAR"));

		System.out.println("\n Voc� olha para seu bra�o e nota que est� ferido. "
				+ "\n Olha para o canto do quarto e v� seu kit de primeiros socorros. "
				+ "\n Olha para a direita e v� um pequeno arm�rio, onde voc� se lembra que h� algumas ferramentas guardadas. "
				+ "\n Logo a sua frente, est� a porta que ao olhar bem voc� percebe que est� emperrada, essa porta te leva para a sa�da do alojamento. "
				+ "Voc� precisa sair!!! \n ");

		do {

			System.out.println("CURAR - Se levantar, pegar o kit para se curar e ir at� a porta.");
			System.out.println("PEGAR - Se levantar, ir at� o arm�rio pegar o p� de cabra e ir at� a porta. \n ");
			System.out.println("Escolha op��o CURAR ou PEGAR");
			comando2 = input.next().toUpperCase();

			switch (comando2) {
			case "CURAR":
				System.out.println("\n Voc� se levanta lentamente da cama e caminha com dificuldade at� o kit."
						+ "\n Consegue se curar e vai at� a porta para tentar abri-la. "
						+ "\n A porta est� emperrada e voc� precisa de alguma ferramenta para abrir");
				System.out.println("Continuar tentando abrir ou pegar ferramenta para abrir a porta? \n ");
				do {

					System.out.println("SIM para Continuar for�ando a porta");
					System.out.println("PEGAR para Pegar ferramenta");
					comando3 = input.next().toUpperCase();

					switch (comando3) {
					case "SIM":

						System.out.println("\n A porta est� emperrada e voc� precisa de alguma ferramenta para abri-l�");
						System.out.println("Continuar tentando abrir ou pegar ferramenta para abrir a porta? \n");

						break;
					case "PEGAR":
						System.out.println("Voc� pegou o p� de Cabra!");
						System.out.println("Ap�s muito esfor�o voc� conseguiu abrir a porta!!!\n");
						System.out.println("Habilidade desbloqueada: FOR�A\n");
						System.out.println("Se lembre que voc� escondeu seu amigo Giovanni no container."
								+ "\n Voc� precisa resgat�-lo. V� at� o conv�s e o procure!");
						break;
					default:
						System.out.println("Op��o inv�lida");
						break;
					}
				} while (!comando3.equals("PEGAR"));
				break;

			case "PEGAR":
				System.out.println("\n Voc� se levanta lentamente da cama e caminha com dificuldade at� o arm�rio,"
						+ "\n pega o p� de cabra e vai at� a porta para tentar abri-la. "
						+ "\n Voc� perdeu muito sangue e est� fraco, n�o consegue abrir.");
				bolsa(personagem, "ADICIONAR", "\n P� de cabra");
				System.out.println("Continuar tentando abrir ou se curar para ter for�ar para abrir a porta? \n");

				do {
					System.out.println("Digite SIM para continuar for�ando a porta");
					System.out.println("Digite PEGAR para pegar o kit e se curar");
					comando4 = input.next().toUpperCase();

					switch (comando4) {
					case "SIM":
						tentativa = tentativa + 1;
						System.out.println("\n Voc� est� perdendo muito sangue, deseja continuar for�ando a porta? \n");

						break;
					case "PEGAR":
						System.out.println("\n Voc� se curou e agora tem for�as para abrir a porta");
						System.out.println("Ap�s muito esfor�o voc� conseguiu abrir a porta!!!\n");
						System.out.println("Habilidade desbloqueada: FOR�A\n");
						System.out.println("Se lembre que voc� escondeu seu amigo Giovanni no container."
								+ "\n Voc� precisa resgat�-lo. V� at� o conv�s e o procure! \n");
						break;
					default:
						System.out.println("Op��o inv�lida");
						break;
					}
				} while (!comando4.equals("PEGAR") && (tentativa < 3));

				if (!comando4.equals("PEGAR")) {
					System.out.println("Voc� morreu...");

					credito(false);
				}

				break;
			default:
				System.out.println("Op��o Inv�lida");
				break;
			}
		} while ((!"CURAR".equals(comando2)) && (!"PEGAR".equals(comando2)));

		do {
			System.out.println("Digite IR para encontrar Giovanni");
			comando5 = input.next().toUpperCase();
		} while (!"IR".equals(comando5));

		System.out.println("\n Ao sair do quarto, voc� sobe a escada que est� a sua frente,"
				+ "\n Ao chegar no topo voc� vira � esquerda em um corredor longo e estreito. \n");
	}

//    Desafio Dois
	public static void desafioDois(String personagem) {
		String opcoes;
		int num = 0;
		boolean menu = false;

		do {
			System.out.println("\n \n 2� Desafio -  Encontre o Giovanni!");
			System.out.println("Dessa vez voc� n�o precisar� de materiais! Voc� ir� precisar realizar um c�lculo matem�tico. Veja bem... Voc� esta locaizado no container 260, para sair voc� deve saber o n�mero do container que est�, dividir por 2 e somar 3."); // ****
			System.out.println("#### ESCOLHA AS OP��ES ABAIXO ####");
			System.out.println("Digite \"DICA\" para obter uma dica");
			System.out.println("Digite \"N�O\" caso n�o precise de ajuda");
			System.out.println("Digite \"AJUDA\" para ter uma ajuda \n");
			opcoes = input.next().toUpperCase();

			switch (opcoes) {
			case "DICA":
				System.out.println("Some o numero 130 por ele mesmo que voce saber� o numero do container");
				num = input.nextInt();
				break;

			case "N�O":
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
				bolsa(personagem, ver, null);
				System.out.println("\n Agora voc� est� com o canivete na m�o");	
			}
		} while (!ver.equals("VER"));
		
		do {
			System.out.println("Digite \"DESATAR\" para desatar o n�");
			desatar = input.next().toUpperCase();
			if (desatar.equals("DESATAR")) {
				System.out.println("Pronto! N� desatado. Parab�ns!");
			}

		} while (!desatar.equals("DESATAR"));

	}

//    Desafio Tr�s
	public static void desafioTres(String personagem) {
		String iniciar;
		do {
			System.out.println("\n Parab�ns!");
			System.out.println("\n Voc� chegou ao terceiro desafio.\n \n Ap�s encontrar Giovanni e retira-lo do Container, chegou a hora de sobreviver!");
			System.out.println("\n Procure por itens que est�o localizados no navio para constru��o de uma jangada pequena e forte o suficiente para suportar 2 pessoas. ");
			System.out.println("\n Escolha os pr�ximos passos:\n");
			System.out.println(" Digite \"INICIAR\" Para dar in�cio ao Desafio.");
			System.out.println(" Digite \"SAIR\" Para pular do Navio.");
			System.out
					.println(" \n \n ATEN��O ! \n \n Ao escolher pular do navio voc� perder� todo seu progresso !! \n");
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
				credito(false);
				break;

			default:
				System.out.println("Op��o errada");
				break;
			}
		} while (!iniciar.equals("INICIAR"));
	}

	public static void escolha() {
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
				credito(false);
				break;

			default:
				System.out.println("Op��o errada");
				break;
			}
		} while (!ir.equals("IR"));
	}

//    Desafio Quatro
	public static void desafioQuatro(String personagem) {
		boolean remendo = false;
		String materialserrabarco, materialpregabarco, materialacentos, materialremo;
		int remo = 0;
		System.out.println("Desafio 4");
		System.out.println(
				"Ap�s coletar itens suficientes para a constru��o de dois remos e uma jangada para duas pessoas, voc� se senta no ch�o do conv�s e come�a a organizar em fileira os materiais recolhidos.");
		System.out.println(
				"Com as m�os na cabe�a voc� tenta pensar por onde come�ar o processo de constru��o da jangada, por�m voc� tem pouco tempo para raciocinar e colocar em pr�tica sua criatividade.");
		System.out.println(
				"Sem muito tempo para planejamento, voc� simplesmente escolhe os materiais e come�a a trabalhar, sem saber exatamente o resultado.");
		System.out.println("Mentalizando o formato de um barco, voc� define os pa�os para a constru��o.");
		System.out.println(
				"Primeiramente, voc� ter� que construir a carca�a do seu barco. Para isso, qual desses materiais voc� deve usar primeiro? Digite as palavras das op��es de materiais que voc� deve usar. Lembre-se de digitar exatamente como est� escrito nas op��es, respeitando v�rgulas e acentua��es");
		do {
			System.out.println("madeira e serrote");
			System.out.println("prego e martelo");
			System.out.println("corda, pl�stico e tecido");
			materialserrabarco = input.nextLine();
			// switch grande
			switch (materialserrabarco) {
			case "madeira e serrote":
				System.out.println(
						"parab�ns, voc� serrou a madeira em 5 partes. Agora voc� deve unir essas 5 partes para formar o corpo do barco. O que voc� deve usar para os encaixes?");
				do {
					System.out.println("madeira e serrote");
					System.out.println("prego e martelo");
					System.out.println("corda, pl�stico e tecido");
					materialpregabarco = input.nextLine();
					// switch m�dio
					switch (materialpregabarco) {
					case "madeira e serrote":
						remendo = true;
						System.out.println(
								"voc� serrou a madeira mais do que deveria. Sua jangada corre risco de se partir no mar. Escolha novamente uma op��o para o encaixe das madeiras");
						break;
					case "prego e martelo":
						System.out.println(
								"parab�ns, voc� pregou as 5 partes, formando o fundo e os 4 lados do seu barco.");
						System.out.println(
								"Agora, falta construir acentos para 2 tripulantes. Qual material voc� deve utilizar para construir os acentos?");
						do {
							System.out.println("martelo, prego e serrote");
							System.out.println("corda e madeira");
							System.out.println("pl�stico e tecido");
							materialacentos = input.nextLine();
							// switch pequeno
							switch (materialacentos) {
							case "martelo, prego e serrote":
								System.out.println("primeiro escolha uma mat�ria prima para serrar ou pregar");
								break;
							case "corda e madeira":
								remo = 1;
								System.out.println(
										"voc� foi muito esperto e construiu fortes remos de madeira que amarrados ao barco, ter�o menos chance de se quebrarem ou ca�rem no mar durante a navega��o. Escolha martelo, prego e serrote, ou, pl�stico e tecido para continuar a constru��o dos acentos");
								break;
							case "pl�stico e tecido":
								System.out.println(
										"parab�ns! Mesmo deformado no recorte, o pl�stico foi envolvido em tecidos para se tornar mais confort�vel a acomoda��o dos tripulantes e voc� os prega na jangada.");
								break;
							default:
								System.out.println(
										"material inv�lido. Digite novamente respeitando as v�rgulas e acentua��es");
							}
						} while (!materialacentos.equals("pl�stico e tecido"));
						// constru��o do remo ap�s a constru��o de toda a jangada
						if (remo == 0) {
							System.out.println(
									"agora voc� deve construir os remos para poder navegar no mar. O que voc� quer usar para a constru��o?");
							do {
								System.out.println("corda, pl�stico e tecido");
								System.out.println("corda e madeira");
								materialremo = input.nextLine();
								switch (materialremo) {
								case "corda, pl�stico e tecido":
									System.out.println(
											"voc� acabou de montar um remo de pl�stico, mas ele n�o ser� seguro suficiente para remar em �guas pesadas e profundas por muito tempo.");
									break;
								case "corda e madeira":
									System.out.println(
											"voc� foi muito esperto e construiu fortes remos de madeira que amarrados ao barco, ter�o menos chance de se quebrarem ou ca�rem no mar durante a navega��o.");
									break;
								default:
									System.out.println(
											"material inv�lido. Digite novamente respeitando as v�rgulas e acentua��es");
								}
							} while (!materialremo.equals("corda, pl�stico e tecido")
									&& !materialremo.equals("corda e madeira"));
						}
						// mensagem de constru��o da jangada conclu�da
						if (remendo == true) {
							System.out.println(
									"sua jangada est� pronta, mas espero que voc� tenha �timas habilidades com nado, pois voc� serrou a madeira demais e a jangada pode se partir a qualquer momento.");
						} else {
							System.out.println(
									"foi um trabalho ardo, mas voc� conseguiu construir uma �tima e forte v�lvula de escape para se salvar do naufr�gio.");
						}
						// chamada do m�todo da procura de mapas e coletes
						mapacoletes(personagem);
						// aqui voltamos ao switch m�dio
						break;
					case "corda, pl�stico e tecido":
						remo = 1;
						System.out.println(
								"voc� acabou de montar um remo de pl�stico, mas ele n�o ser� seguro suficiente para remar em �guas pesadas e profundas por muito tempo. Escolha novamente uma op��o para o encaixe das madeiras");
						break;
					default:
						System.out.println("material inv�lido. Digite novamente respeitando as v�rgulas e acentua��es");
					}
				} while (!materialpregabarco.equals("prego e martelo"));
				// aqui voltamos ao switch grande
				break;
			case "prego e martelo":
				System.out.println("n�o tem como pregar madeira inteira. Escolha novamente");
				break;
			case "corda, pl�stico e tecido":
				System.out.println("voc� ainda n�o pode construir o remo. Escolha novamente");
				break;
			default:
				System.out.println("material inv�lido. Digite novamente respeitando as v�rgulas e acentua��es");
			}
		} while (!materialserrabarco.equals("madeira e serrote"));
	}

	public static void mapacoletes(String personagem) {
		String direction;
		int ale, codigo, lanterna = 0, contador = 1;
		System.out.println(
				"Ap�s terminar a constru��o da jangada, voc� sente um grande al�vio e um passo finalizado para a fuga. Por�m, seu al�vio n�o dura 10 segundos ao vir em sua mente as seguintes perguntas:");
		System.out.println("para qual lado eu vou ao colocar minha jangada no mar? E se a jangada afundar?");
		System.out.println(
				"� a� que voc� se lembra que mais um importante pa�o precisa ser dado, encontrar um mapa e dois coletes salva-vidas.");
		System.out.println(
				"Voc� se lembra que ao passar pela sala do capit�o anteriormente voc� havia se deparado com um arm�rio cheio de coletes e com um mapa sobre a mesa do capit�o. Seu desafio agora � sair do conv�s para ir em busca dos 2 tesouros.");
		System.out.println("em que dire��o voc� deve seguir agora? Digite sul ou norte");
		direction = input.nextLine();
		if (direction.equals("sul")) {
			System.out.println(
					"a tontura e o cansa�o desnortearam voc�, que acabou batendo com for�a na grade do conv�s, fazendo com que a for�a do seu corpo pesado a derrubasse no mar. Sem o amparo da grade para te conter, voc� � impulsionado para frente e se desequilibra, caindo no mar e virando alimento dos tubar�es. Fim de jogo!");
			System.exit(0);
		}
		if (direction.equals("norte")) {
			System.out.println("voc� sai do conv�s e chega at� as escadas. Digite descer para ir at� o subsolo");
			direction = input.nextLine();
		}
		if (direction.equals("descer")) {
			System.out.println(
					"voc� avista a cozinha e fica em d�vida entre se alimentar ou seguir direto at� a sala do capit�o antes que seu tempo acabe. Digite oeste para entrar na cozinha ou norte para ir � sala");
			direction = input.nextLine();
		}
		if (direction.equals("norte")) {
			System.out.println(
					"voc� anda alguns pa�os e chega at� a porta da sala do capit�o. Mas antes mesmo de entrar, a fraqueza te vence e voc� cai desmaiado.");
			System.out.println("Ao acordar, nota que sua jangada havia desaparecido.");
			System.out.println(
					"Quando olha em dire��o ao mar, a avista sendo remada por 2 tripulantes que a roubaram, e, enquanto eles se salvam, seu destino � fazer suas �ltimas reflex�es sobre a vida e se despedir de si mesmo, pois o naufr�gio acontecer� em menos de 5 minutos e n�o haver� tempo para a constru��o de uma nova jangada. Fim de jogo!");
			System.exit(0);
		}
		if (direction.equals("oeste")) {
			System.out.println(
					"ao entrar na cozinha voc� avista sobre o fog�o uma panela com um delicioso ensopado preparado no almo�o e o devora rapidamente.");
			System.out.println("abrindo a geladeira, voc� encontra uma refrescante bebida para se hidratar");
			System.out.println(
					"ap�s matar a sede e se alimentar voc� recupera energia para continuar com seus planos de fuga. Digite norte para ir at� a sala do capit�o");
			direction = input.nextLine();
			if (direction.equals("norte")) {
				System.out.println(
						"voc� chegou a sala do capit�o. Digite 1 para ligar a lanterna ou 2 para procurar o mapa com a lanterna desligada");
				lanterna = input.nextInt();
				if (lanterna == 1) {
					System.out.println(
							"voc� encontrou o mapa mas a luz da lanterna fez com que o capit�o te avistasse e voc� foi preso. Fim de jogo.");
					System.exit(0);
				}
				if (lanterna == 2) {
					System.out.println("minutos pareciam dias, mas voc� encontrou o mapa.");
					System.out.println(
							"agora digite um n�mero entre 1 e 5 para abrir o arm�rio e pegar dois coletes, um para voc� e outro para Giovanni. Voc� tem 3 tentativas");
					do {
						codigo = input.nextInt();
						ale = (int) (Math.random() * 5) + 1;
						if (codigo == ale) {
							System.out
									.println("a porta abriu e voc� pegou os coletes. Voc� acertou na tentativa n�mero "
											+ contador);
							System.out.println("parab�ns! O c�digo era " + ale
									+ ". Desafio 4 conclu�do. Agora saia da sala enquanto ainda h� tempo.");
							System.out.println("Habilidade desbloqueada: Mestre do mar");
							System.out.println("Habilidade aprimorada: L�gica II");
							desafioCinco(personagem);
						} else {
							System.out.println("c�digo incorreto na tentativa n�mero" + contador);
							contador++;
						}
						if (codigo != ale && contador > 3) {
							System.out.println("O c�digo era " + ale
									+ ". Ao digitar o c�digo incorreto 3 vezes, o arm�rio fica bloqueado por 60 minutos. At� l�, voc� j� estar� mergulhado nas profundesas do mar! Fim de jogo!");
							credito(false);
						}
					} while (codigo != ale && contador <= 3);
				}
			}
		}
	}

//	  Desafio Cinco
	public static void desafioCinco(String personagem) {
		String opcao;

		System.out.println("Parab�ns voc� chegou a �ltima fase...");
		System.out.println(
				"Ohh n�o os outros tripulantes descobriram que voc� est� prestes a sair do navio, escolha uma das op��es e sobreviva:");
		do {
			System.out.println("Digite \"Correr\" para correr e deixar Giovanni para tr�s");
			System.out.println("Digite \"Ficar\" para ficar e lutar");
			opcao = input.next().toUpperCase();

			switch (opcao) {
			case "CORRER":
				System.out.println("Giovanni voc� est� muito lento, se ficarmos iremos morrer !");
				System.out.println("Eu n�o posso te esperar mais, boa sorte.. \n");
				decisao(opcao, personagem);
				break;
			case "FICAR":
				System.out.println("E agora Giovanni? Se ficarmos iremos perder");
				System.out.println("Giovanni: N�o se preocupe porque eu tenho um plano, vou subir no mastro e enquanto voc� luta aqui em baixo eu te cubro l� de cima");
				decisao(opcao, personagem);
				break;
			default:
				System.out.println("Op��o errada");
			}
		} while (!opcao.equals("CORRER") || !opcao.equals("FICAR"));
	}

	public static void decisao(String opcao, String personagem) {
		String ver, escolha;
		
		if (opcao.equals("CORRER")) {
			System.out.println("Digite \"Subir\" para subir na jangada e ir para o mar ");
			System.out.println("N�o foi uma boa escolha sair do navio sem Giovanni agora voc� n�o tem quem cubra a sua retaguarda e acabou de ser atingido");
			System.out.println("E agora o que voc� ir� fazer?");

			System.out.println("Digite \"ver\" para olhar os itens da sua bolsa");
			ver = input.next().toUpperCase();
			bolsa(personagem, ver, null);

			if (ver.equals("VER")) {
				System.out.println("Enquanto voc� pegava a sua ferramenta um dos tripulantes conseguiu alcan�ar a nado e interceptou a sua jangada e te matou..");
				System.out.println("FIM DE JOGO !");
				credito(false);
			}
		} else if (opcao.equals("FICAR")) {
			System.out.println("Olhe a sua bolsa e pegue algo para sua defesa");
			System.out.println("Digite \"ver\" para pegar um item na sua bolsa ");
			ver = input.next().toUpperCase();
			bolsa(personagem, ver, null);

			switch (personagem) {
			case "PEDRO":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "ESPADA":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, n�o temos esse item na lista");
						break;
					}
				} while (escolha != "ESPADA" || escolha != "CANIVETE" || escolha != "LANTERNA");

			case "MATHEUS":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "ARMA DE FOGO":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, n�o temos esse item na lista");
						break;
					}
				} while (escolha != "CANIVETE" || escolha != "LANTERNA");
			case "JONAS":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "TRANQUILIZANTE":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, n�o temos esse item na lista");
						break;
					}
				} while (escolha != "TRANQUILIZANTE" || escolha != "CANIVETE" || escolha != "LANTERNA");
			case "THIAGO":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "CANIVETE":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					case "LIVRO":
						System.out.println("Voc� escolheu um bom item de defesa vamos l�");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, n�o temos esse item na lista");
						break;
					}
				} while (escolha != "LIVRO" || escolha != "CANIVETE" || escolha != "LANTERNA");
			}
		}
	}

	public static void retaFinal(String opcao, String personagem) {
		String decisao, subir;

		if (opcao.equals("FICAR")) {

			System.out.println("Tem dois oponentes vindo at� voc�");
			System.out.println("Voc� tem duas op��es");
			System.out.println("Digite \"Combate\" para entrar em combate com dois oponentes mesmo com Giovanni no apoio");
			System.out.println("Digite \"Confiar\" para confiar em Giovanni e lutar apenas contra um oponente");
			decisao = input.next().toUpperCase();

			switch (decisao) {
			case "COMBATE":
				System.out.println("Voc� n�o confiou em Giovanni");
				System.out.println("E entrou foi atingido por um dos oponentes");
				System.out.println("Giovanni por sua vez conseguiu atingir fatalmente os oponentes, por�m n�o confia mais em voc�");
				decisao("CORRER", personagem);
				break;

			case "CONFIAR":
				System.out.println("Voc� confiou em Giovanni!");
				System.out.println("E Giovanni conseguiu interceptar um dos oponentes");

				do {
					System.out.println("Digite \"Subir\" para subir na jangada e ir para o mar ");
					subir = input.next().toUpperCase();

					System.out.println("Parab�ns voc� conseguiu passar por todas as fases e se tornou O PATRULHEIRO DO MAR !!!");
					credito(true);

				} while (subir != "SUBIR");
				break;
			}
		}
	}

}
