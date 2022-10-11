/*
 * Ex12Lista5.java

 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex12Lista5 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o preco do produto: ");
		double precoproduto = teclado.nextDouble();
		
		System.out.print("Digite seu codigo de origem: ");
		int codorigem = teclado.nextInt();
		
		double frete;
		
		switch(codorigem){
			
			case 1:
			
			frete = (precoproduto *10.0)/100.0;
			System.out.println("Frete: " + frete );
			System.out.println("Valor total na regiao Norte: " + (precoproduto + frete));
			break;
			case 2:
			case 5:
			case 9:
			frete = (precoproduto *3.0)/100.0;
			System.out.println("Frete: " + frete );
			System.out.println("Valor total na regiao Sul: " + (precoproduto + frete));
			break;
			case 3:
			case 10:
			case 11:
			case 12:
			case 13: 
			case 14:
			case 15:
			frete = (precoproduto *1.2)/100.0;
			System.out.println("Frete: " + frete );
			System.out.println("Valor total na regiao Leste: " + (precoproduto + frete));
			break;
			case 7:
			case 20:
			frete = (precoproduto * 7.3)/100.0;
			System.out.println("Frete: " + frete );
			System.out.println("Valor total na regiao Oeste: " + (precoproduto + frete));
			break;
			
			default:
			frete = (precoproduto *22.2)/100.0;
			System.out.println("Frete: " + frete );
			System.out.println("Valor total para produto importado: " + (precoproduto + frete));
			
			}
		
	}
}

