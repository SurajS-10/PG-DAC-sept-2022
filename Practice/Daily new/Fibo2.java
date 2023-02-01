//0 1 1 2 3 

import java.util.Scanner;

class Fibo2{
	static int n1=0,n2=1,n3=0;
		
	static void printFibo(int i){
		if(i>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibo(i-1);
		}
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int i = sc.nextInt();
		System.out.print(n1+" "+n2);
		printFibo(i-2);
		
		
	}

}