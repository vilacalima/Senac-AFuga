package com.algoritimos.senacafuga;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


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
}