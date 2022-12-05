/*
 * Ex25Lista7.java
 
 */
//Rhômulo Mourão Caitano dos Santos

import java.util.Scanner;
public class Ex25Lista7 {
	
	public static void main (String[] args) {
	Scanner tecladoSTR = new Scanner(System.in);
		
	String senha = "";
	String simbolos = "!@#$%&*()+";
	int tamanho = 10, 
	temTerLetras = 3, 
	qntdLetras = 0,
	temTerNumeros = 3,
	qntdNumeros = 0,
	temTerSimbolos = 2,
	qntdSimbolos = 0;
	
	boolean tamanhoOk = false;
	boolean letrasOk = false;
	boolean numerosOk = false;
	boolean simbolosOk = false;
	do{
		System.out.print("Entre com a senha: ");
		senha = tecladoSTR.nextLine();
		
		//Tamanho
		tamanhoOk = (senha.length() >= tamanho);
			
		//Letras
		
		qntdLetras= 0;
		for(int i = 0; i< senha.length(); i++){
				
			if(senha.toLowerCase().charAt(i) >= 'a' && senha.toLowerCase().charAt(i) <= 'z'){
					qntdLetras++;
					
					}
				}
				
				letrasOk = (qntdLetras >= temTerLetras);
				//Numeros
				qntdNumeros= 0;
			for(int i = 0; i< senha.length(); i++){
				
				if(senha.charAt(i) >= '0' && senha.charAt(i) <= '9'){
					qntdNumeros++;
					
					}
				}
				numerosOk = (qntdNumeros >= temTerNumeros);
				
				//Simbolos
				
				qntdSimbolos = 0;
				for(int i = 0; i< senha.length(); i++){
				
					for(int j = 0 ; j< simbolos.length(); j++){
						
						if(senha.charAt(i) == simbolos.charAt(j)){
							qntdSimbolos++;
							
					}
				}
			}
				simbolosOk = (qntdSimbolos>= temTerSimbolos );
				
				//Deixar bonito
				System.out.println("\nREGRAS");
				System.out.println("Tamanho " + tamanho + ": \t" + senha.length() + "(" + (tamanhoOk?"ok":"x") + ")");
				System.out.println("Letras " + temTerLetras + ": \t" + qntdLetras + "(" + (letrasOk?"ok":"x") + ")");
				System.out.println("Numeros " + temTerNumeros + ": \t" + qntdNumeros + "(" + (numerosOk?"ok":"x") + ")");
				System.out.println("Simbolos " + temTerSimbolos + ": \t" + qntdSimbolos + "(" + (simbolosOk?"ok":"x") + ")");
			if(!tamanhoOk || !letrasOk || !numerosOk || !simbolosOk){
			
			System.out.println("Senha reprovada tente novamente...\n");
			
			}else{
		System.out.println("Senha aprovada parabens\n");

				}
			}while(!tamanhoOk || !letrasOk || !numerosOk || !simbolosOk);
		
	}
}

