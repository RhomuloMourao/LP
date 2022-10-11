/*
 * Ex9Lista5.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex9Lista5 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o numero de horas mensais: ");
		int horastrabalhadas = teclado.nextInt();
		
		System.out.print("Digite seu salario por hora: ");
		int salarioporhora = teclado.nextInt();
		
		
		if(horastrabalhadas < 0 || salarioporhora < 0){
		
					System.out.println("Valor invalido!");
			
			}else{
		
		if(horastrabalhadas <= 40){
			
			System.out.println("Seu salario e de: " + (horastrabalhadas * salarioporhora));
			
			}else{
				System.out.println("Seu salario e de: " + ((salarioporhora * 40) + (horastrabalhadas - 40) * salarioporhora * 1.5));
				}
		
	}
	}
}

