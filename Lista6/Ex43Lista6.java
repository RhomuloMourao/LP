/*
 * Ex43Lista6.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Ex43Lista6 {
	public static void main (String[] args) {
		
			Scanner teclado = new Scanner(System.in);
		int numero;
		
		
		for(int a = 1 ; a <= 7; a++){
			int calculo = 1;
			
		System.out.print("Digite um numero: ");
		numero = teclado.nextInt();
		
		for(int b = numero ; b >= 1 ; b--){
			
		calculo *= b;	
			
			
			}
			System.out.println(calculo);
			
	}
	
		
	}
}

