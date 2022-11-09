class P12{
	public static void main(String args[]){
		int i,j;
		int c=64;
		
		for(i=1; i<=6; i++){
			for(j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print((char)(j+c)+" ");
			}
			System.out.println();
		}
	}

}