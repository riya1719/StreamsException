/*
 * 
 */
package exceptions;

class EligilbilityException extends Exception
{
	public EligilbilityException (String s)
	{

		super(s);	
		System.out.println("Exception");

	}

}
public class StudentAge
{
	void Check (int age, int weight) throws EligilbilityException
	{
		if ( age < 12 && weight < 40)
		{
			throw new EligilbilityException("Student is not eligible for registration");
		}
	}
	
	public static void main(String[] args) 
	   {
		StudentAge obj = new StudentAge ();
		
		try {
			obj.Check(14,110);
			System.out.println("No Exception");
		
		}
		
		catch (EligilbilityException ex)
		{
			System.out.println("Caught the Exception");
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Connection terminated for first case");

		}
		
		try {
			obj.Check(10,39);
			System.out.println("Exception");
		
		}
		
		catch (EligilbilityException ex)
		{
			System.out.println("Caught the Exception");
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Connection terminated for second case");

		}
		
		
		System.out.println("Program End");
	   }
}
