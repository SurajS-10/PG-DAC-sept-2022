import java.io.*;

class BufferedWriterDemo1{
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("BWDemo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(99);
		bw.write("dac is the best");
		bw.newLine();
		char[] ch1 = {'1','2','3'};
		bw.write(ch1);
		bw.newLine();
		bw.write("You are the best");
		bw.write("!!!!");
		bw.newLine();
		bw.flush();
		bw.close();
	}
}