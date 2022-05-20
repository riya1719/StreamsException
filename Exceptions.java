package exceptions;

public class Exceptions {
	
	 public static void main(String[] args) 
	   {
		 try
		 {
			 System.out.println("Try Block");

			int a = 5;
			int b = a/0;
			
			System.out.println("continue try block");
			 // never executed if exception occurred before
			
		 }
		
		 catch (Exception e)
		 {
			 System.out.println("Catch Block");
		 }
		 
		System.out.println("Program continue ");

		  
		
		 
		 
		
		
		 
		 
		 
		 
		 
		 
		 
		
	   }

}
