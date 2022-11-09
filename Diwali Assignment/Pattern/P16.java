class P16{
	public static void main(String args[]){
		int i,j;
		for(i=1; i<=5; i++){
			for(j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=3; i<=7; i++){
			for(j=6;j>=i;j--){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(i=5; i<=9; i++){
			
			for(j=8;j>=i;j--){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=8; i<=12; i++){
			for(j=11;j>=i;j--){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}