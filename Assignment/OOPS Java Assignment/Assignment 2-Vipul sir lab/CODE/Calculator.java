import java.lang.Math;
import java.util.Scanner;

class Calculator2
{
	
	static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1,num2);
	}
	
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	
	
}	
	
public class Calculator
{	
	public static void main(String args[])
	{
		//System.out.println("Enter the numbers: ");
		//Scanner sc = new Scanner(System.in);
		//double a = sc.nextDouble();
		//int b = sc.nextInt();
		//System.out.println(Calculator2.powerInt(a,b));
		//System.out.println(Calculator2.powerDouble(a,b));
		
		System.out.println(Calculator2.powerInt(10,2));
		System.out.println(Calculator2.powerDouble(20.0,2));
	}
}