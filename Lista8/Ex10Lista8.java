/*
 * Ex10Lista8.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex10Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int vetorPA[] = new int[5];
		int vetorPB[] = new int[5];
		int aux = 0;
		int aux2 = 0;
		System.out.println("////// VETOR PA //////");
		for (int a = 0 ; a < vetorPA.length ; a++){
			
			System.out.print("Digite o " + a + " elemento: ");
			vetorPA[a] = teclado.nextInt();
			
			}
			System.out.print("VetorPA: ");
		for (int b = 0 ; b < vetorPA.length ; b++){
			
			System.out.print(vetorPA[b] + " ");
			
			}
			System.out.println("\n////// VETOR PB //////");
		for (int c = 0 ; c < vetorPB.length ; c++){
			
			System.out.print("Digite o " + c + " elemento: ");
			vetorPB[c] = teclado.nextInt();
			
			}
			System.out.print("VetorPB: ");
		for (int d = 0 ; d < vetorPB.length ; d++){
			
			System.out.print(vetorPB[d] + " ");
			
			}
		System.out.println("\n///// VETORPC /////");
		
		int vetorPC[] = new int[10];
		
		
		for (int e = 0 ; e <10 ; e++){
			if(e < 5)
			{
				vetorPC[e] = vetorPA[aux];
				aux++;
			}
			
			if(e > 4)
			{
				vetorPC[e] = vetorPB[aux2];
				aux2++;
			}
		}
			
			
		for (int i = 0 ; i < vetorPC.length ; i ++){
			
			System.out.print(vetorPC[i] + " ");
			}
	}
}

