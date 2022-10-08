/*
 * VerificaValorProduto.java

 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);
			
			System.out.print("Digite o preco do primeiro produto: ");
			int precoproduto1 = teclado.nextInt();
			
			System.out.print("Digite o preco do segundo produto: ");
			int precoproduto2 = teclado.nextInt();
			
			if(precoproduto1 < 1 || precoproduto1 > 1000 || precoproduto2 < 1 || precoproduto2 > 1000){
					
					System.out.println("Valor invalido.");
					
			}else{
				
					if(precoproduto1 < precoproduto2){
				
						System.out.println("O produto 1 e mais barato");
				
							}else
				 
								if(precoproduto1> precoproduto2){
									
									System.out.println("O produto 2 e mais barato");
									
										}else{
											
											System.out.println("Os produtos tem o mesmo preco");
						}
			
						
			}
			
	}
}

