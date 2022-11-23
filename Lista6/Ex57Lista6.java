/*
 * Ex57Lista6.java

 */
//Rhomulo Mourao Caitano dos Santos
import java.util.Scanner;
public class Ex57Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de numeros: ");
		int qntdNumeros = teclado.nextInt();
				
		int a, i = 1;
		int contador = 0;
				int divisores = 0;
				
				for(i = 1 ; contador <= qntdNumeros ;i++){
					divisores = 0;
					
		for(a = 1 ; a<=(i/2) ; a++){
			
			if(i % a == 0){
				divisores += a;
				
				}
			
			
			}
			if(divisores ==i){
			
			System.out.println("\nO numero " + i + " e perfeito");
			contador++;
			}
		}
	}
}

