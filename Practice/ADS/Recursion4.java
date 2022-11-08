//error

import java.util.Scanner;
class Recursion4
{
	static int fib(int n)
	{
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String args[])
	{
		/*
		System.out.println("Enter the number of fib series to be printed");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println(fib(6));
		}*/
		System.out.print(fib(6)+" ");
	}
}