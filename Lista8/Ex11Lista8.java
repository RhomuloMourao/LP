/*
 * Ex11Lista8.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex11Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int QA[] = new int[5];
		int QB[] = new int[5];
		
		int aux = 0;
		
		
		System.out.println("///// QA /////");
		for(int a = 0; a< 5 ; a++){
		System.out.print("Digite o elemnto " + a + ": " );
		QA[a] = teclado.nextInt();
	
			}
			System.out.print("Saida: ");
		for(int a = 0; a< 5 ; a++){
			System.out.print(QA[a] + " " );
			
		
			}
		
			System.out.println("\n///// QB /////");
		for(int b = 0; b< 5 ; b++){
			System.out.print("Digite o elemnto " + b + ": " );
			QB[b] = teclado.nextInt();
				
			}
			System.out.print("Saida: ");
		for(int b = 0; b< 5 ; b++){
			System.out.print(QB[b] + " " );
			
			}
			
			int QC[] = new int[10];
			
		for(int c = 0 ; c < 5 ; c++){
				QC[aux] = QA[c];
				aux++;
				QC[aux] = QB[c];
				aux++;
			}
			System.out.println("\n\n///// QC /////");
			System.out.print("Saida: ");
		for(int i = 0 ; i < 10 ; i++){
			
			System.out.print(QC[i] + " ");
			
			}
			
		
	}
}

