/*
 * Ex2Lista5.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Ex2Lista5 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		if(numero % 2 == 0)
		{
			System.out.println(numero + " e par");
			}else{
				System.out.println(numero + " e impar");
				}
		
		
	}
}

