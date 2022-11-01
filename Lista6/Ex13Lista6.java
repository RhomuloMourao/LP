/*
 * Ex13Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex13Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double soma = 0;
		
		for(int a = 1; a <= 10 ; a++ ){
			
			System.out.print("Digite um numero: ");
			double numero = teclado.nextDouble();
			
			
			if(numero < 40){
			soma = soma + numero;
		}else{}
			}
		
		
		
		System.out.println("A soma de numeros menores que 40 e: " + soma);
		
	}
}

