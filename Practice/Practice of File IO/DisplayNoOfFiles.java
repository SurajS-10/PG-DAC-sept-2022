import java.util.*;
import java.io.*;

class DisplayNoOfFiles
{
	public static void main(String args[]) throws Exception
	{
		int count=0;
		File f = new File("c:/DAC JUHU");
		
		String s[] =f.list();
		
		for(String s1: s)
		{
			File f1 = new File(f,s1);
			if(f1.isFile())
			{
				count++;
				System.out.println(s1);
			}	
		}
	System.out.println("The number of file :"+count);	
	}
}