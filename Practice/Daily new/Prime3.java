import java.util.Scanner;

class Prime3{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int x = sc.nextInt();
		if(isPrime(x)){
			System.out.println(x+" is a prime number");
		}else{
			System.out.println(x+" is not a prime number");
		}
		
		
	}
	public static boolean isPrime(int x){
			if(x<=1){
				return false;
			}
			for(int i=2;i<Math.sqrt(x);i++){
				if(x%i==0){
					return false;
				}
			}
			return true;
		} 
}