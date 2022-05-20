package Stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.NullPointerException;



class BufferInputStreams
{
	public static void main (String args []) throws IOException 
	{
		
		String path = "/Users/apple/Desktop/Femo";
		
			
		FileInputStream stream  = null;
		BufferedInputStream bin  = null;

		
		try
		{

			File obj = new File (path);
		   stream = new FileInputStream(obj);
			 bin = new BufferedInputStream(stream);
		   			
			//byte b[]=s.getBytes();
			
			
			//System.out.println(stream.read());
			System.out.println(bin.read());

			
		}
		catch (NullPointerException e)
		{
			
		}
		catch (Exception e)
		{
			
		}
	
//		finally
//		{
//		     stream.close();
//		     bin.close();
//
//
//		}
		
	   }

	
	}

