import java.io.*;

class BufferedReaderDemo{
	public static void main(String args[]) throws IOException{
		FileReader fr = new FileReader("BWDemo.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	} 
}