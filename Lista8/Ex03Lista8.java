/*
 * Ex03Lista8.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex03Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o numero de posicoes: ");
		int posicoes = teclado.nextInt();
		
		int[] c = new int[posicoes];
		
		for(int a = 0; a < posicoes ; a++){
			
			
			System.out.print("Indice " + a + ": " );
			c[a] = teclado.nextInt();
			
			
			}
			
			System.out.print("Saida: ");
			for(int b = 0; b < posicoes ; b++){
			
			
			System.out.print(c[b] + " ");
			
			
			
			}
		
		
	}
}

