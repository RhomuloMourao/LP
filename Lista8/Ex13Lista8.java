/*
 * Ex13Lista8.java
 
 */

import java.util.Scanner;
public class Ex13Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite a dimensao do vetor P: ");
		int dimensaoN = teclado.nextInt();
		
		System.out.print("Digite a dimensao do vetor Q: ");
		int dimensaoM = teclado.nextInt();
		
		while (dimensaoN > 10 || dimensaoN < 1){
			System.out.print("INVALIDO! Digite uma dimensao do vetorP valida: ");
			dimensaoN = teclado.nextInt();
			
			}
		
		while (dimensaoM > 15 || dimensaoM < 1){
			System.out.print("INVALIDO! Digite uma dimensao do vetorQ valida: ");
			dimensaoM = teclado.nextInt();
			
			}
			
		int[] vetorP = new int[dimensaoN];
		int[] vetorQ = new int[dimensaoM];
		int[] vetorR = new int[dimensaoM + dimensaoN];
		int aux1 = 0; 
		int aux2 = 0;
		System.out.println("///// VETOR P //////");
		for (int a = 0 ; a<dimensaoN ; a++){
			
			System.out.print("Vetor P Indice " + a + ": ");
			vetorP[a] = teclado.nextInt();
			}
			System.out.println("///// VETOR Q //////");
		for (int b = 0 ; b < dimensaoM ; b++){
			System.out.print("Vetor Q Indice " + b + ": ");
			vetorQ[b] = teclado.nextInt();
			
			}
			
			 
			for(int c = 0; c< dimensaoM + dimensaoN ; c++){
				
				if(c < dimensaoN ){
				vetorR[c] = vetorP[aux1];
				aux1++;
				}
				if(c > dimensaoN-1){
					vetorR[c] = vetorQ[aux2];
					aux2++;
					
					}
				}
				System.out.println("\nResposta: ");
			for(int i = 0 ; i < dimensaoN + dimensaoM ; i++){
				
				System.out.println("Vetor R Indice " + i + " : " + vetorR[i]);
				
				}
	}
}

