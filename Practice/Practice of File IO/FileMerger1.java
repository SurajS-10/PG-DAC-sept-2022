import java.io.*;

class FileMerger1{
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("File1.txt");	//Created file to copy content
		PrintWriter pw = new PrintWriter(fw);			
		//to read file 1
		BufferedReader br = new BufferedReader(new FileReader("PWDemo.txt"));
		String line = br.readLine();
		while(line!=null){
			pw.println(line);
			line = br.readLine();
		}
		//to read 2nd file
		br= new BufferedReader(new FileReader("FWDemo.txt"));
		line = br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
		//to read third file
		br= new BufferedReader(new FileReader("BWDemo.txt"));
		line = br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}