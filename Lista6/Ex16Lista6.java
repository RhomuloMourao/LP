/*
 * Ex16Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex16Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qntddenumeros = 0;
		double soma = 0;
		double media = 0;
		
		
		for(int a = 15 ; a<=100 ; a++){
			
			soma = soma + a;
			
			qntddenumeros++;
			}
			media = soma/qntddenumeros;
			
		System.out.println("A media aritmetica e: " + media);
		
	}
}

