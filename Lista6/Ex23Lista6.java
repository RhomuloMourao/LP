/*
 * Ex23Lista6.java
 
 */
//Rhômulo Mourão caitano dos Santos

import java.util.Scanner;
public class Ex23Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int i = 0;
		int numeroDeFilhos;
		double mediaDeFilhos = 0;
		double somaFilhos = 0;
		double quantidadeDePessoas = 0;
		double pessoasPoucoSalario = 0;
		double porcentagemPessoasPoucoSalario;
		double salario = 0 ;
		double somaSalario = 0;
		double mediaDeSalario;
		double maiorSalario = 0;
		
		
		
		do{
			
			
			System.out.print("Digite o numero de filhos: ");
			numeroDeFilhos = teclado.nextInt();
			
			System.out.print("Digite seu salario: ");
			salario = teclado.nextDouble();
			


			if(salario >= 0){
				somaSalario = somaSalario + salario;
				somaFilhos = somaFilhos + numeroDeFilhos;
				quantidadeDePessoas++;
				
				
				
			if(salario < 150.00){
				
				pessoasPoucoSalario++;
				
				
				
				}
			}
			if(i == 1){
				
				maiorSalario = salario;
				}
				
				if(salario > maiorSalario){
					
					maiorSalario = salario;
					
					}
				
			
			}while(salario >= 0);
		
		mediaDeSalario = somaSalario / quantidadeDePessoas;
		mediaDeFilhos = somaFilhos / quantidadeDePessoas;
		porcentagemPessoasPoucoSalario = ((pessoasPoucoSalario / quantidadeDePessoas) * 100.00); 
		
		System.out.println("Media de Salario: " + mediaDeSalario);
		System.out.println("Media de Filhos: " + mediaDeFilhos);
		System.out.println("Maior salario: " + maiorSalario);
		System.out.println("Porcentagem de pessoas com salario menor que 150.00: " + porcentagemPessoasPoucoSalario +"%" );
	
	
	
}
	}


