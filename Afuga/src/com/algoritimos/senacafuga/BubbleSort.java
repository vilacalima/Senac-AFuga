package com.algoritimos.senacafuga;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.UUID;

public class BubbleSort {

	private static final Integer TAMANHO_VETOR = 10000;

	public static void main(String[] args) throws IOException {
		System.out.println(BubbleSort.class + " - Ordenando aguarde...");
		Integer valores[] = new Integer[TAMANHO_VETOR];

		Random random = new Random();
		for (int i = 0; i <= TAMANHO_VETOR - 1; i++)
			valores[i] = random.ints(1, TAMANHO_VETOR).findAny().getAsInt();
		
		gerarArquivo(valores, "entrada");

		Instant start = Instant.now();

		int aux = 0;
		for (int i = 0; i < valores.length - 1; i++) {
			for (int j = 0; j < valores.length - i - 1; j++) {
				if (valores[j] > valores[j + 1]) {
					aux = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = aux;
				}
			}
		}

		Instant end = Instant.now();
		System.out.println(BubbleSort.class + " - ##### Duração da ordenação: " + Duration.between(start, end));

		gerarArquivo(valores, "saida");
	}

	private static void gerarArquivo(Integer valores[], String suffix) throws IOException {
		System.out.println(BubbleSort.class + " - Gravando em um arquivo");
		Path bubbleSortDiretorio = Files
				.createDirectory(Paths.get("./bubbleSortDiretorio-" + suffix + "-" + UUID.randomUUID()));
		Path bubbleSortArquivo = Files.createFile(bubbleSortDiretorio.resolve("bubbleSort-" + suffix + ".txt"));
		for (Integer valor : valores)
			Files.write(bubbleSortArquivo, (valor + "\r\n").getBytes(StandardCharsets.ISO_8859_1),
					StandardOpenOption.APPEND);
		System.out.println(BubbleSort.class + " - Arquivo gerado com sucesso");
	}

}