import java.io.*;

class FileReaderDemo1
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("FWDemo.txt");
		int i = fr.read();
		while (i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		
	}
}