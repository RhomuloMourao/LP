/*
 * ExibeNumeroAleatorio.java

 */
// Rhomulo Mourao Caitano Dos Santos

public class ExibeNumeroAleatorio {
	
	public static void main (String[] args) {
		
		double numeroaleatorio = 0;
		
		numeroaleatorio = (int) (Math.random() * 100 + 1);
		System.out.println(numeroaleatorio);
		
	}
}

