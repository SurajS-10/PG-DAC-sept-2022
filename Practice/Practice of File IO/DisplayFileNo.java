import java.io.*;
import java.util.*;

class DisplayFileNo
{
	public static void main(String args[]) throws Exception
	{
		int count =0;
		
		File f = new File("C:/DAC JUHU");
		String s[] = f.list();
		
		for(String s1: s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println("The total number :"+count);
	}
	
}