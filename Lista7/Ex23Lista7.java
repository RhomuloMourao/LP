/*
 * Ex23Lista7.java
 
 * 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex23Lista7 {
	
	public static void main (String[] args) {
		Scanner tecladoSTR = new Scanner(System.in);
		
		System.out.print("Digite um frase: ");
		String nomeCompleto = tecladoSTR.nextLine().toLowerCase();
		
		String nome[] = nomeCompleto.split(" ");
		
		System.out.println("Sobrenome: " + nome[nome.length -1]);
		
	}
}

