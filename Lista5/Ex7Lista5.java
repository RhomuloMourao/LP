/*
 * Ex7Lista5.java

 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex7Lista5 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int primeirovalor = teclado.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int segundovalor = teclado.nextInt();
		
		if(primeirovalor < segundovalor){
			
			System.out.print(primeirovalor + " ; ");
			System.out.print(segundovalor);
			}else{
				System.out.print(segundovalor + " ; ");
				System.out.print(primeirovalor);
				
				}
		
		
		
		
	}
}

