package exceptions;

public class TryCatchInsideFinally {
	
	 public static void main(String[] args) 
	   {
		 try
		 {
			 System.out.println("Try Block1");
				int a = 5;
	
			 int b = a/1;

			
		 }
		 
		
		 finally
			 
			 {
			 
			 System.out.println("Finally Block");

			 try
			 {
				 System.out.println("Try Block2");

				int a = 5/0;
				
			 }
			 
			 
			 catch (Exception e)
			 {
				 System.out.println("Catch Exception" + e);

			 }
			 
			 System.out.println(" Remaing Task in Finally Block");


			 }
		 
		 System.out.println("Remaining Task in main ");

	   }	 
		 

}
