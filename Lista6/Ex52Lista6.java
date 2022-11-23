/*
 * Ex52Lista6.java

 */
//Rhômulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex52Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		int numeroAnterior = 0;
		int proximoNumero = 1;
		int auxiliar ;
		int soma = 0;
		int a ;
		
		boolean esta = false;
			for( a = 0; a< 100 ; a++){
				
				if(numero == 0 || numero == 1){
					
					esta = true;
					break;
					}else{ 
						auxiliar = proximoNumero;
						proximoNumero += numeroAnterior;
						numeroAnterior = auxiliar;
					if(numero == (numeroAnterior + proximoNumero)){
						
						esta = true;
						
				}
				
				}
				
				
				}
				if(esta == true){
					System.out.print("ta na sequencia ");
					
					}else{
						System.out.print("n ta na sequencia ");
						
						}
		
	}
}

