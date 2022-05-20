package Stream;

import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

class Student implements Serializable
{
	private String name ;
	private transient int age ;
	
	Student (String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}
	
	String getname()
	{
		return this.name;
	}
	
	int getage()
	{
		return this.age;
	}
	
}

public class Serializations 
{
	
	public static void main (String args []) throws IOException 
	{
		Student obj = new Student ("Riya" , 28);
		
        String path = "/Users/apple/Desktop/Demo";
		
		File file = null;		
		FileOutputStream stream  = null;
		ObjectOutputStream bout  = null;

		
		try
		{

		   file = new File (path);
		   stream = new FileOutputStream (file);
			 bout = new ObjectOutputStream(stream);
		   			
			//byte b[]=s.getBytes();
//			bout.write(b);
			 bout.writeObject(obj);
			
			
			bout.flush();
			
			
		}
		finally
		{
		     stream.close();
		     bout.close();


		}
		
	}
	
}
