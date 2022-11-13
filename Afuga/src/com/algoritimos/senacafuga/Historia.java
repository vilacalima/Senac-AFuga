package com.algoritimos.senacafuga;
import java.io.IOException;

public class Historia {
	private static String historia = null;
		
	public static String historiaDesafioUm() {
		
		historia = """
                           Apos a forte tempestade, voce acorda e se da conta do acontecido. 
                            Ainda deitado na cama, abre os olhos. Olha ao redor e ve o dormitorio todo revirado. 
                            Voce tenta se mover, mas instantaneamente sente uma dor intensa. 
                            Para olhar ao seu redor, digite OLHAR""";		
		
		return historia;
		
	}
        
        public static String historiaDesafioDois(){
            historia = """
                  2 desafio - Encontre o Giovanni
                  Dessa ve voce nao ira precisar de materias! Voce ira precisar realizar um calculo matematico. 
                  Veja bem... Voce esta localizado no container 260, para sair voce deve sabr o numero do container em que esta,
                  somar por 2 e dividir por 3
                #### ESCOLHA AS OP��ES ABAIXO ####
		Digite \"DICA\" para obter uma dica");
		Digite \"NAO\" caso n�o precise de ajuda
		Digite \"AJUDA\" para ter uma ajuda \n""";
		
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
	
	
	
}
