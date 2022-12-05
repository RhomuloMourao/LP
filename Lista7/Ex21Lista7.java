/*
 * Ex21Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex21Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		System.out.print("Digite um frase: ");
		String frase = tecladoSTR.nextLine();
		
		
		String palavras[] = frase.split(" ");
		
		for (int a = 0; a< palavras.length ; a++){
			System.out.println(palavras[a]);
			}
		
	}
}

