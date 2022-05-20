package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
	
	public static void main (String args []) throws IOException 
	{
		
		String path = "/Users/apple/Desktop/Femo";
		
		File obj = null;		
		FileReader stream  = null;
		BufferedReader bin  = null;

		
		try
		{

		   obj = new File (path);
		   stream = new FileReader (obj);
			
		   bin = new BufferedReader(stream);
		   
			
			//String s= "Welcome to javaTpoint.";
			//byte b[]=s.getBytes();
			
//	        stream.read();
//			System.out.println(stream.read());
			
			//bin.readLine();
			 System.out.println(bin.readLine());

			
		}
	
		finally
		{
		     bin.close();

		}
	   }

}
