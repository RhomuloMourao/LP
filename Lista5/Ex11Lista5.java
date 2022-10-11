/*
 * Ex11Lista5.java

 */

//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex11Lista5 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoStr = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int primeironum = teclado.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int segundonum = teclado.nextInt();
		
		System.out.print("Digite a operacao: +, -, *, / : ");
		String operacao = tecladoStr.nextLine();
		
		switch(operacao){
			case "+":
			
			System.out.println("Soma: " + (primeironum + segundonum));
			break;
			case "-":
			
			System.out.println("Subtracao: " + (primeironum - segundonum));
			break;
			case "*":
			
			System.out.println("Multiplicacao: " + (primeironum * segundonum));
			break;
			
			case "/":
			
			System.out.println("Divisao: " + (primeironum / segundonum));
			}
		
	}
}

