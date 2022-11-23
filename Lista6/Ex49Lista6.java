/*
 * Ex49Lista6.java
 
 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Scanner;
public class Ex49Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de termos: ");
		int qntdTermos = teclado.nextInt();
		
		int contadorPrimo = 0;
		int limite = 0;
		String saida = " ";
		for(int a = 1; limite <qntdTermos ; a++){
			
			contadorPrimo = 0;
			
			for(int b = 1 ; b<=a ; b++){
				
			if(a % b == 0){
				
				contadorPrimo++;
				
				}
				
			}
			if(contadorPrimo == 2){
				saida = a + " " + saida;
				
				limite++;
				
				
		}
		
			}
			System.out.print(saida);
	}
}

