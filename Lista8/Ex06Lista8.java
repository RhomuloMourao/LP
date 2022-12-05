/*
 * Ex06Lista8.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex06Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite a dimenso do vetor: ");
		int dimensao = teclado.nextInt();
		
		int[] vetorA = new int[dimensao]; 
		int[] vetorB = new int[dimensao];
		String[] vetorC = new String[dimensao];
		for (int a = 0 ; a < dimensao ; a++ ){
			
			System.out.print("Vetor A Indice " + a + ": " );
			vetorA[a] = teclado.nextInt();
			}
		for (int b = 0 ; b < dimensao ; b++){
			
			System.out.print("Vetor B Indice " + b + ": " );
			vetorB[b] = teclado.nextInt();
			
			}
		for(int c = 0 ; c < dimensao ; c++){
			
			if(vetorA[c] == vetorB[c]){
				vetorC[c] = "IGUAIS";
				}else{
					vetorC[c] = "";
					}
			}
			System.out.println("Resposta: ");
		for(int i = 0 ; i < dimensao ; i++){
			if(vetorC[i] == "IGUAIS"){
			System.out.println("Indice " + i + ": " + vetorC[i]);
			}
		}
	}
}

