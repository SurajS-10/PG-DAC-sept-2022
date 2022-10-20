import java.io.*;

class PrintWriterDemo2{
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("PWDemo1.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(83);
		pw.println("uraj");
		pw.println(10);
		pw.println('A');
		pw.println(true);
		pw.println(10.5);
		pw.flush();
		pw.close();
	}
}