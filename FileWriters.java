package Stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
	
	public static void main (String args []) throws IOException 
	{
		
		String path = "/Users/apple/Desktop/Demo";
		
		File obj = null;		
		FileWriter stream  = null;
		BufferedWriter bout  = null;

		
		try
		{

		   obj = new File (path);
		   stream = new FileWriter (obj);
		   bout = new BufferedWriter(stream);
		   
			
			String s= "Welcome to javaTpoint. lets catch up";
			
			//byte b[]=s.getBytes();
			
			bout.write(6566);
			
			
		//	bout.flush();
			
		
		}
	
		finally
		{
		   bout.close();

		}
		
	   }

}
