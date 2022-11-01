/*
 * Ex21Lista6.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Ex21Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double maiorNumero = 0;
		double soma = 0;
		double media = 0;
		
		System.out.print("Digite a quantidade de numeros: ");
		int quantidade = teclado.nextInt();
		
		for(int a = 1; a<=quantidade ; a++){
			
			System.out.print("Digite o valor: ");
			double valor = teclado.nextDouble();
			
			if(a == 1){
				
				maiorNumero = valor;
				}
			if(valor > maiorNumero){
				
				maiorNumero = valor;
				
				}
			soma = soma + valor;
			media = soma / quantidade;
			}
		System.out.println("Maior valor: " + maiorNumero);
		System.out.println("Media: " + media);
		
	}
}

