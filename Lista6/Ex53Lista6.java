/*
 * Ex53Lista6.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex53Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		int numeroAnterior = 0;
		int proximoNumero = 1;
		int auxiliar ;
		int soma = 1;

			for(int a = 1; a<=100 ; a++){
			soma = numeroAnterior + proximoNumero;
				if(a== 0 || a== 1){
					
					System.out.print(" " + a);
					}else{
						if(soma<250){

						System.out.print(" " + (soma));
						
						auxiliar = proximoNumero;
						proximoNumero += numeroAnterior;
						numeroAnterior = auxiliar;
					}
						
						
						
						}
				
				}
		
		
	}
}

