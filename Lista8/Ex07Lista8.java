/*
 * Ex07Lista8.java
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex07Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int maiorNumero = 0;
		int menorNumero = 0;
		System.out.print("Digite a dimensao do vetor: ");
		int dimensao = teclado.nextInt();
		
		int vetor[] = new int[dimensao];
		
		for(int a = 0 ; a< dimensao ; a++){
			
			System.out.print("Indice " + a + ": ");
			vetor[a] = teclado.nextInt();
			if(a == 0){
				menorNumero = vetor[a];
				}
			if(vetor[a] > maiorNumero){
				maiorNumero = vetor[a];
				}
				if(vetor[a] < menorNumero){
					menorNumero = vetor[a];
				}
					
			}
		System.out.println("Maior numero : " + maiorNumero );
		System.out.println("Menor numero: " + menorNumero);
	}
}

