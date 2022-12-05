/*
 * Ex7Lista7.java
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex7Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contador = 0;
		String frase = "";
		System.out.print("Digite uma frase: ");
		frase = tecladoSTR.nextLine();
		
		for(char alfabeto = 'a' ; alfabeto <='z'; alfabeto++){
			
			for(int i = 0; i<frase.length(); i++){
				
				if(frase.toLowerCase().charAt(i) == alfabeto){
					
					contador++;
					}
				
				}
			System.out.println("O caracter " + alfabeto + " aparece " + contador + "veze(s) na frase: \"" + frase+"\"");
			contador = 0;
			}
		
	}
}

