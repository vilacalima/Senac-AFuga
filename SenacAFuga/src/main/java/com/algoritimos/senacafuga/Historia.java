package com.algoritimos.senacafuga;
import java.io.IOException;

public class Historia {
	private static String historia = null;
	public static String historiaInicial() throws IOException {
		
		historia = """
                           ***A FUGA***\r
                           \r
                            Ap\ufffds vender carga roubada por engano Giovanni teve que fugir da cidade de santos.\r
                           Ao entrar em um navio cargueiro onde trabalhavam seus amigos seguiu em dire\ufffd\ufffdo ao Rio de Janeiro \r
                           Mas durante a viagem o inesperado aconteceu, o navio que Giovanni estava colidiu com outro de menor porte, causando um naufr\ufffdgio.\r
                           E agora Giovanni?\r
                           Junte for\ufffdas, colete itens, entre nessa briga e sobreviva!\r
                           Boa Sorte!\r
                           """;
		return historia;
	}
	
	public static String historiaDesafioUm() {
		
		historia = """
                           Apos a forte tempestade, voce acorda e se da conta do acontecido. 
                            Ainda deitado na cama, abre os olhos. Olha ao redor e ve o dormitorio todo revirado. 
                            Voce tenta se mover, mas instantaneamente sente uma dor intensa. 
                            Para olhar ao seu redor, digite OLHAR""";		
		
		return historia;
		
	}
        
        public static String historiaDesafioTres(){
            
            historia = """
                       \n Parabéns!
                        Você chegou ao terceiro desafio.\n \n Após encontrar Giovanni e retira-lo do Container, chegou a hora de sobreviver!
		Procure por itens que estão localizados no navio para constru��o de uma jangada pequena e forte o suficiente para suportar 2 pessoas. 
		Escolha os proximos passos:
                Digite \"INICIAR\" Para dar in�cio ao Desafio.
                Digite \"SAIR\" Para pular do Navio.
	        ATENÇÃO !  Ao escolher pular do navio você perdera todo seu progresso !! """;
           
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
