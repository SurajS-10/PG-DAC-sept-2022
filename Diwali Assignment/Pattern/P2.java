import java.util.Scanner;
class P2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of rows : ");
		int n=sc.nextInt(); 
		for(int i=n;i>0;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
				
			}
			if(i==1 || i==n)
			for(int j=1;j<=i*2-1;j++){
			System.out.print("*");
			if(j==1)
				System.out.print("***");
			} else {
			for(int j=1;j<=i*2-1;j++){ 
				if(j==1 || j==i*2-1){
					System.out.print("*");
			}
			else
			System.out.print(" ");
			}
			}
			System.out.println();
		} 
	}
}