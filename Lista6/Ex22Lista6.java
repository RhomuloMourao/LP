/*
 * Ex22Lista6.java
  
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex22Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double maiorPreco = 0;
		int quantidadeDeProdutos = 0;
		double soma = 0;
		double media = 0;
		
		
		for(int a = 1 ; a <= 3 ; a++){
			
			System.out.print("Digite o codigo deste produto: ");
			int codigo = teclado.nextInt();
			System.out.print("Agora digite o preco deste produto: ");
			double preco = teclado.nextDouble();
			
			soma = soma + preco;
			
			if(a == 1){
				maiorPreco = preco;
				}
			if(preco > maiorPreco){
				
				maiorPreco = preco;
				
				
				}
			
			quantidadeDeProdutos++;
			
			
			}
		media = soma / quantidadeDeProdutos;
		
		System.out.println("Maior preco: " + maiorPreco);
		System.out.println("Media dos precos: " + media);
		
		
	}
}

