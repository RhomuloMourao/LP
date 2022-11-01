/*
 * Ex17Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos


import java.util.Scanner;
public class Ex17Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoSTR = new Scanner(System.in);
		
		double media ;
		char simOuNao = 'S';
		do{
		System.out.print("Digite a primeira nota: ");
		double nota1 = teclado.nextDouble(); 
		
			while(nota1 < 0 || nota1 > 10){
			System.out.print("Digite novamente a primeira nota: ");
			nota1 = teclado.nextDouble();
			
			}
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = teclado.nextDouble(); 
		
			while(nota2 < 0 || nota2 > 10){
			System.out.print("Digite novamente a segunda nota: ");
			nota2 = teclado.nextDouble(); 
			
			}	
		
		media = (nota1 + nota2)/2;
		
		System.out.println("Sua media e :" + media);
		
		System.out.print("Novo calculo (S/N)? ");
		simOuNao = tecladoSTR.next().toUpperCase().charAt(0);
		}	while(simOuNao == 'S');
		
		
		
	}
}

