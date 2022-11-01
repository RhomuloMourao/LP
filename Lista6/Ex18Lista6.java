/*
 * Ex18Lista6.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex18Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
		
		System.out.print("Digite a quantidade de mercadorias: ");
		int mercadorias = teclado.nextInt();
		
		for(int a = 1 ; a<= mercadorias ; a++ ){
		System.out.print("Digite o preço da " +  a +   "(a) mercadoria: ");
		double preco = teclado.nextDouble();
		
		soma = soma + preco;
		
		
	}
	media = soma/mercadorias;
	System.out.println("Valor total em estoque: " + soma);
	System.out.println("Media de preco das mercadorias: " + media);
	}
}

