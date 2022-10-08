/*
 * AprovadoReprovado.java

 */
 //Rhomulo Mourao Caitano dos Santos

import java.util.Scanner ;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
			
			Scanner teclado = new Scanner(System.in);

			
			System.out.print("Digite um numero: ");
			int nota = teclado.nextInt();
			
			
			
			
			if(nota>10 || nota<0){
				
				System.out.println("ValorInvalido");
				
				}else{
					if(nota>=6){
				System.out.println("Aprovado");

						}else{
							System.out.println("Reprovado");
							}
					
					}
				
			
			
	}
}

