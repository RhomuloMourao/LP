/*
 * ADivisivelPorBRandom.java
 
 */
//Rhomulo Mourao Caitano dos Santos

public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 20);
		
		System.out.println("Valor do a: " + a);
		System.out.println("Valor do b: " + b);
		
		
		if(a%b == 0){
			
			System.out.println("E divisivel.");
			
			}else{
				
				System.out.println("Nao e divisivel.");
				
			}
		
		
	}
}

