/*
 * Ex34Lista6.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex34Lista6 {
	
	public static void main (String[] args) {
		
	Scanner teclado = new Scanner(System.in);

		int termos;
		int a = 0;
		int b = 0;
		System.out.print("Digite a quantidade de termos: ");
		termos = teclado.nextInt();
		
		do{
			
			if(termos == 0){
				
				System.out.println("FDime do programa");
				}
			if(termos < 0){
				
				System.out.print("Digite uma quantidade de termos valida");
				termos = teclado.nextInt();
				}else{
					b++;
					
					System.out.print(a + ", ");
				a += b;
					}
			
			}while(a <= termos || termos < 0);
		
	}
}

