package exceptions;

class Demo extends Exception
{
	public Demo()
	{
		 System.out.println("Arithematic exception");

	}
}
public  class CustomException 
{
	
	 public static void main(String[] args) throws Exception
	   {
		 System.out.println("connection 1 establised");
		 
		 try {
			 throw new Demo();

			 
		 }
		 
		 catch (Demo e)
		 {
			 System.out.println("catch block");


		 }
		 
		 
		 System.out.println("connection 1 terminated");
		 
	   }

}


