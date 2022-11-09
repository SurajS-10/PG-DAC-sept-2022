import java.util.Scanner;

class P7{
	public static void main(String args[]){
		int rows,column,i,j ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		rows = sc.nextInt();
		System.out.println("Enter the no. of column");
		column = sc.nextInt();
		
		for( i=1;i<=rows;i++){
			for(j=1;j<=column;j++){
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