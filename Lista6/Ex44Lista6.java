/*
 * Ex44Lista6.java
 
 */
//RhÔmulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex44Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de termos: ");
		int qntdTermos = teclado.nextInt();
		
		for(int a = 1 ; a<= qntdTermos ; a++){
		int calculo = 1;
		
		for(int b = a; b>=1 ; b--){
			
			System.out.print(b + " ");
			calculo *= b;
			

		
		
		
	}
	System.out.println(": " + calculo + " ");
	}
}
}
