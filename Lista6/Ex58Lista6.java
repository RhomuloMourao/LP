/*
 * Ex58Lista6.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex58Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro termo: ");
		int numeroInicial = teclado.nextInt();
		
		System.out.print("Digite o segundo termo: ");
		int numeroFinal = teclado.nextInt();
		
		int numeroAnterior = numeroInicial;
		int proximoNumero = numeroFinal;
		int auxiliar ;

		System.out.print(numeroAnterior + " " + proximoNumero);
		
			for(int a = 0; a< 8 ; a++){
				
			System.out.print(" " + (numeroAnterior + proximoNumero));
						
			auxiliar = proximoNumero;
			proximoNumero += numeroAnterior;
			numeroAnterior = auxiliar;
						
				
				}
	}
}

