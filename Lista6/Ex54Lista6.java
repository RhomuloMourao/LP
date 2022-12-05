/*
 * Ex54Lista6.java

 */
//Rhômulo Mourão Caitano dos santos

import java.util.Scanner;
public class Ex54Lista6 {
	
	public static void main (String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			int a, b, c, termoInicial = 0, termoFinal = 10;
			
			System.out.print("Digite o termo inicial: ");
			termoInicial = teclado.nextInt();
			
			System.out.print("Digite o termo final: ");
			termoFinal = teclado.nextInt();
			
						
			System.out.print("\nTermos de fibonacci: ");
			
			a = 0;
			b = 1;
			c = a + b;
			
			for(int termoAtual = 1; termoAtual <= termoFinal ; termoAtual++){
				if(termoAtual >= termoInicial){
					
					System.out.print(a + " ");
				}
				a = b;
				b = c;
				c = a + b;
				
				}
			
			}
	}


