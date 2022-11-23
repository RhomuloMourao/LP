/*
 * Ex55Lista6.java
 
 */

import java.util.Scanner;
public class Ex55Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		int divisores = 0;
		for(int a = 1 ; a<=(numero/2) ; a++){
			
			if(numero % a == 0){
				divisores += a;
				
				}
			
			}
		
		if(divisores ==numero){
			
			System.out.println("O numero " +numero + " e perfeito");
			}else{
				
				System.out.print("O numero " +numero + " nao e perfeito");
				
				}
		
	}
}

