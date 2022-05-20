package Stream;

import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Deserialization {
	
	public static void main (String args []) throws IOException 
	{
		
		String path = "/Users/apple/Desktop/Demo";
		
			
		FileInputStream stream  = null;
		ObjectInputStream bin  = null;
		
		Student obj ;

		
		try
		{

			File file = new File (path);
		    stream = new FileInputStream(file);
			bin = new ObjectInputStream(stream);
			obj = (Student)bin.readObject();
		   			
			//byte b[]=s.getBytes();
			
			
			//System.out.println(stream.read());
			System.out.println(obj);
			System.out.println(obj.getname());
			System.out.println(obj.getage());

			
			

			
		}
		catch (NullPointerException e)
		{
			
		}
		catch (Exception e)
		{
			
		}
	

}
}
