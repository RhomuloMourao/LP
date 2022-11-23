/*
 * Ex60Lista6.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex60Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro termo: ");
		int numeroInicial = teclado.nextInt();
		
		System.out.print("Digite o segundo termo: ");
		int numeroFinal = teclado.nextInt();
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		int numeroAnterior = numeroInicial;
		int proximoNumero = numeroFinal;
		int auxiliar ;
		int soma = 0;
		
		boolean pertence = false;
			for(int a = 0; a< numero ; a++){
				
				soma = numeroAnterior + proximoNumero;
			
						
			auxiliar = proximoNumero;
			proximoNumero += numeroAnterior;
			numeroAnterior = auxiliar;
				
				if(soma == numero || numeroInicial == numero || numeroFinal == numero){
					pertence = true;
					
					}
						
				}
			if(pertence == true){
			System.out.println("O numero " + numero + " pertence a essa sequencia.");

				}else{
					
				System.out.println("O numero " + numero + " nao pertence a essa sequencia.");

					}	
				
	}
}

