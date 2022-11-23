/*
 * Ex40Lista6.java

 */

import java.util.Scanner;
public class Ex40Lista6 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int termos;
		int a = 1;
		int b = 1 ;
		
		System.out.print("Digite a quantidade de termos: ");
		termos = teclado.nextInt();
		int metade = termos / 2;
		do{
			
			
			if(termos == 0){
				
				System.out.println("Fim do programa");
				}
			if(termos < 0){
				
				System.out.print("Digite uma quantidade de termos valida");
				termos = teclado.nextInt();
				}
				if (termos % 2 != 0) {
                System.out.println("Digite um valor par!");
            }else{
				if(b > metade){
					a--;
					System.out.print(a + ", ");
					
				}else{
				
					System.out.print(a + ", ");
					a++;
					b++;
				}	
				}
					
			}while(a <= termos && a > 0 || termos < 0 || termos % 2 != 0 );

	}
}

