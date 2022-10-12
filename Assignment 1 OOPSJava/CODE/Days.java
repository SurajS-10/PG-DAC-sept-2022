

import java.util.Scanner;

class Days{
	public static void main(String args[]){
		System.out.println("Enter the Number of days");
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();	//days =670
		int y = days/365;			//year = 670/365 =1 -->since int datatype
		int m = (days%365)/30;		//month =(670%365)=305/30=10 -->since int datatype
		int d = (days%365)%30;		//days	=(670%365)=305%30=5 -->remainder
		
		System.out.println(y+" Year(s)");
		System.out.print(m+" Month(s)");
		System.out.print(d+" Day(s)");
	}
}