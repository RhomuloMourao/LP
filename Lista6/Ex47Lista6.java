/*
 * Ex47Lista6.java

 */
//Rhômulo Mourão Caitano dos Santos

public class Ex47Lista6 {
	
	public static void main (String[] args) {
		
		int contadorPrimo = 0;
		
		
		for(int a = 1; a<= 100 ; a++){
			
			contadorPrimo = 0;
			for(int b = 1 ; b<=a ; b++){
				
			if(a % b == 0){
				
				contadorPrimo++;
				
				}
				
			}
		if(contadorPrimo == 2){
				System.out.println(a);
			}
		}
	}
}

