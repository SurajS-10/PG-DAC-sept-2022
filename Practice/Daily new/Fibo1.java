//0 1 1 2 3 

import java.util.Scanner;

class Fibo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int i = sc.nextInt();
		
		int n1=0,n2=1,n3;
		System.out.println("Series is....");
		System.out.print(n1+" "+n2);
		for(int j=2;j<i;j++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
		System.out.print(" "+n3);
		}
		
	}

}