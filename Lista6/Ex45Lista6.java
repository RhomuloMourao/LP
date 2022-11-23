/*
 * Ex45Lista6.java

 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Scanner;
public class Ex45Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de termos: ");
		int qntdTermos = teclado.nextInt();
		
		for(int a = qntdTermos ; a>= 1 ; a--){
		int calculo = 1;
		
		for(int b = 1; b<=a ; b++){
			
			System.out.print(b + " ");
			calculo *= b;
			

		
		
		
	}
	System.out.println(": " + calculo + " ");
	}
	}
}

