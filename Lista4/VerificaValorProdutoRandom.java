/*
 * VerificaValorProdutoRandom.java
		
 */
// Rhômulo Mourão Caitano dos Santos

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
				
		int precoProduto1 = (int) (Math.random() * 1000)+1;
		int precoProduto2 = (int) (Math.random() * 1000)+1;
	
		System.out.println("Preco do primeiro produto:" + precoProduto1);	
		System.out.println("Preco do segundo produto:" + precoProduto2);


		if(precoProduto1 < precoProduto2){
			
			System.out.println("O produto 1 e o mais barato");
			
			}else{	
				
				if(precoProduto1 > precoProduto2){


				System.out.println("O produto 2 e o mais barato");
					
				}else{
					
					System.out.println("O preco dos dois produtos sao iguais");

					
					}
		}
				
				
	}
}

