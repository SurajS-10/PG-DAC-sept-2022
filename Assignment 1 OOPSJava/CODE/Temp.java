// c =[5*(f-32)/9]

import java.util.Scanner; 

class Temp{
	
	public static void main(String args[]){
		System.out.println("Enter the temperature in Farenheit=");
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		
		double x = f-32; 
		double c = (5*x)/9;
		System.out.println("Temperature in Farenheit is = "+f+" °F");
		System.out.println("Temperature in Celsius is = "+c+" °C");
		
	
	}
}