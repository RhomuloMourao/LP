/*
 * Ex18Lista8.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex18Lista8 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		int n = 0;
		
		do{
		System.out.print("Entre com a quantidade de elementos da sequencia de fatoriais: ");
		n = teclado.nextInt();
		
		if(n <= 0 || n > 15){
			System.out.println("\n\tErro valor invalido. Tem que ser entre 1 e 15...\n");
			
			}
		}while( n <= 0 || n > 15);
		
		int [] fatoriais = new int [n];
		
		for(int fatorial = 0; fatorial < fatoriais.length ; fatorial++ ){
			
			int numero = fatorial + 1;
			
			fatoriais [fatorial] = 1;
			
			for(int i = 1; i <= numero ; i++){
				
				fatoriais [fatorial] *= i;
			}
				
				
			System.out.print(fatoriais[fatorial] + " ");
		}
	}
}

