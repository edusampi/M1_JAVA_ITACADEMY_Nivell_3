public class Nivell3 {
	
	public static void main(String args[]) {
	
		
//INICIALITZAR ARRAY -----------------------------------
		 int nombres[] = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};


		 
// IMPRESSIÓ ARRAY INICIAL -----------------------------		 
        System.out.println("ARRAY INICIAL");
        for(int i=0; i<nombres.length; i++)
               System.out.println(nombres[i]);

        
        
// IMPRESSIÓ ARRAY INVERTIT -----------------------------
        
        System.out.println();
        System.out.println("ARRAY INVERTIT");
        for(int i=nombres.length-1; i>=0; i--)
               System.out.println(nombres[i]);
	}
			
}


