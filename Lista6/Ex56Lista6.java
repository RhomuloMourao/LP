/*
 * Ex56Lista6.java
 
 */
//Rhomulo Mourao Caitano dos Santos

public class Ex56Lista6 {
	
	public static void main (String[] args) {
		
		int a, i = 1;
		
				int divisores = 0;
				for(i = 1 ; i <=900 ;i++){
					divisores = 0;
					
		for(a = 1 ; a<=(i/2) ; a++){
			
			if(i % a == 0){
				divisores += a;
				
				}
			
			
			}
			if(divisores ==i){
			
			System.out.println("\nO numero " + i + " e perfeito");
			}
		}
		
	}
}

