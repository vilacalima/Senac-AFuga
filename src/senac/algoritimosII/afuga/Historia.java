package senac.algoritimosII.afuga;
import java.io.IOException;

public class Historia {
	private static String historia = null;
	public static String historiaInicial() throws IOException {
		
		historia = "***A FUGA***\r\n" 
				+ "\r\n Ap�s vender carga roubada por engano Giovanni teve que fugir da cidade de santos.\r\n"
				+ "Ao entrar em um navio cargueiro onde trabalhavam seus amigos seguiu em dire��o ao Rio de Janeiro \r\n" 
				+ "Mas durante a viagem o inesperado aconteceu, o navio que Giovanni estava colidiu com outro de menor porte, causando um naufr�gio.\r\n"
				+ "E agora Giovanni?\r\n" 
				+ "Junte for�as, colete itens, entre nessa briga e sobreviva!\r\n"
				+ "Boa Sorte!\r\n";
		return historia;
	}
	
	public static String historiaDesafioQuatro(String personagem) throws IOException {
		
		historia = "Parabéns " + personagem + " você chegou na última fase... \r\n" 
				+ "Ohh não os outros tripulantes descobriram que você está prestes a sair do navio, escolha uma das opõees e sobreviva: \r\n"
				+ "Digite \"Correr\" para correr e deixar Giovanni para tr�s \r\n"
				+ "Digite \"Ficar\" para ficar e lutar \r\n";
								
		return historia;
	}
}
