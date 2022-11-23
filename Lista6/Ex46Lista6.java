/*
 * Ex46Lista6.java
 
 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Scanner;
public class Ex46Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		int contadorDivisao = 0;
		for(int a = 1; a<=numero; a++){
			
			if(numero % a == 0){
				
				contadorDivisao++;
				
			}
		}
		if(contadorDivisao == 2){
			
			System.out.print("Este numero e primo!");
			
			}else{
				
				System.out.print("Este numero nao e primo!");
				
				}
	
		
	}
}

