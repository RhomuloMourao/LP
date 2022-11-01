/*
 * Ex5Lista6.java
 
 */

import java.util.Scanner;
public class Ex5Lista6 {
	
	public static void main (String[] args) {
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		while(numero <= 0){
			
			System.out.print("Numero invalido digite um outro numero: ");
			numero = teclado.nextInt();
		}
			
		for(int a = 0; a <= numero ; a++){
			
			System.out.println(a);
			
			
		
	}
		
		
		
	}
}

