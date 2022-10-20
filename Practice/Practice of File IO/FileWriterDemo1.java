import java.io.*;
class FileWriterDemo1
{
	public static void main(String args[]) throws IOException
	{
		FileWriter fw = new FileWriter ("abc19102022.txt");
		fw.write(99);
		fw.write("dac is cool");
		fw.write('\n');
		char[] ch1 = {'W','E','L','C','O','M','E'};
		fw.write(ch1);
		fw.write(" on board");
		fw.flush();
		fw.close();
		
	}
}