package senac.algoritimosII.afuga;
import java.util.Scanner;

public class DesafioUm {

	private static Scanner input = new Scanner(System.in);
	
	public static void desafioUm(String personagem) {

		String comando1 = null;
		String comando2 = null;
		String comando3 = null;
		String comando4 = null;
		String comando5 = null;
		int tentativa = 0;
		
		do {

			System.out.println("\n \n Apos a forte tempestade, voce acorda e se da conta do acontecido. "
					+ "\n Ainda deitado na cama, abre os olhos. Olha ao redor e ve o dormitorio todo revirado. "
					+ "\n Voce tenta se mover, mas instantaneamente sente uma dor intensa. \n Para olhar ao seu redor, digite OLHAR");
			System.out.println("Digite OLHAR para olhar ao redor \n");
			comando1 = input.next().toUpperCase();

		}

		while (!comando1.equals("OLHAR"));

		System.out.println("\n Voce olha para seu braco e nota que esta ferido. "
				+ "\n Olha para o canto do quarto e ve seu kit de primeiros socorros. "
				+ "\n Olha para a direita e ve um pequeno arm�rio, onde voce se lembra que ha algumas ferramentas guardadas. "
				+ "\n Logo a sua frente, esta a porta que ao olhar bem voc� percebe que esta emperrada, essa porta te leva para a saida do alojamento. "
				+ "Voce precisa sair!!! \n ");

		do {

			System.out.println("CURAR - Se levantar, pegar o kit para se curar e ir ate a porta.");
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
						+ "\n Voce perdeu muito sangue e esta fraco, nao consegue abrir.");
				Bolsa.bolsa(personagem, "ADICIONAR", "\n PE de cabra");
				System.out.println("Continuar tentando abrir ou se curar para ter for�ar para abrir a porta? \n");

				do {
					System.out.println("Digite SIM para continuar for�ando a porta");
					System.out.println("Digite PEGAR para pegar o kit e se curar");
					comando4 = input.next().toUpperCase();

					switch (comando4) {
					case "SIM":
						tentativa = tentativa + 1;
						System.out.println("\n Voce esta perdendo muito sangue, deseja continuar forcando a porta? \n");

						break;
					case "PEGAR":
						System.out.println("\n Voce se curou e agora tem for�as para abrir a porta");
						System.out.println("Apos muito esforco voce conseguiu abrir a porta!!!\n");
						System.out.println("Habilidade desbloqueada: FORCA\n");
						System.out.println("Se lembre que voc� escondeu seu amigo Giovanni no container."
								+ "\n Voc� precisa resgata-lo. Va ate o conves e o procure! \n");
						break;
					default:
						System.out.println("Opcao inv�lida");
						break;
					}
				} while (!comando4.equals("PEGAR") && (tentativa < 3));

				if (!comando4.equals("PEGAR")) {
					System.out.println("Voce morreu...");

					Credito.credito(false);
				}

				break;
			default:
				System.out.println("Opcao��o Inv�lida");
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
	
	
	public static void parteUm() {
		
		Scanner input = new Scanner(System.in);
		
		String opcao = input.next().toUpperCase();
		
		do {
			
			System.out.println("Digite OLHAR para olhar ao redor \n");
			opcao = input.next().toUpperCase();

		}

		while (!opcao.equals("OLHAR"));
		
	}
	
	public static void parteDois(String personagem) {
		
		Scanner input = new Scanner(System.in);
		String opcao = "";
		int tentativa = 0;


		System.out.println("\n Voce olha para seu braco e nota que esta ferido. "
				+ "\n Olha para o canto do quarto e ve seu kit de primeiros socorros. "
				+ "\n Olha para a direita e ve um pequeno arm�rio, onde voce se lembra que ha algumas ferramentas guardadas. "
				+ "\n Logo a sua frente, esta a porta que ao olhar bem voc� percebe que esta emperrada, essa porta te leva para a saida do alojamento. "
				+ "Voce precisa sair!!! \n ");

		do {

			System.out.println("CURAR - Se levantar, pegar o kit para se curar e ir ate a porta.");
			System.out.println("PEGAR - Se levantar, ir at� o arm�rio pegar o p� de cabra e ir at� a porta. \n ");
			System.out.println("Escolha op��o CURAR ou PEGAR");
			opcao = input.next().toUpperCase();

			switch (opcao) {
			case "CURAR":
				System.out.println("\n Voc� se levanta lentamente da cama e caminha com dificuldade at� o kit."
						+ "\n Consegue se curar e vai at� a porta para tentar abri-la. "
						+ "\n A porta est� emperrada e voc� precisa de alguma ferramenta para abrir");
				System.out.println("Continuar tentando abrir ou pegar ferramenta para abrir a porta? \n ");
				do {

					System.out.println("SIM para Continuar for�ando a porta");
					System.out.println("PEGAR para Pegar ferramenta");
					opcao = input.next().toUpperCase();

					switch (opcao) {
					case "SIM":

						System.out.println("\n A porta esta emperrada e voce precisa de alguma ferramenta para abri-la");
						System.out.println("Continuar tentando abrir ou pegar ferramenta para abrir a porta? \n");

						break;
					case "PEGAR":
						System.out.println("Voce pegou o pe de Cabra!");
						System.out.println("Apos muito esforco voce conseguiu abrir a porta!!!\n");
						System.out.println("Habilidade desbloqueada: FORCA\n");
						System.out.println("Se lembre que voce escondeu seu amigo Giovanni no container."
								+ "\n Voce precisa resgata-lo. Va ate o conves e o procure!");
						break;
					default:
						System.out.println("Opcao invalida");
						break;
					}
				} while (!opcao.equals("PEGAR"));
				break;

			case "PEGAR":
				System.out.println("\n Voce se levanta lentamente da cama e caminha com dificuldade ate o armario,"
						+ "\n pega o pe de cabra e vai ate a porta para tentar abri-la. "
						+ "\n Voce perdeu muito sangue e esta fraco, nao consegue abrir.");
				Bolsa.bolsa(personagem, "ADICIONAR", "\n P� de cabra");
				System.out.println("Continuar tentando abrir ou se curar para ter forcar para abrir a porta? \n");

				do {
					System.out.println("Digite SIM para continuar forcando a porta");
					System.out.println("Digite PEGAR para pegar o kit e se curar");
					opcao = input.next().toUpperCase();

					switch (opcao) {
					case "SIM":
						tentativa = tentativa + 1;
						System.out.println("\n Voce esta perdendo muito sangue, deseja continuar forcando a porta? \n");

						break;
					case "PEGAR":
						System.out.println("\n Voce se curou e agora tem forcas para abrir a porta");
						System.out.println("Apos muito esforco voce conseguiu abrir a porta!!!\n");
						System.out.println("Habilidade desbloqueada: FORCA\n");
						System.out.println("Se lembre que voce escondeu seu amigo Giovanni no container."
								+ "\n Voce precisa resgata-lo. Va ate o conves e o procure! \n");
						break;
					default:
						System.out.println("Opcao invalida");
						break;
					}
				} while (!opcao.equals("PEGAR") && (tentativa < 3));

				if (!opcao.equals("PEGAR")) {
					System.out.println("Voce morreu...");

					Credito.credito(false);
				}

				break;
			default:
				System.out.println("Opcao Invalida");
				break;
			}
		} while ((!"CURAR".equals(opcao)) && (!"PEGAR".equals(opcao)));
		
	}
	
	public static void parteTres() {
		
		Scanner input = new Scanner(System.in);
		String opcao = "";
		
		do {
			System.out.println("Digite IR para encontrar Giovanni");
			opcao = input.next().toUpperCase();
		} while (!"IR".equals(opcao));

		System.out.println("\n Ao sair do quarto, voce sobe a escada que esta a sua frente,"
				+ "\n Ao chegar no topo voce vira a esquerda em um corredor longo e estreito. \n");
	}
	
	
	
	
	
	
}
