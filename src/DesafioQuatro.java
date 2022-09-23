import java.util.Scanner;

public class DesafioQuatro {
	private static Scanner input = new Scanner(System.in);
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
			Bolsa.bolsa(personagem, ver, null);

			if (ver.equals("VER")) {
				System.out.println("Enquanto voc� pegava a sua ferramenta um dos tripulantes conseguiu alcan�ar a nado e interceptou a sua jangada e te matou..");
				System.out.println("FIM DE JOGO !");
				Credito.credito(false);
			}
		} else if (opcao.equals("FICAR")) {
			System.out.println("Olhe a sua bolsa e pegue algo para sua defesa");
			System.out.println("Digite \"ver\" para pegar um item na sua bolsa ");
			ver = input.next().toUpperCase();
			Bolsa.bolsa(personagem, ver, null);

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
					Credito.credito(true);

				} while (subir != "SUBIR");
				break;
			}
		}
	}
}
