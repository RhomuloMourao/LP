/*
 * Ex11Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex11Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		int contadorAlfabeto = 0;
		int contadorNumeros = 0;
		System.out.print("Digite uma frase: ");
		String frase = tecladoSTR.nextLine();
		
		for(char alfabeto = 'a' ; alfabeto <= 'z' ; alfabeto++ ){

			for(int i = 0; i<frase.length() ; i++){
				
				if(frase.toLowerCase().charAt(i) == alfabeto){
					contadorAlfabeto++;
					
				
				}
			
			}
		
	}
	
	for(char numeros = '1' ; numeros < '9' ; numeros++ ){

			for(int i = 0; i<frase.length() ; i++){
				
				if(frase.charAt(i) == numeros){
					contadorNumeros++;
					
				
				}
			}
		}
System.out.println("Quantidade de numeros: " + contadorNumeros);
System.out.print("Quantidade de letras: " + contadorAlfabeto);

 }
}
