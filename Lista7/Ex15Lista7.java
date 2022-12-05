/*
 * Ex15Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex15Lista7 {
	
	public static void main (String[] args) {
		
		Scanner tecladoSTR = new Scanner(System.in);
		
		boolean temNumero = false;
		String frase = "";
		System.out.print("Digite uma frase: ");
		frase = tecladoSTR.nextLine();
		
		
		for(char numeros = '0' ; numeros <= '9' ; numeros++ ){
			
			for(int a = 0 ; a< frase.length() ; a++ ){
				
				if(frase.charAt(a) == numeros ){
				
				temNumero = true;
				
				}
			}
		}
		if(temNumero == true){
			
			System.out.print("Possui numeros!");
			
			
			}else{
				
				System.out.print("Nao possui numeros!");
				
				}
		
	}
}

