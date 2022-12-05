/*
 * Ex20Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex20Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		String frase = "";
		
		System.out.print("Digire uma frase: ");
		frase = tecladoSTR.nextLine().toLowerCase();
		
		String palavras[] = frase.split(" ");
		
		for (int a = 0; a< palavras.length ; a++){
			System.out.println(a + ":" + palavras[a]);
			}
		
		System.out.print("Quantidade de palavras: " + palavras.length);
	}
}

