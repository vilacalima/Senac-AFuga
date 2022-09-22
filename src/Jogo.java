
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
			System.out.println("Digite \"Continue\" para ver a próxima tela");
			continuar = input.next().toUpperCase();

		} while (!continuar.equals("CONTINUE"));
	}

//	 introdução do jogo
	public static void inicioJogo() {

		System.out.println("***CONTAINER 260***");
		System.out.println("");
		System.out.println(
				"Após vender carga roubada por engano Giovanni teve que fugir da cidade de santos para não ser pego pela polícia.\r\n"
						+ "Como não tinha dinheiro pediu ajuda a amigos que trabalhavam em um navio mercante que o esconderam no Container 260" 
						+ "de um navio cargueiro que estava em direção ao Rio de Janeiro.\r\n"
						+ "Mas durante a viagem o inesperado aconteceu, o navio que Giovanni estava colidiu com outro de menor porte, causando um naufrágio.\r\n"
						+ "E agora Giovanni?\r\n" + "Junte forças, colete itens, entre nessa briga e sobreviva!\r\n"
						+ "\r\n" + "Boa Sorte!\r\n" + "");
		proximo();

//		Descrição das classes
		System.out.println("Descrição de Classes do jogo \n");
		System.out.println(
				"ASSASINO - PEDRO \n" + "PONTOS FORTES: \n" + "Habilidades com faca \n" + "Experiência no Mar \n");
		System.out.println();
		System.out.println("ILUSIONISTA - THIAGO \n" + "PONTOS FORTES \n" + "Mágico");
		System.out.println();
		System.out.println("GUERREIRO - MATHEUS \n" + "PONTOS FORTES: \n" + "Atirador \n" + "Forte Fisicamente \n");
		System.out.println();
		System.out.println("CURANDEIRO - JONAS \n" + "PONTOS FORTES: \n" + "Mestre da Medicina \n" + "Raciocínio Rápido \n");
		System.out.println();

	}

