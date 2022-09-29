import java.io.IOException;
import java.util.Scanner;

public class Jogo {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String resposta, ver, escolha;
//		Inicio do Jogo
		resposta = Historia.historiaInicial();
		System.out.println(resposta);
//		Descri��o e escolha dos personagens		
		resposta = Personagens.descricao();
		System.out.println(resposta);

		
		System.out.println("Escolha a sua classe: ");
		String personagem = input.next().toUpperCase();
		
		resposta = Personagens.classe(personagem);
		System.out.println(resposta);
				
		ver = input.next().toUpperCase();
		Bolsa.bolsa(personagem, ver, null);
		
		  // Desafios
		  
			/*
			 * DesafioUm.desafioUm(personagem); DesafioDois.desafioDois(personagem);
			 * DesafioTres.desafioTres(personagem); DesafioQuatro.desafioQuatro(personagem);
			 */
			/* Desafio Cinco */
		System.out.println("Parab�ns voc� chegou na �ltima fase...");
		System.out.println("Ohh n�o os outros tripulantes descobriram que voc� est� prestes a sair do navio, escolha uma das opi��es e sobreviva:");
		System.out.println("Digite \"Correr\" para correr e deixar Giovanni para tr�s");
		System.out.println("Digite \"Ficar\" para ficar e lutar");
		escolha = input.next();
		
		resposta = DesafioQuatro.inicio(personagem, escolha);
		System.out.println(resposta);
	}
}
