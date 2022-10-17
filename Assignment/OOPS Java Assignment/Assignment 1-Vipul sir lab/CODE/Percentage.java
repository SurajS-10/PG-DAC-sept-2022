import java.util.Scanner;

public class Percentage
{
	/*static int s(S1,S2,S3,S4,S5)
		{
			int S = S1+S2+S3+S4+S5;
			return S;
		}*/
	static double percent(int s){
			double percent = (s*100)/500;
			return percent;
		}
	public static void main(String args[])
	{
		System.out.println("All marks should be out of 100 ");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks of subject 1 : ");
		int S1 = sc.nextInt();
		System.out.println("Enter the marks of subject 2 : ");
		int S2 = sc.nextInt();
		System.out.println("Enter the marks of subject 3 : ");
		int S3 = sc.nextInt();
		System.out.println("Enter the marks of subject 4 : ");
		int S4 = sc.nextInt();
		System.out.println("Enter the marks of subject 5 : ");
		int S5 = sc.nextInt();
		
		int s = S1+S2+S3+S4+S5;
		System.out.println("sum : "+s);
		//int percent = (sum*100)/500;
		//double p1 = new percent(sum);
		System.out.println("Percentage marks = "+ percent(s) +"%");
		
		
		
	}
}