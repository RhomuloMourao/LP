/*
 * Ex20Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Satos

import java.util.Scanner;
public class Ex20Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double maiorValor = 0;
		double menorValor = 0;
		
		for(int a = 1; a<=100; a++){
			
			System.out.print("Digite um valor: ");
			double valor = teclado.nextDouble();
		
		if(a == 1){
		maiorValor = valor;
		menorValor = valor;
	}
			if(valor > maiorValor){
			maiorValor = valor;
			
			}
				if(valor < menorValor){
				menorValor = valor;
				}
			}
		
		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Menor valor: " + menorValor);
		
	}
}

