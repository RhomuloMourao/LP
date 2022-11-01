/*
 * Ex12Lista6.java

 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex12Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double soma = 0;
		for(int a = 1; a <= 10 ; a++){
			
			System.out.print("Digite um numero: ");
			double numero = teclado.nextDouble();
			
			soma = soma + numero;
			}
		
		System.out.println("A soma total dos numeros e: " + soma);
		
	}
}

