import java.io.*;

class FileReaderDemo2{
	public static void main(String args[]) throws IOException{
		File f = new File("FWDemo.txt");
		char ch1[] = new char[(int)f.length()];
		FileReader fr = new FileReader(f);
		fr.read(ch1);
		for(char ch2 : ch1)
		{
			System.out.print(ch2);
		}
	}
}