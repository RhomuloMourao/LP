/*
 * Ex19Lista6.java
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex19Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoSTR = new Scanner(System.in);
		
		int numeroDeMercadorias = 0;
		double soma = 0;
		double media = 0;
		char simounao = 'S';
		
		do{
		
		
		System.out.print("Digite o preço da mercadoria: ");
		double preco = teclado.nextDouble();
		
		soma = soma + preco;
		numeroDeMercadorias++;
		
		System.out.print("Quer Continuar (S/N) ");
		simounao = tecladoSTR.nextLine().toUpperCase().charAt(0);
	
	}while(simounao == 'S');
	media = soma/numeroDeMercadorias;
	System.out.println("Valor total em estoque: " + soma);
	System.out.println("Media de preco das mercadorias: " + media);
	
	}
}

