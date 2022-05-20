package exceptions;

public class HeirharchyMethodsException {
	
	void fun4() throws Exception
	{
		 System.out.println("connection 4 establised");
				
			 int a = 5;
			 int b = a/0; // error
			 
			 System.out.println("connection 4 terminated");

		 }
	
	void fun3() throws Exception
	{
		 System.out.println("connection 3 establised");
		 
		 HeirharchyMethodsException obj = new HeirharchyMethodsException();
		 obj.fun4();
			 
		System.out.println("connection 3 terminated");
		 }
	
	void fun2() throws Exception
	{
		 System.out.println("connection 2 establised");
		 try {
		 HeirharchyMethodsException obj = new HeirharchyMethodsException();
		 obj.fun3();
		 	
		 }
		 
		 catch (Exception e)
		 {
			 System.out.println("Exception Handle in fun2");
		 }
			 
			 System.out.println("connection 2 terminated");

			
		 }
	
	void fun1() throws Exception
	{
		 System.out.println("connection 1 establised");
		 
		 HeirharchyMethodsException obj = new HeirharchyMethodsException();
		 obj.fun2();
		 
		System.out.println("connection 1 terminated");

			
		 }
		 
	
	 public static void main(String[] args) 
	   {
		 System.out.println("connection main establised");
		 
		 try {
			 
			 HeirharchyMethodsException obj = new HeirharchyMethodsException();
			 obj.fun1();
		 }
		 
		 catch (Exception e)
		 {
			 System.out.println("Exception Handle in main");
		 }
		 
		 System.out.println("connection main terminated");
		 
		 
		 

	   }

}
