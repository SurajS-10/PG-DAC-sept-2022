import java.util.*;
import java.io.*;
class CreateFile
{
	public static void main(String args[]) throws Exception 
	{
		File f = new File("abc1902022.txt");
		//File f = new File("Demo Directory","Test1.txt");
		File f1 = new File(f,"Test2.txt");
		System.out.println(f1.exists());
		//f1.createNewFile();
		f1.isFile();
		System.out.println(f1.exists());
		
		//boolean s = f.isFile();
		//System.out.println(s);
	}
}