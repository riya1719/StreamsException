package exceptions;

public class Ducking {
	
	void fun1() throws Exception
	{
		 System.out.println("connection 2 establised");
		 
		 try {
			 int a = 5;
			 int b = a/0; // error
			 
			 
		 }
		 
		 catch (Exception e)
		 {
			 System.out.println("Catch block");

	         throw e;
		 }
		 
		
		 finally
		 
		 {
			 System.out.println("Connection 2 terminated");

		 }
		 
	}
	
	 public static void main(String[] args) 
	   {
		 System.out.println("connection 1 establised");
		 
		 try {
			 Ducking obj = new Ducking();
			 obj.fun1();
		 }
		 
		 catch (Exception e)
		 {
			 System.out.println("Exception Handle in main");
		 }
		 
		 System.out.println("connection 1 terminated");
		 
	   }

}
