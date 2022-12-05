/*
 * Ex16Lista7.java
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Ex16Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		String frase = "";
		boolean temMinuscula = false;             
		
		System.out.print("Digite uma frase: ");
		frase = tecladoSTR.nextLine();
		
		//Verificar se tem minusculas           
		for(char letrasMinusculas = 'a' ; letrasMinusculas <= 'z' ; letrasMinusculas ++){
			
			for(int a = 0 ; a < frase.length() ; a++){
				
				if(frase.charAt(a) == letrasMinusculas){
					
					temMinuscula = true;
					}
				}
			}
			//Se tiver minuscula, a frase nao sera feita apenas de maiuscula
		if(temMinuscula == true){
			System.out.print("Nao contem apenas letras maiusculas");
			
			}else{
				System.out.print("Contem apenas caracteres maiusculos!!");
				
				}
		
		
		
		
	}
}

