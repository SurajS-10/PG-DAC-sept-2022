import java.util.Scanner;
class Swap{
	/*static int s(int a, int b){
		a=a+b;	//30
		b=a-b;	//10	
		a=a-b;
		return a;
		return b;
	}*/
	public static void main(String args[]){
		System.out.println("Enter the values a & b = ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//int a =10; 
		//int b =20;
		System.out.println("Values before a = "+a+"b = "+b);
		a=a+b;	//30
		b=a-b;	//10	
		a=a-b;//20
		System.out.println("Values after a = "+a+"b = "+b);
	}
}