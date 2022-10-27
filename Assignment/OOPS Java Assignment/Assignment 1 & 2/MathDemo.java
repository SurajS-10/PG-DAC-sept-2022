import java.util.*;
class MathOperator{

	static int add(int a, int b)
	{
		return (a+b);
	}
	
	static int sub(int a, int b)
	{
		return (a-b);
	}
	
	static int mul(int a, int b)
	{
		return (a*b);
	}
	
	static int power(int a, int b)
	{
		return (int)(Math.pow(a,b));
	}
	
}

class MathDemo
{
	public static void main(String args[])
	{
		System.out.println("Enter the two numbers:");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		MathOperator m1 = new MathOperator();
		System.out.println("Enter the choice which Operation to be performed:\n1.Addition\n2.Substraction\n3.Multiplication\n4.power\n5.ALL");
		int choice = sc.nextInt();
		
		switch(choice){
		
		case 1 :
				int n1= m1.add(a,b);
				System.out.println("Addition is "+n1);
				break;
		case 2 :
				int n2= m1.sub(a,b);
				System.out.println("Substraction is "+n2);
				break;
		case 3 :
				int n3= m1.mul(a,b);
				System.out.println("Multiplication is "+n3);
				break;
		case 4 :
				int n4= m1.power(a,b);
				System.out.println("Power Solution is "+n4);
				break;
		case 5 :
				n1= m1.add(a,b);
				n2= m1.sub(a,b);
				n3= m1.mul(a,b);
				n4= m1.power(a,b);
				System.out.println("Addition is "+n1+"\nSubstraction is "+n2+"\nMultiplication is "+n3+"\nPower Solution is "+n4);
				break;
		default:
				System.out.println("That the wrong choice");
	}
	}
}