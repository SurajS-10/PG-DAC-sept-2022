// Gross = Basic+ HRA+ DA
//if basic < 10000 -->HRA = 10% of basic & DA = 90%
//if basic >= 10000 -->HRA = 2000 & DA = 98%

import java.util.Scanner;

class Salary{

	public static void main(String args[]){
	System.out.println("Enter the Basic Salary = ");
	Scanner sc = new Scanner(System.in);
	int HRA,DA,Total;
	
	int BS = sc.nextInt();
	
		if(BS<10000)
		{
			HRA =(BS * 10)/100;
			DA = (BS * 90)/100;
			Total = BS + HRA + DA;	
		}
		else 
		{
			HRA = 2000;
			DA = (BS * 98)/100;
			Total = BS + HRA + DA;
		}
		
		System.out.println("Total Salary = "+Total);
	} 
}
