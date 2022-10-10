/*
 * Ex3Lista5.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;

public class Ex3Lista5 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de macas: ");
		double macas = teclado.nextDouble();
		
		if(macas >= 12){
			
			System.out.println("Seu total e de R$" + 1.00 * macas);
			
			}else{
				
				System.out.printf("Seu total e de R$ %.2f", macas*1.30 );
				
				}
		
		
	}
}

