package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;




import java.io.IOException;



public class BufferOutputStrams 
{
	public static void main (String args []) throws IOException 
	{
		
		String path = "/Users/apple/Desktop/Demo";
		
		File obj = null;		
		FileOutputStream stream  = null;
		BufferedOutputStream bout  = null;

		
		try
		{

		   obj = new File (path);
		   stream = new FileOutputStream (obj);
			 bout = new BufferedOutputStream(stream);
		   
			
			String s= "Welcome to javaTpoint.";
			
			//byte b[]=s.getBytes();
			
			stream.write(6566);
			bout.write(65);
			
			
			bout.flush();
			
			
		}
	
		finally
		{
		     stream.close();
		     bout.close();


		}
	   }

	
}
