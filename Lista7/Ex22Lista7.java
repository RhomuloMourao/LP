/*
 * Ex22Lista7.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Ex22Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.print("Digite um frase: ");
		String frase = tecladoSTR.nextLine().toLowerCase();
		
		System.out.print("Digite uma palavra: ");
		String palavra = tecladoSTR.nextLine().toLowerCase();
		
		for(int a = 0 ; a < frase.length() ; a++){
			
			if(frase.substring(a).startsWith(palavra)){
			contador++;
			
		}
			
			}
		System.out.println("A palavra " + palavra + " ocorre "+contador + " vezes nesta frase");
	}
}

