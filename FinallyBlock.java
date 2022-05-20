package exceptions;

public class FinallyBlock {
	
	void fun1() 
	{
		 System.out.println("connection 2 establised");
		 
		try {
			

			 int a = 5;
			 int b = a/0; //error
			
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
			 FinallyBlock obj = new FinallyBlock();
			 obj.fun1();
		 }
		 
		 catch (Exception e)
		 {
			 System.out.println("Exception Handle in main");
		 }
		 
		 System.out.println("connection 1 terminated");
		 
		 
		 
		 
		 

	   }

}
