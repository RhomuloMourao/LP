/*
 * Ex4Lista5.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex4Lista5 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a nota da primeira avaliacao: ");
		double nota1 = teclado.nextDouble();
		
		System.out.print("Digite a nota da segunda avaliacao: ");
		double nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2) / 2 ;
		
		if(media >=6){
			
			System.out.println("Sua media foi de: " + media);
			System.out.println("Portanto voce foi Aprovado!!");
			
			}else{
				
				System.out.println("Sua media foi de: " + media);
				System.out.println("Portanto voce foi Reprovado!");
				}
		
		
	}
}

