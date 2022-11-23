/*
 * Ex41Lista6.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex41Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, numero;
		System.out.print("Digite o numero: ");
		numero = teclado.nextInt();
		int conta = 1;
		
		for(a = numero ; a >= 1 ; a--){
			
			conta *=a;
			
			
			
			}
		System.out.println("A resposta e: " + conta);
		
	}
}

