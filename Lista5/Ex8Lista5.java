/*
 * Ex8Lista5.java


 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex8Lista5 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a hora de inicio do jogo: ");
		int horainicio = teclado.nextInt();
		
		System.out.print("Digite a hora do fim do jogo: ");
		int horafim = teclado.nextInt();
		
		if(horainicio <0 || horainicio > 23 || horafim < 0 || horafim > 23){
			
			System.out.println("Valor invalido.");
			}else{
				if(horafim > horainicio){
				
				System.out.println("A duracao foi de: " + (horafim - horainicio) + "hora(s)");
				}else{
					System.out.println("A duracao foi de: " + (horafim - horainicio+24) + "hora(s)");
					}
		
	}
	}
}

