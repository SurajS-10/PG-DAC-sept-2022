import java.util.Scanner;

class Prime4{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int x = sc.nextInt();
		System.out.println("Enter the end number ");
		int y = sc.nextInt();
		for(int i=x;i<=y;i++){
		if(isPrime(i)){
			System.out.println(i+" is a prime number");
		}
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