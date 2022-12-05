/*
 * Ex24Lista7.java

 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;

public class Ex24Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		System.out.print("Digite uma sequencia: ");
		String sequencia = tecladoSTR.nextLine();
		
		int contador =0, maiorSequencia = 0;
		
		for (int a = 0; a< sequencia.length() ; a++){
			
			if(sequencia.charAt(a) == '1'){
				contador++;
				
			}
			else{
				contador = 0;
					
				}
			if(contador > maiorSequencia){
					maiorSequencia = contador;
				
				}
			}
			System.out.print("A maior sequencia de 1's e: " + maiorSequencia);
		}
	}

