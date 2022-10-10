/*
 * Ex5Lista5.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex5Lista5 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		int anoatual = teclado.nextInt();
		
		System.out.print("Digite seu ano de nascimento: ");
		int anodenascimento = teclado.nextInt();
		
		int podevotar = anoatual - anodenascimento;
		
		if(podevotar >= 18){
			
			System.out.println("Pode votar!!!!");
			
			}else{
				
				System.out.println("Voce nao pode votar.");
				
				}
		
	}
}

