/*
 * Ex11Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

import java.util.Scanner;
public class Ex11Lista6 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double qntdDeAlunos, notaAluno;
		double soma = 0;
		
		System.out.print("Quantidade de aluno: ");
		qntdDeAlunos = teclado.nextInt();
		
		
		for(int a = 1 ; a<= qntdDeAlunos; a++){
			
			System.out.print("Digite a nota do " + a + " Aluno" );
			notaAluno = teclado.nextDouble();
			
			soma = soma + notaAluno;
			}
		
		System.out.print("Media aritmetica: " + (soma/qntdDeAlunos));
		
	}
}

