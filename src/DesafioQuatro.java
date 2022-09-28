import java.util.Scanner;

public class DesafioQuatro {
	private static Scanner input = new Scanner(System.in);
	public static String inicio(String personagem, String opcao) {
		String resposta;
		
		do {
			switch (opcao) {
			case "CORRER":
				resposta = "Giovanni você é muito lento, se ficarmos iremos morrer ! \n"
						+ "Eu não posso te esperar mais, boa sorte.. \n";
				decisao(opcao, personagem);
				break;
			case "FICAR":
				resposta = "E agora Giovanni? Se ficarmos iremos perder \n"
						+ "Giovanni: Não se preocupe porque eu tenho um plano, vou subir no mastro e enquanto você luta aqui em baixo eu te cubro lá de cima";
				decisao(opcao, personagem);
				break;
			default:
				resposta = "Opção errada";
			}
		} while (!opcao.equals("CORRER") || !opcao.equals("FICAR"));
		return resposta;
	}
	
	public static void decisao(String opcao, String personagem) {
		String ver, escolha;
		
		if (opcao.equals("CORRER")) {
			System.out.println("Digite \"Subir\" para subir na jangada e ir para o mar ");
			System.out.println("Nï¿½o foi uma boa escolha sair do navio sem Giovanni agora vocï¿½ nï¿½o tem quem cubra a sua retaguarda e acabou de ser atingido");
			System.out.println("E agora o que vocï¿½ irï¿½ fazer?");

			System.out.println("Digite \"ver\" para olhar os itens da sua bolsa");
			ver = input.next().toUpperCase();
			Bolsa.bolsa(personagem, ver, null);

			if (ver.equals("VER")) {
				System.out.println("Enquanto vocï¿½ pegava a sua ferramenta um dos tripulantes conseguiu alcanï¿½ar a nado e interceptou a sua jangada e te matou..");
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
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, nï¿½o temos esse item na lista");
						break;
					}
				} while (escolha != "ESPADA" || escolha != "CANIVETE" || escolha != "LANTERNA");

			case "MATHEUS":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "ARMA DE FOGO":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, nï¿½o temos esse item na lista");
						break;
					}
				} while (escolha != "CANIVETE" || escolha != "LANTERNA");
			case "JONAS":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "TRANQUILIZANTE":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "CANIVETE":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, nï¿½o temos esse item na lista");
						break;
					}
				} while (escolha != "TRANQUILIZANTE" || escolha != "CANIVETE" || escolha != "LANTERNA");
			case "THIAGO":
				do {
					System.out.println("Escolha o seu item");
					escolha = input.next().toUpperCase();

					switch (escolha) {
					case "CANIVETE":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "LANTERNA":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					case "LIVRO":
						System.out.println("Vocï¿½ escolheu um bom item de defesa vamos lï¿½");
						retaFinal("FICAR", personagem);
						break;
					default:
						System.out.println("Ops, nï¿½o temos esse item na lista");
						break;
					}
				} while (escolha != "LIVRO" || escolha != "CANIVETE" || escolha != "LANTERNA");
			}
		}
	}

	public static void retaFinal(String opcao, String personagem) {
		String decisao, subir;

		if (opcao.equals("FICAR")) {

			System.out.println("Tem dois oponentes vindo atï¿½ vocï¿½");
			System.out.println("Vocï¿½ tem duas opï¿½ï¿½es");
			System.out.println("Digite \"Combate\" para entrar em combate com dois oponentes mesmo com Giovanni no apoio");
			System.out.println("Digite \"Confiar\" para confiar em Giovanni e lutar apenas contra um oponente");
			decisao = input.next().toUpperCase();

			switch (decisao) {
			case "COMBATE":
				System.out.println("Vocï¿½ nï¿½o confiou em Giovanni");
				System.out.println("E entrou foi atingido por um dos oponentes");
				System.out.println("Giovanni por sua vez conseguiu atingir fatalmente os oponentes, porï¿½m nï¿½o confia mais em vocï¿½");
				decisao("CORRER", personagem);
				break;

			case "CONFIAR":
				System.out.println("Vocï¿½ confiou em Giovanni!");
				System.out.println("E Giovanni conseguiu interceptar um dos oponentes");

				do {
					System.out.println("Digite \"Subir\" para subir na jangada e ir para o mar ");
					subir = input.next().toUpperCase();

					System.out.println("Parabï¿½ns vocï¿½ conseguiu passar por todas as fases e se tornou O PATRULHEIRO DO MAR !!!");
					Credito.credito(true);

				} while (subir != "SUBIR");
				break;
			}
		}
	}
}
