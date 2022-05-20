package exceptions;

public class TryReturn {
	
	static int sum(int a , int b)
	{
		
		try
		 {
			 System.out.println("Try Block1");
			 
			 
				return a/b;
		 }
		 
		 
		 catch (Exception e)
		 {

			 System.out.println("Catch Block");
				return a/b;

		 }

	}
	
	 public static void main(String[] args) 
	   {
		 
		int a =5;
		int b = 0;
		int result = sum(a,b);
		System.out.println("Result :" + result);
		System.out.println("End Program");
	   }
		

}
