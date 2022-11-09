import java.util.Scanner;

class P23{
	public static void main(String args[]){
		int n,i,j ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		n = sc.nextInt();
		
		
		for( i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(i%2!=0){
				if( j%2!=0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
				}else{
					if( j%2==0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
				}
			}
			System.out.println(" ");
		}
	
	}

}