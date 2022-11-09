import java.util.Scanner;

class P8{
	public static void main(String args[]){
		int rows,i,j ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		rows = sc.nextInt();
		
		for( i=1;i<=rows;i++){
			for(j=1;j<=i;j++){
				if( j%2!=0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
				
			}
			System.out.println(" ");
		}
	
	}

}