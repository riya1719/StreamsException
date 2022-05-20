/*
 * 
 */
package exceptions;

public class NestedTrywithFinally {
	
	public static void main(String[] args) 
	   {
		 try
		 {
			 System.out.println("Try Block1");

			int a = 5;
			int b = a/0;
			
			
			try {
				 System.out.println("Try  Block2");
				 
				 b= a+2;

			}
			 finally
			 
			 {
				 System.out.println("Finally Block");

			 }
		 }
		 
		 
		 catch (Exception e)
		 {
			 System.out.println("Catch Block");
		 }
		 
		 System.out.println("Reaming Program in the main");

		
		
		 
		 
		 
		 
		 
		 
		 
		
	   }

}
