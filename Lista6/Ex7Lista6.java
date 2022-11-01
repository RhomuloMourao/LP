/*
 * Ex7Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex7Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		while(numero <= 0 || numero > 10){
			
			System.out.print("Digite um numero: ");
			 numero = teclado.nextInt();
		}
		for(int a =1 ; a<= 10 ; a++){
		
			System.out.println(a*numero);
		}
		
	}
}

