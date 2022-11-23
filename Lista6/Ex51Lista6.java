/*
 * Ex51Lista6.java

 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex51Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um nuemro: ");
		int numero = teclado.nextInt();
		
		int numeroAnterior = 0;
		int proximoNumero = 1;
		int auxiliar ;


			for(int a = 0; a< numero ; a++){
				
				if(a== 0 || a== 1){
					
					System.out.print(" " + a);
					}else{
						
						
						System.out.print(" " + (numeroAnterior + proximoNumero));
						
						auxiliar = proximoNumero;
						proximoNumero += numeroAnterior;
						numeroAnterior = auxiliar;
						}
				
				}
		
		
	}
}

