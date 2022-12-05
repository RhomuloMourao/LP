/*
 * Ex08Lista8.java
 
 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Scanner;
public class Ex08Lista8 {
	
	public static void main (String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		
		int vetorF[] = new int[5];
		
		for(int a = 0 ; a < 5 ; a++){
		System.out.print("Digite o elemento " + a + ": " );
		vetorF[a] = teclado.nextInt();
		
		if(vetorF[a] % 2 == 0){
			
			
			}else{
				soma += vetorF[a];
				
				}
			}
			if(soma > 0){
		System.out.print("A soma dos numeros impares e: " + soma );
	}
		if(soma == 0){
			
			System.out.print("Nao ha numeros impares!");
			
			}
		
	}
}

