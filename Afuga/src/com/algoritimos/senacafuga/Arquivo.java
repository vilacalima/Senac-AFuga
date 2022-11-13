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


public class Arquivo {
	
	public static void gerarArquivo() { 

		File file = new File("Afuga"); 
		file.mkdir(); 
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
}