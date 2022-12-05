/*
 * Ex02Lista8.java
 
 * 
 */
//Rhômulo Mourão Caitano dos Santos

public class Ex02Lista8 {
	
	public static void main (String[] args) {
		
		int[] numeros = new int[15];
		
		
		
		for(int a = 0; a<15 ; a++){
			
		numeros[a] = (int) (Math.random() * 10)+1;
			
			}
			
		for(int b = 14; b>=0 ; b--){
			
			System.out.println("Indice " + b + ":" + numeros[b]);
			}
		
		
	}
}

