import java.io.*;

class PrintWriterDemo1{
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("PWDemo.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println(99);
		pw.println(true);
		pw.println("Cdac is fun");
		pw.println(10.5);
		pw.println('x');
		pw.close()
	}
	
}