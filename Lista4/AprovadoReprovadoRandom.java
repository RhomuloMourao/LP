/*
 * AprovadoReprovadoRandom.java
 
 */
//Rhomulo Mourao Caitano dos Santos

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
			int nota = (int)(Math.random() * 10);
			
			System.out.println(nota);
			
			if(nota<6){
				System.out.println("Reprovado");
				}else{
					System.out.println("Aprovado");
					}
			
			
		
	}
}

