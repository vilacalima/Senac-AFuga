package com.algoritimos.senacafuga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.UUID;


public class Arquivo {
	
	public static void gerarArquivo() { 

//		cria a pasta
		File file = new File("Afuga"); 
		file.mkdir(); 
		
//		cria o arquivo
		File arquivo = new File("Afuga/fases.txt"); 

		try { 
			arquivo.createNewFile(); 

		} catch (IOException e) { 
			e.printStackTrace(); 
		} 
	}
	
	public static void lerArquivo(String caminho) throws Exception {
		Path path = Paths.get(caminho);
		String conteudo = new String(Files.readAllBytes(path), StandardCharsets.ISO_8859_1);
		System.out.println(conteudo);
	}
	
	public static void gerar() throws Exception {
		Path novoDiretorio = Files
				.createDirectory(Path.of("./ranking" + UUID.randomUUID()));
		System.out.println("Novo diretório:" + novoDiretorio.toAbsolutePath());

		Path novoArquivo = Files.createFile(novoDiretorio.resolve("novoArquivo.txt"));
		System.out.println("Novo arquivo:" + novoArquivo.toAbsolutePath());

		for (int i = 0; i <= 9; i++)
			Files.writeString(novoArquivo, "Valor gerado é " + UUID.randomUUID() + "\r\n", StandardCharsets.ISO_8859_1,
					StandardOpenOption.APPEND);
	}
}