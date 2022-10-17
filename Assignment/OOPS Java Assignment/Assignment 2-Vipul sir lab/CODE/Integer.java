// breakdown of an Integer
import java.util.Scanner;



public class Integer{
	
static void Seperate(int num)
{
		
		int count = 0;
		int temp1=num;
		while(temp1!=0)
		{
			count++;
			temp1=temp1/10;
		}
		System.out.println("Count = "+count);
		
		for(int i=1;i<=count;i++)
		{
			int temp2 = num;
			int a = (count - i);
			int b = (int)Math.pow(10,a);
			//System.out.println("b = "+b);
			int c = (temp2/b%10);
			//System.out.println("c = "+c);
			int d = c*b;
			System.out.print(d);
			
			if(i==count)
				System.out.print(" ");
			else
				System.out.print(" + ");
		}
}
	public static void main(String args[])
	{
		System.out.println("Enter the number = ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(); 	//43018
		
		Seperate(n);
	}
}
