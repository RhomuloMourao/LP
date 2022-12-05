/*
 * Ex13Lista7.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex13Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.print("Digite uma frase: ");
		String frase = tecladoSTR.nextLine().toUpperCase();
		
		String consoantes = "BCDFGHJKLMNPQRSTVWXYZ";
		
		for(int a = 0; a < frase.length() ; a++){
			
			for(int b = 0; b < consoantes.length() ; b++){
			
			if (frase.charAt(a) == consoantes.charAt(b)){
				contador++;
				}
			}
		}
		System.out.println("Nesta tem " + contador + " consoante(s)");
	}
}

