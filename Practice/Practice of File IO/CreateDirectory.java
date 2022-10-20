import java.io.*;
import java.util.*;

class CreateDirectory
{
	public static void main(String args[])
	{
		File f = new File("Demo Directory");
		System.out.println(f.exists());
		//f.mkdir();
		f.isDirectory();
		System.out.println(f.exists());
		
	}
}