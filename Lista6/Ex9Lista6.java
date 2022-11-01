/*
 * Ex9Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex9Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int entre10e20 = 0;
		int contadoroutros = 0;
		for(int a = 1; a<= 10 ; a++){
			System.out.print("Digite um numero: ");
			int numero = teclado.nextInt();
			
			if(numero <=20 && numero >= 10){
				
				entre10e20++;
				}else{
				contadoroutros++;
				}
			
			}
		System.out.println("Entre 10 e 20: " + entre10e20);
		System.out.println("Outros numeros: " + contadoroutros);
	}
}

