/*
 * Ex14Lista7.java
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex14Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contador = 0;
		System.out.print("Digite uma frase: ");
		String frase = tecladoSTR.nextLine();
		
		System.out.print("Digite o caracter a ser substituido: ");
		String caracter = tecladoSTR.next();
		for(int a = 0; a < frase.length() ; a++){
			
			if((frase.toUpperCase().charAt(a) == caracter.toUpperCase().charAt(0))){
				
				frase = frase.replace(caracter.charAt(0), '*');
				}
			
			}
		System.out.print("Nova frase: " + frase);
		
	}
}

