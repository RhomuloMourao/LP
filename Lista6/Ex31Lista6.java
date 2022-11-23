/*
 * Ex31Lista6.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex31Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a =1;
		
		System.out.print("Digite um quantidade de termos: ");
		int termos = teclado.nextInt();
		
		do{
			
		if(termos == 0){
			System.out.print("Fim do programa");
		
			}else{
		
			if(termos < 0){ 
			System.out.print("Digite uma quantidade valida: ");
			termos = teclado.nextInt();
			
			
			}else{
			
			
			System.out.print(a +", ");
			a++;
		}
	}
		}while(a <= termos || termos <0);
	
		
	}
	}


