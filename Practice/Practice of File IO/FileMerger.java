import java.io.*;

class FileMerger{
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("File3.txt"); 
		PrintWriter pw = new PrintWriter(fw);
		//to read file 1
		BufferedReader br = new BufferedReader(new FileReader("FWDemo.txt"));
		String line = br.readLine();
		while(line!=null){
			pw.println(line);
			line = br.readLine();
		}
		//to read another file
		br = new BufferedReader(new FileReader("BWDemo.txt"));
		line = br.readLine();
		while(line !=null){
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		
	}
}