//	Crédito
	public static void credito(boolean conquista) {
		
		if (conquista == true) {
			System.out.println("Mas e o que aconteceu com Giovanni ?");
			System.out.println("Calma, calma isso é assunto para outro jogo...");
			System.out.println("Você ganhou!!!");
			System.out.println("CRÉDITOS");
			System.out.println("Isabela Midori");
			System.out.println("Nathalia Aldinar");
			System.out.println("Nicolas Marques");
			System.out.println("Pâmera Natali");
			System.out.println("Robson Vilaça");
			System.out.println("END!");
			System.exit(0);
		} 
		if (conquista == false){
			System.out.println("você perdeu o jogo! Mas não desista de se tornar um grande patrulheiro do mar, na próxima você conseguirá!");
			System.out.println("Digite \"EU CONSIGO\" para começar o jogo de novo");
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
			System.out.println("Opção errada isso vai te complicar no futuro");
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

			System.out.println("\n \n Após a forte tempestade, você acorda e se dá conta do acontecido. "
					+ "\n Ainda deitado na cama, abre os olhos. Olha ao redor e vê o dormitório todo revirado. "
					+ "\n Você tenta se mover, mas instantaneamente sente uma dor intensa. \n Para olhar ao seu redor, digite OLHAR");
			System.out.println("Digite OLHAR para olhar ao redor \n");
			comando1 = input.next().toUpperCase();

		}

		while (!comando1.equals("OLHAR"));

		System.out.println("\n Você olha para seu braço e nota que está ferido. "
				+ "\n Olha para o canto do quarto e vê seu kit de primeiros socorros. "
				+ "\n Olha para a direita e vê um pequeno armário, onde você se lembra que há algumas ferramentas guardadas. "
				+ "\n Logo a sua frente, está a porta que ao olhar bem você percebe que está emperrada, essa porta te leva para a saída do alojamento. "
				+ "Você precisa sair!!! \n ");

		do {

			System.out.println("CURAR - Se levantar, pegar o kit para se curar e ir até a porta.");
			System.out.println("PEGAR - Se levantar, ir até o armário pegar o pé de cabra e ir até a porta. \n ");
			System.out.println("Escolha opção CURAR ou PEGAR");
			comando2 = input.next().toUpperCase();

			switch (comando2) {
			case "CURAR":
				System.out.println("\n Você se levanta lentamente da cama e caminha com dificuldade até o kit."
						+ "\n Consegue se curar e vai até a porta para tentar abri-la. "
						+ "\n A porta está emperrada e você precisa de alguma ferramenta para abrir");
				System.out.println("Continuar tentando abrir ou pegar ferramenta para abrir a porta? \n ");
				do {

					System.out.println("SIM para Continuar forçando a porta");
					System.out.println("PEGAR para Pegar ferramenta");
					comando3 = input.next().toUpperCase();

					switch (comando3) {
					case "SIM":

						System.out.println("\n A porta está emperrada e você precisa de alguma ferramenta para abri-lá");
						System.out.println("Continuar tentando abrir ou pegar ferramenta para abrir a porta? \n");

						break;
					case "PEGAR":
						System.out.println("Você pegou o pé de Cabra!");
						System.out.println("Após muito esforço você conseguiu abrir a porta!!!\n");
						System.out.println("Habilidade desbloqueada: FORÇA\n");
						System.out.println("Se lembre que você escondeu seu amigo Giovanni no container."
								+ "\n Você precisa resgatá-lo. Vá até o convés e o procure!");
						break;
					default:
						System.out.println("Opção inválida");
						break;
					}
				} while (!comando3.equals("PEGAR"));
				break;

			case "PEGAR":
				System.out.println("\n Você se levanta lentamente da cama e caminha com dificuldade até o armário,"
						+ "\n pega o pé de cabra e vai até a porta para tentar abri-la. "
						+ "\n Você perdeu muito sangue e está fraco, não consegue abrir.");
				bolsa(personagem, "ADICIONAR", "\n Pé de cabra");
				System.out.println("Continuar tentando abrir ou se curar para ter forçar para abrir a porta? \n");

				do {
					System.out.println("Digite SIM para continuar forçando a porta");
					System.out.println("Digite PEGAR para pegar o kit e se curar");
					comando4 = input.next().toUpperCase();

					switch (comando4) {
					case "SIM":
						tentativa = tentativa + 1;
						System.out.println("\n Você está perdendo muito sangue, deseja continuar forçando a porta? \n");

						break;
					case "PEGAR":
						System.out.println("\n Você se curou e agora tem forças para abrir a porta");
						System.out.println("Após muito esforço você conseguiu abrir a porta!!!\n");
						System.out.println("Habilidade desbloqueada: FORÇA\n");
						System.out.println("Se lembre que você escondeu seu amigo Giovanni no container."
								+ "\n Você precisa resgatá-lo. Vá até o convés e o procure! \n");
						break;
					default:
						System.out.println("Opção inválida");
						break;
					}
				} while (!comando4.equals("PEGAR") && (tentativa < 3));

				if (!comando4.equals("PEGAR")) {
					System.out.println("Você morreu...");

					credito(false);
				}

				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while ((!"CURAR".equals(comando2)) && (!"PEGAR".equals(comando2)));

		do {
			System.out.println("Digite IR para encontrar Giovanni");
			comando5 = input.next().toUpperCase();
		} while (!"IR".equals(comando5));

		System.out.println("\n Ao sair do quarto, você sobe a escada que está a sua frente,"
				+ "\n Ao chegar no topo você vira à esquerda em um corredor longo e estreito. \n");
	}

//    Desafio Dois
	public static void desafioDois(String personagem) {
		String opcoes;
		int num = 0;
		boolean menu = false;

		do {
			System.out.println("\n \n 2º Desafio -  Encontre o Giovanni!");
			System.out.println("Dessa vez você não precisará de materiais! Você irá precisar realizar um cálculo matemático. Veja bem... Você esta locaizado no container 260, para sair você deve saber o número do container que está, dividir por 2 e somar 3."); // ****
			System.out.println("#### ESCOLHA AS OPÇÕES ABAIXO ####");
			System.out.println("Digite \"DICA\" para obter uma dica");
			System.out.println("Digite \"NÃO\" caso não precise de ajuda");
			System.out.println("Digite \"AJUDA\" para ter uma ajuda \n");
			opcoes = input.next().toUpperCase();

			switch (opcoes) {
			case "DICA":
				System.out.println("Some o numero 130 por ele mesmo que voce saberá o numero do container");
				num = input.nextInt();
				break;

			case "NÃO":
				System.out.println("Digite sua resposta:");
				num = input.nextInt();
				break;

			case "AJUDA":
				System.out.println("\n Como dito no enunciado do desafio, o número do seu container é 260. Divida o mesmo por 2 e some mais 3!");
				System.out.println("Talvez a fome tenha te deixado confuso, não e tão difícil assim");
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

			System.out.println("\n Pronto! Giovanni foi localizado com um nó em seus pulsos."
					+ "Para desatar esse nó, pegue o canivete que está na sua mochila e corte o nó. \n");
			System.out.println("Digite \"ver\" para ver a bolsa e pegar o canivete na mochila"); 
			ver = input.next().toUpperCase();

			if (ver.equals("VER")) {
				bolsa(personagem, ver, null);
				System.out.println("\n Agora você está com o canivete na mão");	
			}
		} while (!ver.equals("VER"));
		
		do {
			System.out.println("Digite \"DESATAR\" para desatar o nó");
			desatar = input.next().toUpperCase();
			if (desatar.equals("DESATAR")) {
				System.out.println("Pronto! Nó desatado. Parabéns!");
			}

		} while (!desatar.equals("DESATAR"));

	}

//    Desafio Três
	public static void desafioTres(String personagem) {
		String iniciar;
		do {
			System.out.println("\n Parabéns!");
			System.out.println("\n Você chegou ao terceiro desafio.\n \n Após encontrar Giovanni e retira-lo do Container, chegou a hora de sobreviver!");
			System.out.println("\n Procure por itens que estão localizados no navio para construção de uma jangada pequena e forte o suficiente para suportar 2 pessoas. ");
			System.out.println("\n Escolha os próximos passos:\n");
			System.out.println(" Digite \"INICIAR\" Para dar início ao Desafio.");
			System.out.println(" Digite \"SAIR\" Para pular do Navio.");
			System.out
					.println(" \n \n ATENÇÃO ! \n \n Ao escolher pular do navio você perderá todo seu progresso !! \n");
			iniciar = input.next().toUpperCase();

			switch (iniciar) {
			case "INICIAR":
				System.out.println(
						" \n \n Você está no convés e devido ao estado do navio após colisão, algumas madeiras se soltaram de algumas partes do navio e outras são partes do outro navio.");
				System.out.println(
						" \n \n Olhe em sua volta para localizar o primeiro item que o possibilite construir uma pequena jangada. \n \n  Você poderá olhar para direita, esquerda, para cima e para baixo. \n \n");
				escolha();
				break;

			case "SAIR":
				System.out.println("\n Você pulou do navio! \n \n Todo seu progresso foi perdido. \n \n Volte em outra oportunidade para salvar Geovanni !");
				credito(false);
				break;

			default:
				System.out.println("Opção errada");
				break;
			}
		} while (!iniciar.equals("INICIAR"));
	}

	public static void escolha() {
		String resposta, pegar;
		boolean RespostaCerta = false;

		do {
			System.out.println("\n Escolha os próximos passos:\n");
			System.out.println(" \n Digite \"DIREITA\" para olhar para a Direita.");
			System.out.println(" \n Digite \"ESQUERDA\" para olhar para a Esquerda.");
			System.out.println(" \n Digite \"CIMA\" para olhar para  Cima.");
			System.out.println(" \n Digite \"BAIXO\" para olhar para  Baixo. \n ");
			resposta = input.next().toUpperCase();

			switch (resposta) {
			case "DIREITA":
				System.out.println("\n Você encontrou Madeira!\n ");
				RespostaCerta = true;
				break;

			case "ESQUERDA":
				System.out.println("\n Não está aqui");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "CIMA":
				System.out.println(" \n Céu e pássaros ! \n");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "BAIXO":
				System.out.println("Olhou para os pés");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			default:
				System.out.println("Opção errada");
				break;
			}

		} while (!RespostaCerta);

		do {
			System.out.println("\n Digite:\"PEGAR\" Para coleta-las. \n  ");
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				System.out.println(
						" \n Você coletou as madeiras ! \n \n Vá até o alojamento para localizar novos itens !!");
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
						"\n \n Você está no alojamento! \n \n Colete itens para seguir até o próximo ponto de busca. ");
			}

		} while (!ir.equals("IR"));

		do {
			System.out.println(" \n \n Digite \"OLHAR\" para localizar os itens no alojamento !");
			olhar = input.next().toUpperCase();

			if (olhar.equals("OLHAR")) {
				System.out.println(
						" \n \n No local tem alguns tecidos sobre as camas, no armário contém uma corda, parafusos, martelo e um serrote. Esses itens podem auxilia-lo na montagem de uma jangada..");
			}

		} while (!olhar.equals("OLHAR"));

		do {
			System.out.println(" \n \n Digite \"PEGAR\" para pegar os itens ! \n");
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				System.out.println(
						"\n \n Ótimo! \n \n Você coletou tudo que tinha no alojamento. Vá até a cozinha para buscar itens que possam flutuar. \n");
				cozinha();
			}

		} while (!pegar.equals("PEGAR"));
	}

	public static void cozinha() {
		String pegar, ir, resposta;
		boolean RespostaCerta = false;

		do {
			System.out.println("\n Digite:\"IR\" Para ir até a cozinha. \n ");
			ir = input.next().toUpperCase();

			if (ir.equals("IR")) {
				System.out.println(" \n Você está na cozinha! \n \n O local está uma bagunça, procure por materiais plásticos que possam fazer com que a jangada flutue melhor em alto mar.");
			}
		} while (!ir.equals("IR"));

		do {

			System.out.println("\n Escolha os próximos passos:\n");
			System.out.println(" \n Digite \"DIREITA\" para olhar para a Direita.");
			System.out.println(" \n Digite \"ESQUERDA\" para olhar para a Esquerda.");
			System.out.println(" \n Digite \"CIMA\" para olhar para  Cima.");
			System.out.println(" \n Digite \"BAIXO\" para olhar para  Baixo. \n ");
			resposta = input.next().toUpperCase();

			switch (resposta) {
			case "DIREITA":
				System.out.println("\n Não está aqui!\n ");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "ESQUERDA":
				System.out.println("\n Você encontrou garrafas plásticas ! ");
				RespostaCerta = true;
				break;

			case "CIMA":
				System.out.println(" \n Céu e pássaros ! \n");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			case "BAIXO":
				System.out.println("Olhou para os pés");
				System.out.println(" \n Procure o item em outro local ! \n");
				break;

			default:
				System.out.println("Opção errada");
				break;
			}
		} while (!RespostaCerta);

		do {
			System.out.println(" \n \n Digite \"PEGAR\" para pegar os itens ! \n");
			pegar = input.next().toUpperCase();

			if (pegar.equals("PEGAR")) {
				System.out.println("\n \n Parabéns! \n \n Você coletou o último item necessário ! \n"
						+ "\n Com isso você desbloqueou uma nova habilidade. \n "
						+ "\n Habilidade e aprimoramento: Agilidade e teve sua Força aprimorada para o nível III. \n"
						+ "\n Volte até o convés para descobrir o novo desafio ! \n ");
				fim();
			}

		} while (!pegar.equals("PEGAR"));
	}

	public static void fim() {

		String ir;

		do {
			System.out.println("\n Digite:\"IR\"Para voltar ao Convés. \n ");
			System.out.println(" Digite \"SAIR\" Para pular do Navio. \n");
			ir = input.next().toUpperCase();

			switch (ir) {
			case "IR":
				System.out.println(" \n \n Você voltou ao convés ! \n ");
				System.out.println(" \n \n Boa Sorte em seu novo desafio ! \n ");
				break;

			case "SAIR":
				System.out.println("\n Você pulou do navio! \n \n Todo seu progresso foi perdido. \n \n Volte em outra oportunidade para salvar Geovanni !");
				credito(false);
				break;

			default:
				System.out.println("Opção errada");
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
				"Após coletar itens suficientes para a construção de dois remos e uma jangada para duas pessoas, você se senta no chão do convés e começa a organizar em fileira os materiais recolhidos.");
		System.out.println(
				"Com as mãos na cabeça você tenta pensar por onde começar o processo de construção da jangada, porém você tem pouco tempo para raciocinar e colocar em prática sua criatividade.");
		System.out.println(
				"Sem muito tempo para planejamento, você simplesmente escolhe os materiais e começa a trabalhar, sem saber exatamente o resultado.");
		System.out.println("Mentalizando o formato de um barco, você define os paços para a construção.");
		System.out.println(
				"Primeiramente, você terá que construir a carcaça do seu barco. Para isso, qual desses materiais você deve usar primeiro? Digite as palavras das opções de materiais que você deve usar. Lembre-se de digitar exatamente como está escrito nas opções, respeitando vírgulas e acentuações");
		do {
			System.out.println("madeira e serrote");
			System.out.println("prego e martelo");
			System.out.println("corda, plástico e tecido");
			materialserrabarco = input.nextLine();
			// switch grande
			switch (materialserrabarco) {
			case "madeira e serrote":
				System.out.println(
						"parabéns, você serrou a madeira em 5 partes. Agora você deve unir essas 5 partes para formar o corpo do barco. O que você deve usar para os encaixes?");
				do {
					System.out.println("madeira e serrote");
					System.out.println("prego e martelo");
					System.out.println("corda, plástico e tecido");
					materialpregabarco = input.nextLine();
					// switch médio
					switch (materialpregabarco) {
					case "madeira e serrote":
						remendo = true;
						System.out.println(
								"você serrou a madeira mais do que deveria. Sua jangada corre risco de se partir no mar. Escolha novamente uma opção para o encaixe das madeiras");
						break;
					case "prego e martelo":
						System.out.println(
								"parabéns, você pregou as 5 partes, formando o fundo e os 4 lados do seu barco.");
						System.out.println(
								"Agora, falta construir acentos para 2 tripulantes. Qual material você deve utilizar para construir os acentos?");
						do {
							System.out.println("martelo, prego e serrote");
							System.out.println("corda e madeira");
							System.out.println("plástico e tecido");
							materialacentos = input.nextLine();
							// switch pequeno
							switch (materialacentos) {
							case "martelo, prego e serrote":
								System.out.println("primeiro escolha uma matéria prima para serrar ou pregar");
								break;
							case "corda e madeira":
								remo = 1;
								System.out.println(
										"você foi muito esperto e construiu fortes remos de madeira que amarrados ao barco, terão menos chance de se quebrarem ou caírem no mar durante a navegação. Escolha martelo, prego e serrote, ou, plástico e tecido para continuar a construção dos acentos");
								break;
							case "plástico e tecido":
								System.out.println(
										"parabéns! Mesmo deformado no recorte, o plástico foi envolvido em tecidos para se tornar mais confortável a acomodação dos tripulantes e você os prega na jangada.");
								break;
							default:
								System.out.println(
										"material inválido. Digite novamente respeitando as vírgulas e acentuações");
							}
						} while (!materialacentos.equals("plástico e tecido"));
						// construção do remo após a construção de toda a jangada
						if (remo == 0) {
							System.out.println(
									"agora você deve construir os remos para poder navegar no mar. O que você quer usar para a construção?");
							do {
								System.out.println("corda, plástico e tecido");
								System.out.println("corda e madeira");
								materialremo = input.nextLine();
								switch (materialremo) {
								case "corda, plástico e tecido":
									System.out.println(
											"você acabou de montar um remo de plástico, mas ele não será seguro suficiente para remar em águas pesadas e profundas por muito tempo.");
									break;
								case "corda e madeira":
									System.out.println(
											"você foi muito esperto e construiu fortes remos de madeira que amarrados ao barco, terão menos chance de se quebrarem ou caírem no mar durante a navegação.");
									break;
								default:
									System.out.println(
											"material inválido. Digite novamente respeitando as vírgulas e acentuações");
								}
							} while (!materialremo.equals("corda, plástico e tecido")
									&& !materialremo.equals("corda e madeira"));
						}
						// mensagem de construção da jangada concluída
						if (remendo == true) {
							System.out.println(
									"sua jangada está pronta, mas espero que você tenha ótimas habilidades com nado, pois você serrou a madeira demais e a jangada pode se partir a qualquer momento.");
						} else {
							System.out.println(
									"foi um trabalho ardo, mas você conseguiu construir uma ótima e forte válvula de escape para se salvar do naufrágio.");
						}
						// chamada do método da procura de mapas e coletes
						mapacoletes(personagem);
						// aqui voltamos ao switch médio
						break;
					case "corda, plástico e tecido":
						remo = 1;
						System.out.println(
								"você acabou de montar um remo de plástico, mas ele não será seguro suficiente para remar em águas pesadas e profundas por muito tempo. Escolha novamente uma opção para o encaixe das madeiras");
						break;
					default:
						System.out.println("material inválido. Digite novamente respeitando as vírgulas e acentuações");
					}
				} while (!materialpregabarco.equals("prego e martelo"));
				// aqui voltamos ao switch grande
				break;
			case "prego e martelo":
				System.out.println("não tem como pregar madeira inteira. Escolha novamente");
				break;
			case "corda, plástico e tecido":
				System.out.println("você ainda não pode construir o remo. Escolha novamente");
				break;
			default:
				System.out.println("material inválido. Digite novamente respeitando as vírgulas e acentuações");
			}
		} while (!materialserrabarco.equals("madeira e serrote"));
	}

	public static void mapacoletes(String personagem) {
		String direction;
		int ale, codigo, lanterna = 0, contador = 1;
		System.out.println(
				"Após terminar a construção da jangada, você sente um grande alívio e um passo finalizado para a fuga. Porém, seu alívio não dura 10 segundos ao vir em sua mente as seguintes perguntas:");
		System.out.println("para qual lado eu vou ao colocar minha jangada no mar? E se a jangada afundar?");
		System.out.println(
				"É aí que você se lembra que mais um importante paço precisa ser dado, encontrar um mapa e dois coletes salva-vidas.");
		System.out.println(
				"Você se lembra que ao passar pela sala do capitão anteriormente você havia se deparado com um armário cheio de coletes e com um mapa sobre a mesa do capitão. Seu desafio agora é sair do convés para ir em busca dos 2 tesouros.");
		System.out.println("em que direção você deve seguir agora? Digite sul ou norte");
		direction = input.nextLine();
		if (direction.equals("sul")) {
			System.out.println(
					"a tontura e o cansaço desnortearam você, que acabou batendo com força na grade do convés, fazendo com que a força do seu corpo pesado a derrubasse no mar. Sem o amparo da grade para te conter, você é impulsionado para frente e se desequilibra, caindo no mar e virando alimento dos tubarões. Fim de jogo!");
			System.exit(0);
		}
		if (direction.equals("norte")) {
			System.out.println("você sai do convés e chega até as escadas. Digite descer para ir até o subsolo");
			direction = input.nextLine();
		}
		if (direction.equals("descer")) {
			System.out.println(
					"você avista a cozinha e fica em dúvida entre se alimentar ou seguir direto até a sala do capitão antes que seu tempo acabe. Digite oeste para entrar na cozinha ou norte para ir à sala");
			direction = input.nextLine();
		}
		if (direction.equals("norte")) {
			System.out.println(
					"você anda alguns paços e chega até a porta da sala do capitão. Mas antes mesmo de entrar, a fraqueza te vence e você cai desmaiado.");
			System.out.println("Ao acordar, nota que sua jangada havia desaparecido.");
			System.out.println(
					"Quando olha em direção ao mar, a avista sendo remada por 2 tripulantes que a roubaram, e, enquanto eles se salvam, seu destino é fazer suas últimas reflexões sobre a vida e se despedir de si mesmo, pois o naufrágio acontecerá em menos de 5 minutos e não haverá tempo para a construção de uma nova jangada. Fim de jogo!");
			System.exit(0);
		}
		if (direction.equals("oeste")) {
			System.out.println(
					"ao entrar na cozinha você avista sobre o fogão uma panela com um delicioso ensopado preparado no almoço e o devora rapidamente.");
			System.out.println("abrindo a geladeira, você encontra uma refrescante bebida para se hidratar");
			System.out.println(
					"após matar a sede e se alimentar você recupera energia para continuar com seus planos de fuga. Digite norte para ir até a sala do capitão");
			direction = input.nextLine();
			if (direction.equals("norte")) {
				System.out.println(
						"você chegou a sala do capitão. Digite 1 para ligar a lanterna ou 2 para procurar o mapa com a lanterna desligada");
				lanterna = input.nextInt();
				if (lanterna == 1) {
					System.out.println(
							"você encontrou o mapa mas a luz da lanterna fez com que o capitão te avistasse e você foi preso. Fim de jogo.");
					System.exit(0);
				}
				if (lanterna == 2) {
					System.out.println("minutos pareciam dias, mas você encontrou o mapa.");
					System.out.println(
							"agora digite um número entre 1 e 5 para abrir o armário e pegar dois coletes, um para você e outro para Giovanni. Você tem 3 tentativas");
					do {
						codigo = input.nextInt();
						ale = (int) (Math.random() * 5) + 1;
						if (codigo == ale) {
							System.out
									.println("a porta abriu e você pegou os coletes. Você acertou na tentativa número "
											+ contador);
							System.out.println("parabéns! O código era " + ale
									+ ". Desafio 4 concluído. Agora saia da sala enquanto ainda há tempo.");
							System.out.println("Habilidade desbloqueada: Mestre do mar");
							System.out.println("Habilidade aprimorada: Lógica II");
							desafioCinco(personagem);
						} else {
							System.out.println("código incorreto na tentativa número" + contador);
							contador++;
						}
						if (codigo != ale && contador > 3) {
							System.out.println("O código era " + ale
									+ ". Ao digitar o código incorreto 3 vezes, o armário fica bloqueado por 60 minutos. Até lá, você já estará mergulhado nas profundesas do mar! Fim de jogo!");
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

		System.out.println("Parabéns você chegou a última fase...");
		System.out.println(
				"Ohh não os outros tripulantes descobriram que você está prestes a sair do navio, escolha uma das opções e sobreviva:");
		do {
			System.out.println("Digite \"Correr\" para correr e deixar Giovanni para trás");
			System.out.println("Digite \"Ficar\" para ficar e lutar");
			opcao = input.next().toUpperCase();

			switch (opcao) {
			case "CORRER":
				System.out.println("Giovanni você está muito lento, se ficarmos iremos morrer !");
				System.out.println("Eu não posso te esperar mais, boa sorte.. \n");
				decisao(opcao, personagem);
				break;
			case "FICAR":
				System.out.println("E agora Giovanni? Se ficarmos iremos perder");
				System.out.println("Giovanni: Não se preocupe porque eu tenho um plano, vou subir no mastro e enquanto você luta aqui em baixo eu te cubro lá de cima");
				decisao(opcao, personagem);
				break;
			default:
				System.out.println("Opção errada");
			}
		} while (!opcao.equals("CORRER") || !opcao.equals("FICAR"));
	}

	public static void decisao(String opcao, String personagem) {
		String ver, escolha;
		
		if (opcao.equals("CORRER")) {
			System.out.println("Digite \"Subir\" para subir na jangada e ir para o mar ");
			System.out.println("Não foi uma boa escolha sair do navio sem Giovanni agora você não tem quem cubra a sua retaguarda e acabou de ser atingido");
			System.out.println("E agora o que você irá fazer?");

			System.out.println("Digite \"ver\" para olhar os itens da sua bolsa");
			ver = input.next().toUpperCase();
			bolsa(personagem, ver, null);

			if (ver.equals("VER")) {
				System.out.println("Enquanto você pegava a sua ferramenta um dos tripulantes conseguiu alcançar a nado e interceptou a sua jangada e te matou..");
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
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, não temos esse item na lista");
						break;
					}
				} while (escolha != "ESPADA" || escolha != "CANIVETE" || escolha != "LANTERNA");

			case "MATHEUS":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "ARMA DE FOGO":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, não temos esse item na lista");
						break;
					}
				} while (escolha != "CANIVETE" || escolha != "LANTERNA");
			case "JONAS":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "TRANQUILIZANTE":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, não temos esse item na lista");
						break;
					}
				} while (escolha != "TRANQUILIZANTE" || escolha != "CANIVETE" || escolha != "LANTERNA");
			case "THIAGO":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "CANIVETE":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					case "LIVRO":
						System.out.println("Você escolheu um bom item de defesa vamos lá");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, não temos esse item na lista");
						break;
					}
				} while (escolha != "LIVRO" || escolha != "CANIVETE" || escolha != "LANTERNA");
			}
		}
	}

	public static void retaFinal(String opcao, String personagem) {
		String decisao, subir;

		if (opcao.equals("FICAR")) {

			System.out.println("Tem dois oponentes vindo até você");
			System.out.println("Você tem duas opções");
			System.out.println("Digite \"Combate\" para entrar em combate com dois oponentes mesmo com Giovanni no apoio");
			System.out.println("Digite \"Confiar\" para confiar em Giovanni e lutar apenas contra um oponente");
			decisao = input.next().toUpperCase();

			switch (decisao) {
			case "COMBATE":
				System.out.println("Você não confiou em Giovanni");
				System.out.println("E entrou foi atingido por um dos oponentes");
				System.out.println("Giovanni por sua vez conseguiu atingir fatalmente os oponentes, porém não confia mais em você");
				decisao("CORRER", personagem);
				break;

			case "CONFIAR":
				System.out.println("Você confiou em Giovanni!");
				System.out.println("E Giovanni conseguiu interceptar um dos oponentes");

				do {
					System.out.println("Digite \"Subir\" para subir na jangada e ir para o mar ");
					subir = input.next().toUpperCase();

					System.out.println("Parabéns você conseguiu passar por todas as fases e se tornou O PATRULHEIRO DO MAR !!!");
					credito(true);

				} while (subir != "SUBIR");
				break;
			}
		}
	}

}
