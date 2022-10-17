// si = p*n*r/100

import java.util.Scanner;

class SI
{
	static double simple(int P,int R,int N){
	double simple=(P*R*N)/100;
	
	return simple;
	}
	public static void main(String args[])
	{
		System.out.println("*******************************");
		System.out.println("Calculating the Simple interest");
		System.out.println("*******************************");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the principle amount =");
		int P = sc.nextInt();
		System.out.println("Enter the rate of interest =");
		int R = sc.nextInt();
		System.out.println("Enter the number of years amount borrowed =");
		int N = sc.nextInt();
		
		//simple s =new simple();
		System.out.println("Simple interest = "+simple(P,R,N));
		
	}
}