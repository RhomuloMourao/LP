/*
 * Ex5Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex5Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contador = 0;
		System.out.print("Digite uma frase: ");
		String frase = tecladoSTR.nextLine();
		
		for(int a = 0; a < frase.length() ; a++){
			
			if((frase.charAt(a) == 'a') || (frase.charAt(a) == 'A')){
				
				contador++;
				}
			
			}
		System.out.print("Nesta frase a letra a foi utilizada " + contador + "vez(es)");
		
	}
}

