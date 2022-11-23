/*
 * Ex37Lista6.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex37Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int termos ;
		int a = 1 ;
		int b = 2;
		System.out.print("Digite uma quantidade de termos: ");
		termos = teclado.nextInt();
		do{
			if(termos == 0){
				System.out.print("Fim do programa");
				}else{
				if(termos < 0){
					
					System.out.print("Digite uma quantidade valida de termos: ");
					termos = teclado.nextInt();
					
					}else{
						if(a == 1){
							System.out.print(a + ", ");
							}
						
						System.out.print( a  +  "/" + b + ", " );
						
						a++;
						b++;
						
						}
						
						
			}
			
			}while( b <= termos || termos < 0);
	}
}

