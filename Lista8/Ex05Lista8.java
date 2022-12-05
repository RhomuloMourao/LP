/*
 * Ex05Lista8.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex05Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite a dimensao dos vetores: ");
		int dimensao = teclado.nextInt();
		
		
		
		while (dimensao > 15 || dimensao < 1){
			System.out.print("INVALIDO! Digite uma dimensao valida: ");
			dimensao = teclado.nextInt();
			
			}
		
		int[] vetorA = new int[dimensao];
		int[] vetorB = new int[dimensao];
		int [] vetorC = new int[dimensao];
		for (int a = 0 ; a<dimensao ; a++){
			
			System.out.print("Vetor A Indice " + a + ": ");
			vetorA[a] = teclado.nextInt();
			}
		for (int b = 0 ; b < dimensao ; b++){
			System.out.print("Vetor B Indice " + b + ": ");
			vetorB[b] = teclado.nextInt();
			
			}
			
			 
			for(int c = 0; c< dimensao ; c++){
				
				vetorC[c] = vetorA[c] + vetorB[c];
				
				}
				
				System.out.println("\nResposta: ");
			for(int i = 0 ; i < dimensao ; i++){
				
				System.out.println("Vetor C Indice " + i + " : " + vetorC[i]);
				
				}
			
	}
}

