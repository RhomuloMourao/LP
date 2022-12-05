/*
 * Ex10Lista7.java

 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex10Lista7 {
	
	public static void main (String[] args) {
		
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contador = 0;
		String frase = "";
		System.out.print("Digite uma frase: ");
		frase = tecladoSTR.nextLine();
		
		for(char alfabeto = 'A' ; alfabeto <='Z'; alfabeto++){
			
			for(int i = 0; i<frase.length(); i++){
				
				if(frase.charAt(i) == alfabeto){
					
					contador++;

				}
				
			}
		}
	System.out.println( "Na frase: \"" + frase+"\"" + "tem " + contador + " letras maiusculas");
	}
}

