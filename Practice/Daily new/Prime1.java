import java.util.Scanner;

class Prime1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int x = sc.nextInt();
		int flag=0;
		int y=x/2;
		
		if(x==0||x==1){
			System.out.println("Not a prime number");
		}
		else{
			for(int i=2;i<=y;i++){
				if(x%i==0){
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(x+" is a prime number");
			}
		}
	}

}