import java.io.*;
import java.util.*;

class DisplayNoOfDir
{
	public static void main(String args[]) throws Exception
	{
		int count=0;
		File f = new File("C:/");
		String s[]=f.list();
		
		for(String s1 :s)
		{
			File f1 = new File(f,s1);
			if(f1.isDirectory())
			{
				count++;
				System.out.println(s1`);
			}
		}
	System.out.println("the number of directory are :"+count);	
	}
}