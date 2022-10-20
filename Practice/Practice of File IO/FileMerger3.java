import java.io.*;

class FileMerger3{
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("File2.txt"); 
		PrintWriter pw = new PrintWriter(fw);
		BufferedReader br1 = new BufferedReader(new FileReader("FWDemo.txt"));
		String line1 = br1.readLine();
		BufferedReader br2 = new BufferedReader(new FileReader("BWDemo.txt"));
		String line2 = br2.readLine();
		while(line1!=null || line2!=null){
			if(line1!=null){
			pw.println(line1);
			line1 = br1.readLine();
			}
			if(line2!=null){
			pw.println(line2);
			line2 = br2.readLine();
			}
		}
		
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
		
	}
}