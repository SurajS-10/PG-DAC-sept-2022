/*import java.util.Scanner;

class DigitCount{
	public static int digitCount(int n, int num){
		if(n<=0){
			return num;
		}
		return digitCount(n/10,num+1);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		System.out.println("No.of Digits :"+digitCount(x,0));
	}
}

*/























import java.util.Scanner;

class DigitCount{
	public static int digitCount(int n, int num){
		if(n<=0){
			return num;
		}
		return digitCount(n/10,num+1);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		System.out.println("No. of Digit is: "+digitCount(x,0));
	}
}