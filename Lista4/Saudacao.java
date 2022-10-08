/*
 * Saudacao.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Opcao 1: digitar o numero");
		System.out.println("Opcao 2: gerar numero aleatorio");
		
		System.out.print("Escolha: 1 ou 2: ");
		int opcoes = teclado.nextInt();
		
		if(opcoes == 1){
			System.out.print("Digite um numero entre 0 e 23: ");
			int opcaoum = teclado.nextInt();
			if(opcaoum <0 || opcaoum > 23){
				
				System.out.println("Numero digitado invalido");
				
			}else{
				if(opcaoum >= 0 && opcaoum <= 6){
					System.out.println("zzzzz");
					}else{
						if(opcaoum >= 7 && opcaoum <= 11){
					System.out.println("Bom dia");
				}else{
						if(opcaoum >= 12 && opcaoum <= 17){
					System.out.println("Boa tarde");
				}else{
						if(opcaoum >= 18 && opcaoum <= 23){
					System.out.println("Boa noite");
				}
					}
					}
						}
				}
			
			
		}else{
			int opcaodois = (int) (Math.random() * 23);
			
			System.out.println("Seu numero aleatorio e: " + opcaodois);
			
				if(opcaodois >= 0 && opcaodois <= 6){
					System.out.println("zzzzz");
					}else{
						if(opcaodois >= 7 && opcaodois <= 11){
					System.out.println("Bom dia");
				}else{
						if(opcaodois >= 12 && opcaodois <= 17){
					System.out.println("Boa tarde");
				}else{
						if(opcaodois >= 18 && opcaodois <= 23){
					System.out.println("Boa noite");
				}
					}
					}
						}
				}
			
			}
		
		
	}


