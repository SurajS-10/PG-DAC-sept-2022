import java.util.Scanner;

class Power{
	public static int power(int num1, int num2){
		if(num2==1)
		return num1;
		else{
			int result = num1 * power(num1,(num2-1));
			return result;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println("Solution is "+power(n1,n2));
	}
}