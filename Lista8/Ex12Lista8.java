/*
 * Ex12Lista8.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex12Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vetorP[] = new int[10];
		int vetorQ[] = new int[15];
		int aux1 = 0;
		int aux2 = 0;
		System.out.println("///// VETOR P /////");
		for (int a = 0 ; a < 10 ; a++){
			System.out.print("Digite o elemento " + a + ": ");
			vetorP[a] = teclado.nextInt();
			}
			
		System.out.print("\nSaida: ");
		for (int a = 0 ; a < 10 ; a++){
			System.out.print(vetorP[a] + " ");
	
			}	
			
			System.out.println("\n///// VETOR Q //////");
		for (int b = 0 ; b < 15 ; b++){
			
			System.out.print("Digite o elemento " + b + ": " );
			vetorQ[b] = teclado.nextInt();
			}
			System.out.print("\nSaida: ");
		for(int b = 0 ; b < 15 ; b++){
			System.out.print(vetorQ[b] + " ");
			}
		
		int vetorR[] = new int[25]; 
		for(int i = 0 ; i < 25 ; i++){
			if(i < 10){
				vetorR[i] = vetorP[aux1];
				aux1++;
				}
				
			if( i > 10){
				
				vetorR[i] = vetorQ[aux2];
				aux2++;
				}
			
			}
			
			System.out.println("\n ///// VETOR R /////");
		for(int i = 0 ; i < 25 ; i++){
			System.out.print(vetorR[i] + " ");
			}
		
	}
}

