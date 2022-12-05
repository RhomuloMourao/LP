/*
 * Ex61Lista6.java
 
 */
//Rhomulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex61Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int termos, numero;
		double soma = 0;
		
		System.out.print("Digite a quantidade de termos desejada: ");
		termos = teclado.nextInt();
		
		for(numero = 0 ; numero < termos*2 ; numero+=2){
			
			System.out.print((numero+2) + "/" + (numero +1) + " + ");
			
			
			
			soma += (double) (numero +2) / (double) (numero + 1);
			}
			System.out.print(" = " + soma);
			
		
		
	}
}

