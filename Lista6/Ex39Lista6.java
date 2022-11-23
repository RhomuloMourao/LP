/*
 * Ex39Lista6.java
  
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex39Lista6 {
	
	public static void main (String[] args) {
		 Scanner teclado = new Scanner(System.in);
		
		int termos ;
		int a = 1 ;
		int b = 1;
		double soma = 0 ;
		System.out.print("Digite uma quantidade de termos: ");
		termos = teclado.nextInt();
		
		System.out.print("");
		do{
			if(termos == 0){
				System.out.print("Fim do programa");
				}else{
				if(termos < 0){
					
					System.out.print("Digite uma quantidade valida de termos: ");
					termos = teclado.nextInt();
					
					}else{
						
						System.out.print( a +  "/" + (termos + 1 - a) + " + "  );
						
						soma += (double) a /  (double) (termos + 1 - a) ;
						a++;
						
						
						}
						
						
			}
			
			}while( termos < 0 || a <= termos);
			
			System.out.print("A soma e: " + soma);
			 
			 
	}
}

