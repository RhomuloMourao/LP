/*
 * Ex09Lista8.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex09Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		int vetorG[] = new int[5];
		int vetorH[] = new int[vetorG.length];
		
		for(int a = 0; a < vetorG.length ; a++){
		System.out.print("Digite o elemento: ");
		vetorG[a] = teclado.nextInt();
		
		}
		
		
		for(int n : vetorG){
			if(n % 2 == 0){
				
				vetorH[contador] = n;
				contador++;
				}
			}
			System.out.println("Numeros pares: ");
		for(int i = 0; i < contador ; i++){
			
		System.out.print(vetorH[i] + " ");
		
		
	}
	}
}

