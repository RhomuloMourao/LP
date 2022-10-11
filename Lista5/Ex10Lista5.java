/*
 * Ex10Lista5.java
 
 */
//Rhomulo Mourao Caitano dos Santos
import java.util.Scanner;
public class Ex10Lista5 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu salario: ");
		double salario = teclado.nextDouble();
		
		System.out.print("Digite o valor de suas vendas: ");
		double valordasvendas = teclado.nextDouble();
		
		
		if(salario < 0 || valordasvendas < 0 ){
			
			System.out.println("Valor invalido!");
			}else{
		if(valordasvendas <= 1500.00){
			
			System.out.println("Seu salario este mes foi de: " + (salario +((valordasvendas * 3.0)/100.0)));
			
			}else{
				
				System.out.println("Seu salario este mes foi de: " + (salario + ((1500 * 3.0)/100.0) + (((valordasvendas - 1500.0 )* 5.0)/100.0) ) );
				}
		}
		
	}
}

