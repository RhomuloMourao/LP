/*
 * Ex12Lista7.java
 
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex12Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		System.out.print("Digite uma frase: ");
		String frase = tecladoSTR.nextLine();
		
		
		
		for(int a = 0; a < frase.length() ; a++){
			
			if((frase.charAt(a) == 'a' || frase.charAt(a) == 'A' )){
				
				contadorA++;
				}
				if((frase.charAt(a) == 'e' || frase.charAt(a) == 'E' )){
				
				contadorE++;
				}
				if((frase.charAt(a) == 'i' || frase.charAt(a) == 'I' )){
				
				contadorI++;
				}
				if((frase.charAt(a) == 'o' || frase.charAt(a) == 'O' )){
				
				contadorO++;
				}
				if((frase.charAt(a) == 'u' || frase.charAt(a) == 'U' )){
				
				contadorU++;
				}
			
			}
		System.out.println("Nesta frase a letra 'a' aparece " + contadorA + " veze(s)");
		System.out.println("Nesta frase a letra 'e' aparece " + contadorE + " veze(s)");
		System.out.println("Nesta frase a letra 'i' aparece " + contadorI + " veze(s)");
		System.out.println("Nesta frase a letra 'o' aparece " + contadorO + " veze(s)");
		System.out.println("Nesta frase a letra 'u' aparece " + contadorU + " veze(s)");
	}
}

