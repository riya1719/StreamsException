package exceptions;

public class TryMultipleCatch {
	
	public static void main(String[] args) 
	   {
		 try
		 {
			 System.out.println("Try Block1");

			int a = 5;
			int b = a;
			
			
			int array [] = new int [5];
			
		    array [7] = 55/0; 
		    array [4] = 32;
		    array [1] = 32;  

		 }
		 
		 catch (ArrayIndexOutOfBoundsException ao)
		 {
			 System.out.println("Array Excp Block");
		 }
		 
		 catch (ArithmeticException ae)
		 {
			 System.out.println("Arithematic Excp Block");
		 }
		 
		 catch (NegativeArraySizeException se)
		 {
			 System.out.println("Negative Array Size Excp Block");
		 }
		 
		 catch (Exception e) 
		 {

			 System.out.println("Catch Block");
		 }
		 
		 
		 int c= 20;
		 int d = c/2;
		 System.out.println(d);

		 System.out.println("Program End");

		 
		 
	   }
	
	

}
