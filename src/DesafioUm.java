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
				Bolsa.bolsa(personagem, "ADICIONAR", "\n P� de cabra");
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

					Credito.credito(false);
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
}
