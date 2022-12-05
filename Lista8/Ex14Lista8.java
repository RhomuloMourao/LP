/*
 * Ex14Lista8.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex14Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int S[] = new int[10];
		int T[] = new int[15];
		
		int aux = 0;
		
		
		System.out.println("///// vetorS /////");
		for(int a = 0; a< 10 ; a++){
		System.out.print("Digite o elemento " + a + ": " );
		S[a] = teclado.nextInt();
	
			}
			System.out.print("Saida: ");
		for(int a = 0; a< 10 ; a++){
			System.out.print(S[a] + " " );
			
		
			}
		
			System.out.println("\n///// vetorT /////");
		for(int b = 0; b< 15 ; b++){
			System.out.print("Digite o elemento " + b + ": " );
			T[b] = teclado.nextInt();
				
			}
			System.out.print("Saida: ");
		for(int b = 0; b< 15 ; b++){
			System.out.print(T[b] + " " );
			
			}
			
			int U[] = new int[25];
			
		for(int c = 0 ; c < 15 ; c++){
			if(c < 10){
				U[aux] = S[c];
				aux++;
				U[aux] = T[c];
				aux++;
				}else{
				U[aux] = T[c];
				aux++;
					}
				
			}
			System.out.println("\n\n///// vetorU /////");
			System.out.print("Saida: ");
		for(int i = 0 ; i < 25 ; i++){
			
			System.out.print(U[i] + " ");
			
			}
	}
}

