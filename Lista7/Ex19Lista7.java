/*
 * Ex19Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex19Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		String palavra = "";
		String saida = "";
		System.out.print("Digite uma palavra: ");
		palavra = tecladoSTR.nextLine().toLowerCase();
		
		for (int i = (palavra.length()-1) ; i>=0 ; i--){
		saida = saida + palavra.charAt(i);
		
			}
			
		System.out.println("Ao contrario: " + saida);

			
				
		if ( palavra.equalsIgnoreCase(saida)){
			System.out.print("E um palindromo!");		
			
		} else {
					
			System.out.print("Nao e um palindromo!");		
		}
	
	}
}

