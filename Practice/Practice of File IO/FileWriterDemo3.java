import java.io.*;

class FileWriterDemo3
{
	public static void main(String args[]) throws IOException
	{
		FileWriter f = new FileWriter("FWDemo.txt",true); //<=== Change to add data below existing data
		
		f.write("**What's Up!!\nYou Beautiful People**");
		f.write('\n');
		f.write("**How are you Doing???**");
		char[] ch1={'1','0'};
		f.write('\n');
		f.write(ch1);
		f.write('=');
		f.write("Favourite Number");
		f.write('\n');
		f.flush();
		f.close();
	}
}