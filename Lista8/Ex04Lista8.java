/*
 * Ex04Lista8.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex04Lista8 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o numero de posicoes: ");
		int posicoes = teclado.nextInt();
		
		while(posicoes > 20 || posicoes < 0){
			
			System.out.print("INVALIDO! Digite um valor menor ou igual a 20: ");
			posicoes = teclado.nextInt();
			
			}
		
		int[] d = new int[posicoes];
		
		for(int a = 0; a < posicoes ; a++){
			
			
			System.out.print("Indice " + a + ": " );
			d[a] = teclado.nextInt();
			
			
			}
			
			System.out.print("Saida: ");
			for(int b = 0; b < posicoes ; b++){
			
			
			System.out.print(d[b] + " ");
			
			
			
			}
		
		
		
		
	}
}

