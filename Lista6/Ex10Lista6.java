/*
 * Ex10Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex10Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double soma = 0;
		double numero;

		for(int a = 1 ; a <=10 ; a++){
			System.out.print("Digite um numero: ");
			numero = teclado.nextDouble();
			
			soma = soma + numero;
			
			}
		
		System.out.println("Media aritmetica: " + (soma)/10);
		
	}
}

