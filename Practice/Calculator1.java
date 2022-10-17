import java.lang.Math;
import java.util.Scanner;

class Calculator1
{
	
	
	static double powerInt(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the numbers: ");
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		double c =sc.nextDouble();
		
		System.out.println(powerInt(c,b));
	}
}