/*
 * Ex15Lista8.java
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex15Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite a quantidade de elementos do vetor S: ");
		int elementosN = teclado.nextInt();
		
		while(elementosN > 10 || elementosN < 1){
			
			System.out.print("INVALIDO! Coloque a quantidade de elementos do vetor S: ");
			elementosN = teclado.nextInt();
			
			}
		
		System.out.print("Digite a quantidade de elementos do vetor T: ");
		int elementosM = teclado.nextInt();
		
		
		while(elementosM > 15 || elementosM < 1){
			
			System.out.print("INVALIDO! Coloque a quantidade de elementos do vetor T: ");
			elementosM = teclado.nextInt();
			
			}
			int vetorS[] = new int[elementosN];
			int vetorT[] = new int[elementosM];
			int vetorU[] = new int[elementosM + elementosN];
			int aux = 0;
		System.out.println("///// VETOR S /////");
		for (int a = 0; a < elementosN ; a++){
			
			System.out.print("Diigite o valor do elemento " + a + ": ");
			vetorS[a] = teclado.nextInt();
			
			}
			System.out.println("Saida: ");
		for (int b = 0; b < elementosN ; b++){
			
			System.out.print(vetorS[b] + " ");
			
			}
			
			
			
			System.out.println("\n\n///// VETOR T /////");
		for (int a = 0; a < elementosM ; a++){
			
			System.out.print("Diigite o valor do elemento " + a + ": ");
			vetorT[a] = teclado.nextInt();
			}
			
			System.out.println("Saida: ");
			
		for (int b = 0; b < elementosM ; b++){
			
			System.out.print(vetorT[b] + " ");
			
			}
			System.out.println("\n\n///// VETOR U /////");
			
		for( int i = 0; i < elementosM ; i++){
				if(i < elementosN){
					
				vetorU[aux] = vetorS[i];
				aux++;
				vetorU[aux] = vetorT[i];
				aux++;
				
				}else{
				vetorU[aux] = vetorT[i];
				
				}		
			}
			System.out.println("Saida: ");
		for (int i = 0 ; i < elementosN+elementosM ; i++){
			System.out.print(vetorU[i] + " ");
			
			}
	}
}

