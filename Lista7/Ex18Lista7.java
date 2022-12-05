/*
 * Ex18Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos
import java.util.Scanner;
public class Ex18Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		String frase = "";
		boolean temLetra = false;
		boolean maiorQueUm = false;
		System.out.print("Digite a sequencia: ");
		frase = tecladoSTR.nextLine().toLowerCase();
		int contador = 0;
		for(char alfabeto = 'a' ; alfabeto <= 'z' ; alfabeto++ ){

			for(int i = 0; i<frase.length() ; i++){
				
				if(frase.toLowerCase().charAt(i) == alfabeto){
					temLetra = true;
					
				}
			}
		}
		for(char numeros = '2' ; numeros <= '9' ; numeros++ ){
			
			for(int a = 0 ; a< frase.length() ; a++ ){
				
				if(frase.charAt(a) == numeros ){
				
				maiorQueUm = true;
				
				}
			}
		}
		for(char numeros = '0' ; numeros <= '1' ; numeros++ ){
			
			for(int a = 0 ; a< frase.length() ; a++ ){
				
				if(frase.charAt(a) == numeros ){
				
				contador++;
				
				}
			}
		}
		if(temLetra == true){
			
			System.out.print("nao e uma sequencia de 8bits!");
			}else{
				if(maiorQueUm == true){
					System.out.print("Nao e uma sequencia de 8bits!!!!");
					}else{
						if(contador % 8 == 0){
							System.out.print("E uma sequencia de 8bits!!!!");
							}else{
								System.out.print("Nao e uma sequencia de 8bits!!!!");
								}
							}
						}	
	}
}

