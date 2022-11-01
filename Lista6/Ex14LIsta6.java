/*
 * Ex14LIsta6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex14LIsta6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int soma = 0;
		System.out.print("Escreva um valor: ");
		int valorum = teclado.nextInt();
		
		System.out.print("Escreva outro valor: ");
		int valordois = teclado.nextInt();
		
		for(int a = valorum ; a<=valordois ; a++){
			
		soma = soma + a;	
			
			}
		
		System.out.println("A soma e: " + soma);
		
	}
}

