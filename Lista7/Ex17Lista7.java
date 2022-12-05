/*
 * Ex17Lista7.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex17Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		String frase1 = "", frase2 = "";
		
		System.out.print("Digite a primeira frase: ");
		frase1 = tecladoSTR.nextLine().trim().toUpperCase();
		
		System.out.print("Digite a segunda frase: ");
		frase2 = tecladoSTR.nextLine().trim().toUpperCase();
		
		if(frase1.length() == frase2.length()){
			boolean is = true;
			for(int a = 0 ; a< frase1.length() ; a++){
				if(frase1.charAt(a) != frase2.charAt(a)){
					
					is = false;
					break;
				}	
			}
		System.out.println("Sao iguais? " + (is?"sim!!":"nao!"));	
			
		}else{
			
			System.out.print("tamanhos diferentes, frases nao sao iguais!!");
			}
	}
}

