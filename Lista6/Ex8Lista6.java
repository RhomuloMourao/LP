/*
 * Ex8Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex8Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contadornegativo = 0;
		
		for(int a = 1 ; a<= 10 ; a++){
			
			System.out.print("Digite um numero: ");
			int numero = teclado.nextInt();
			
			if(numero < 0){
				
				contadornegativo++;
				}
			
			}
			System.out.println("Temos " + contadornegativo + " Numero(s) Negativo(s)");
			
	}
}

