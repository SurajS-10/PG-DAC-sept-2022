import java.util.Scanner;

public class PrintSeries{
	public static void print(int x,int count){
		if(x==0){
			return;			
		}
		System.out.print(count+" ");
		print(x-1,count+1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements to print");
		int n = sc.nextInt();
		print(n,1);
	}
}