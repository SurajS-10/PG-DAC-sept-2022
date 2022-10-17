

import java.util.Scanner;

class leap{
	public static void main(String args[]){
	System.out.println("Enter the year = ");
	Scanner sc = new Scanner(System.in);
	
	int y = sc.nextInt();
	int x;
	boolean c;
	x=(y%400==0)?(x=1):(y%100==0)?(x=0):((y%4==0)?(x=1):(x=0));
	 if(x==1){
		 c = true;
		 System.out.println(" "+c);
	 }
	 else{
		 c = false;
		 System.out.println(" "+c); 
	 }
	}
}