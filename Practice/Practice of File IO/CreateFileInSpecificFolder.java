import java.io.*;
import java.util.*;

class CreateFileInSpecificFolder
{
	public static void main(String args[]) throws Exception
	{
		File f = new File("C:/DAC JUHU/Lectures Material/OOPS With JAVA/Day_17/Demo Directory","Test3.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
	}
}