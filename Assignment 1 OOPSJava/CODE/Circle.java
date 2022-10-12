//Area of circle = 3.142 * r * r
//Perimeter of circle = 2 * 3.142 * r

import java.util.Scanner;



public class Circle
{
	static double area(int r){
	return (3.142 * r * r);
	}

	double perimeter(int r){
	return (2 * 3.142 * r);
	}
	public static void main(String args[])
	{
		System.out.print("Enter the radius of circle in mm: ");
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		
		System.out.println("Enter 1--> Area.  2--> Perimeter. 3-->Both.   0--> Exit.");
		Scanner sc1 = new Scanner(System.in);
		int i= sc1.nextInt();
		
		
		if(i!=0)
		{
		switch(i){
		
		case 1:
				
				System.out.println("Area of circle with radius "+r+" is "+ area(r)+" mm");
				break;
		case 2:
				Circle p1= new Circle();
				System.out.println("Perimeter of Circle with radius "+r+" is "+ p1.perimeter(r)+" mm");
				break;
		case 3:
				Circle p2= new Circle();
				System.out.println("Area & Perimeter of Circle with radius "+r+" is "+ area(r)+" mm & " + p2.perimeter(r)+" mm");
				break;
		default:
				System.out.println("Selected Wrong option.");
				break;
		}
		System.out.println("Thank you!!");
		}
	}
}