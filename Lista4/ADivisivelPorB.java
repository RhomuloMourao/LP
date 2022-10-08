/*
 * ADivisivelPorB.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite o valor de a: ");
		int a = teclado.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int b = teclado.nextInt();
		
		if(a < 0 || a > 1000 || b < 0 || b > 20){
			
			System.out.println("Valor invalido");
		}else{
				
				if(a < b){
					System.out.println("a e menor que b");
						}
					
					
					
						else{
							if(a%b == 0){
							System.out.println("E divisivel.");
							}
							
							else{
								System.out.println("Nao e divisivel");
								}
				}
		}
	}
	}



